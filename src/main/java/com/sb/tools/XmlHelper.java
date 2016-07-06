package com.sb.tools;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

public class XmlHelper {
    public final static String LINE_SEPARATOR = System.getProperty("line.separator");

    private static OutputFormat DEFAULT_FORMAT = new OutputFormat();

    static {
        DEFAULT_FORMAT.setLineWidth(80);
        DEFAULT_FORMAT.setIndenting(true);
        DEFAULT_FORMAT.setIndent(2);
        DEFAULT_FORMAT.setLineSeparator(LINE_SEPARATOR);
    }

    private final static String AMP_STRING = "&";

    private final static String LT_STRING = "<";

    private final static String GT_STRING = ">";

    private final static String QUOTE_STRING = "\"";

    private final static String APOS_STRING = "'";

    private final static String EACUTE_STRING = "é";

    private final static String DEG_STRING = "°";

    private final static String AMP_ENTITY = "&amp;";

    private final static String LT_ENTITY = "&lt;";

    private final static String GT_ENTITY = "&gt;";

    private final static String QUOTE_ENTITY = "&quot;";

    private final static String APOS_ENTITY = "&apos;";

    private final static String EACUTE_ENTITY = "&eacute;";

    private final static String DEG_ENTITY = "&#176;";


    public static String convertEntities(String text) {
        if ("".equals(text.trim())) {
            return "";
        }
        if (text.indexOf(AMP_STRING) != -1) {
            text = text.replaceAll(AMP_STRING, AMP_ENTITY);
        }
        if (text.indexOf(APOS_STRING) != -1) {
            text = text.replaceAll(APOS_STRING, APOS_ENTITY);
        }
        if (text.indexOf(LT_STRING) != -1) {
            text = text.replaceAll(LT_STRING, LT_ENTITY);
        }
        if (text.indexOf(GT_STRING) != -1) {
            text = text.replaceAll(GT_STRING, GT_ENTITY);
        }
        if (text.indexOf(QUOTE_STRING) != -1) {
            text = text.replaceAll(QUOTE_STRING, QUOTE_ENTITY);
        }
        if (text.indexOf(EACUTE_STRING) != -1) {
            text = text.replaceAll(EACUTE_STRING, EACUTE_ENTITY);
        }
        if (text.indexOf(DEG_STRING) != -1) {
            text = text.replaceAll(DEG_STRING, DEG_ENTITY);
        }
        return text;
    }

    public static String unconvertEntities(String text) {
        if ("".equals(text.trim())) {
            return "";
        }
        if (text.indexOf(AMP_ENTITY) != -1) {
            text = text.replaceAll(AMP_ENTITY, AMP_STRING);
        }
        if (text.indexOf(APOS_ENTITY) != -1) {
            text = text.replaceAll(APOS_ENTITY, APOS_STRING);
        }
        if (text.indexOf(LT_ENTITY) != -1) {
            text = text.replaceAll(LT_ENTITY, LT_STRING);
        }
        if (text.indexOf(GT_ENTITY) != -1) {
            text = text.replaceAll(GT_ENTITY, GT_STRING);
        }
        if (text.indexOf(QUOTE_ENTITY) != -1) {
            text = text.replaceAll(QUOTE_ENTITY, QUOTE_STRING);
        }
        if (text.indexOf(EACUTE_ENTITY) != -1) {
            text = text.replaceAll(EACUTE_ENTITY, EACUTE_STRING);
        }
        if (text.indexOf(DEG_ENTITY) != -1) {
            text = text.replaceAll(DEG_ENTITY, DEG_STRING);
        }
        return text;
    }

    public static String prettyPrint(String xml) {
        Writer writer = new StringWriter();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setValidating(false);
            InputSource is = new InputSource(new StringReader(xml));
            Document document = dbf.newDocumentBuilder().parse(is);
            XMLSerializer serializer = new XMLSerializer(writer, DEFAULT_FORMAT);
            serializer.serialize(document);
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Parses an XML file and returns a DOM document.
    // If validating is true, the contents is validated against the DTD/XSD
    // specified in the file.
    public static Document parseXmlFile(InputStream inputStream, boolean validating) {
        try {
            // Create a builder factory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(validating);
            // Create the builder and parse the file
            Document doc = factory.newDocumentBuilder().parse(inputStream);
            return doc;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Parses an XML String and returns a DOM document.
    // If validating is true, the contents is validated against the DTD/XSD
    // specified in the file.
    public static Document parseXmlString(String xmlString, boolean validating) {
        try {
            // Create a builder factory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(validating);
            factory.setNamespaceAware(true);
            // Create the builder and parse the file
            Document doc = factory.newDocumentBuilder().parse(new ByteArrayInputStream(xmlString.getBytes()));
            return doc;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   
}
