package com.sb.tools;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
/**
 * FIXME : http://stackoverflow.com/questions/3289644/define-spring-jaxb-namespaces-without-using-namespaceprefixmapper
 * @author sbarberye
 *
 * @param <T>
 */
public class JaxbXmlConverter<T> implements Serializable {

	private static final long serialVersionUID = 7538923213217490006L;

	private static final String DEFAULT_ENCODING = "UTF-8";

	private boolean isXmlDeclarationEnabled = true;

	private String[] xsdLocations = null;

	private Set<Class<?>> registerClasses = new HashSet<Class<?>>();
	private DefaultNamespacePrefixMapper namespacePrefixMapper = new DefaultNamespacePrefixMapper();

	private XmlConverterListener listener = new DefaultXmlConvertListener();

	public T unmarshall(Node node) {
		try {
			return (T) createUnmarshaller().unmarshal(node);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public Document marshallToDocument(T data) {
		try {
			final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilderFactory.setNamespaceAware(true);
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			final Document document = documentBuilder.newDocument();
			createMarshaller().marshal(data, document);
			return document;
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public T unmarshall(String xml) {
		try {
			return unmarshall(new ByteArrayInputStream(xml.getBytes(DEFAULT_ENCODING)));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public T unmarshall(InputStream inputStream) {
		try {
			return (T) createUnmarshaller().unmarshal(inputStream);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public String marshall(T data) {
		StringWriter writer = new StringWriter();
		marshall(data, writer);
		return writer.toString();
	}

	public void marshall(T data, Writer writer) {
		Marshaller marshaller = createMarshaller();
		marshall(data, writer, marshaller);
	}

	private void marshall(T data, Writer writer, Marshaller marshaller) {
		try {
			marshaller.marshal(data, writer);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean isXmlDeclarationEnabled() {
		return isXmlDeclarationEnabled;
	}

	public void setXmlDeclarationEnabled(boolean isXmlDeclarationEnabled) {
		this.isXmlDeclarationEnabled = isXmlDeclarationEnabled;
	}

	private Unmarshaller createUnmarshaller() {
		try {
			JAXBContext context = createJaxbContext();
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Schema schema = null;
			if (xsdLocations != null) {
				schema = createSchema(xsdLocations);
			}
			unmarshaller.setSchema(schema);
			unmarshaller.setListener(new DefaultUnmarshalListener(listener));
			return unmarshaller;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public void registerPrefix(String namespaceUri, String prefix) {
		namespacePrefixMapper.registerPrefix(namespaceUri, prefix);
	}

	private Schema createSchema(String[] xsdLocations) {
		final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		Source[] sources = new Source[xsdLocations.length];
		for (int i = 0; i < xsdLocations.length; i++) {
			String xsdLocation = xsdLocations[i];
			Source source = new StreamSource(getClass().getResourceAsStream(xsdLocation));
			sources[i] = source;
		}
		try {
			return sf.newSchema(sources);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		}
	}

	private Marshaller createMarshaller() {
		try {
			JAXBContext context = createJaxbContext();
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, DEFAULT_ENCODING);
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", namespacePrefixMapper);
			marshaller.setListener(new DefaultMarshalListener(listener));
			return marshaller;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	private JAXBContext createJaxbContext() {
		try {
			return JAXBContext.newInstance(registerClasses.toArray(new Class[registerClasses.size()]));
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public void setXmlSchemaDefinition(String[] xsdLocations) {
		this.xsdLocations = xsdLocations;
	}

	public String[] getXmlSchemaDefition() {
		return xsdLocations;
	}

	public void registerClass(Class<?> aClass) {
		registerClasses.add(aClass);
	}

	public void registerClasses(Collection<Class> classes) {
		for (Class<?> clazz : classes) {
			registerClass(clazz);
		}
	}

	public XmlConverterListener getListener() {
		return listener;
	}

	public void setListener(XmlConverterListener xmlConvertListener) {
		if (xmlConvertListener == null) {
			this.listener = new DefaultXmlConvertListener();
		} else {
			this.listener = xmlConvertListener;
		}
	}

	private static final class DefaultUnmarshalListener extends Unmarshaller.Listener {
		private final XmlConverterListener xmlConvertListener;

		public DefaultUnmarshalListener(XmlConverterListener xmlConvertListener) {
			this.xmlConvertListener = xmlConvertListener;
		}

		@Override
		public void afterUnmarshal(Object target, Object parent) {
			this.xmlConvertListener.afterUnmarshal(target, parent);
		}

		@Override
		public void beforeUnmarshal(Object target, Object parent) {
			this.xmlConvertListener.beforeUnmarshal(target, parent);
		}
	}

	private static final class DefaultMarshalListener extends Marshaller.Listener {
		private final XmlConverterListener xmlConvertListener;

		public DefaultMarshalListener(XmlConverterListener xmlConvertListener) {
			this.xmlConvertListener = xmlConvertListener;
		}

		@Override
		public void afterMarshal(Object source) {
			this.xmlConvertListener.afterMarshal(source);
		}

		@Override
		public void beforeMarshal(Object source) {
			this.xmlConvertListener.beforeMarshal(source);
		}

	}

	@SuppressWarnings("serial")
	private final class DefaultNamespacePrefixMapper extends NamespacePrefixMapper implements Serializable {
		Map<String, String> prefixMap = new HashMap<String, String>();

		public DefaultNamespacePrefixMapper() {
			prefixMap.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
		}

		public void registerPrefix(String namespaceUri, String prefix) {
			prefixMap.put(namespaceUri, prefix);
		}

		public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
			String prefix = prefixMap.get(namespaceUri);
			if (prefix != null) {
				return prefix;
			}
			return suggestion;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setJaxbClasses(List<Class> beans) {
		registerClasses(beans);
	}

	@SuppressWarnings("rawtypes")
	public List<Class> getJaxbClasses() {
		List list = new ArrayList( registerClasses );
		return list;
	}
}
