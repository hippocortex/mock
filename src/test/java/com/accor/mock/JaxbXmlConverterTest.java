package com.accor.mock;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;

import com.accor.interfaces.domain.account.siebel.CustomUI.UpdateOrganizationB2BV5Input;
import com.accor.interfaces.domain.account.siebel.CustomUI.UpdateOrganizationB2BV5Output;
import com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio.ListOfSwiOrganizationB2BIO;
import com.sb.tools.JaxbXmlConverter;
import com.sb.tools.StringUtilities;

public class JaxbXmlConverterTest {

	
	@Test
	public void testUnmarshallInputStream() throws JAXBException, XMLStreamException {
		final InputStream resourceAsStream = JaxbXmlConverterTest.class.getResourceAsStream( "/com/accor/mock/mockAccount.xml" );
		JaxbXmlConverter<UpdateOrganizationB2BV5Input> converter = new JaxbXmlConverter<UpdateOrganizationB2BV5Input>();
//		XMLInputFactory xif = XMLInputFactory.newFactory();
//        StreamSource xml = new StreamSource("src/test/resources/com/accor/mock/mockAccount.xml");
//        XMLStreamReader xsr = xif.createXMLStreamReader(xml);
//       
//        JAXBContext jc = JAXBContext.newInstance(UpdateOrganizationB2BV5Input.class);
//        Unmarshaller unmarshaller = jc.createUnmarshaller();
//        JAXBElement<UpdateOrganizationB2BV5Input> jb = unmarshaller.unmarshal(xsr, UpdateOrganizationB2BV5Input.class);
//        xsr.close();
// 
//        UpdateOrganizationB2BV5Input customer = jb.getValue();
		
//		converter.registerClass(UpdateOrganizationB2BV5Input.class);
//		converter.registerClass(ListOfSwiOrganizationB2BIO.class);
		
		List<Class> classesHead = new ArrayList<Class>() ;
		classesHead.add(UpdateOrganizationB2BV5Input.class);
		classesHead.add(ListOfSwiOrganizationB2BIO.class);
		converter.registerClasses(classesHead);
//		converter.registerClass(Account.class);
//		converter.registerPrefix("http://siebel.com/CustomUI","");
//		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BIOV5", "ns2");
//		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5","ns3");
		final String xml = StringUtilities
				.getStringFromResourceFile(JaxbXmlConverterTest.class
						.getResourceAsStream("/com/accor/mock/mockAccount.xml"));
		
		UpdateOrganizationB2BV5Input unmarshall2 = converter.unmarshall(xml);
		UpdateOrganizationB2BV5Input unmarshall = converter.unmarshall(resourceAsStream);
		Assert.assertEquals("113284146", unmarshall.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId());
	}
	
	@Test
	public void testUnmarshallInputStreamUpdateOut() throws JAXBException, XMLStreamException {
		final InputStream resourceAsStream = JaxbXmlConverterTest.class.getResourceAsStream( "/com/accor/mock/updateAccount.xml" );
		JaxbXmlConverter<UpdateOrganizationB2BV5Output> converter = new JaxbXmlConverter<UpdateOrganizationB2BV5Output>();
//		XMLInputFactory xif = XMLInputFactory.newFactory();
//        StreamSource xml = new StreamSource("src/test/resources/com/accor/mock/mockAccount.xml");
//        XMLStreamReader xsr = xif.createXMLStreamReader(xml);
//       
//        JAXBContext jc = JAXBContext.newInstance(UpdateOrganizationB2BV5Input.class);
//        Unmarshaller unmarshaller = jc.createUnmarshaller();
//        JAXBElement<UpdateOrganizationB2BV5Input> jb = unmarshaller.unmarshal(xsr, UpdateOrganizationB2BV5Input.class);
//        xsr.close();
// 
//        UpdateOrganizationB2BV5Input customer = jb.getValue();
		
//		converter.registerClass(UpdateOrganizationB2BV5Input.class);
//		converter.registerClass(ListOfSwiOrganizationB2BIO.class);
		
		List<Class> classesHead = new ArrayList<Class>() ;
		classesHead.add(UpdateOrganizationB2BV5Output.class);
		converter.registerClasses(classesHead);
//		converter.registerClass(Account.class);
//		converter.registerPrefix("http://siebel.com/CustomUI","");
//		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BIOV5", "ns2");
//		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5","ns3");
		final String xml = StringUtilities
				.getStringFromResourceFile(JaxbXmlConverterTest.class
						.getResourceAsStream("/com/accor/mock/updateAccount.xml"));
		
		UpdateOrganizationB2BV5Output unmarshall2 = converter.unmarshall(xml);
		UpdateOrganizationB2BV5Output unmarshall = converter.unmarshall(resourceAsStream);
		Assert.assertEquals("701976257", unmarshall.getListOfSwiOrganizationB2BOutIOV5().getAccount().get(0).getIntegrationId());
	}

}
