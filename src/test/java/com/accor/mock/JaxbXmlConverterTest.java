package com.accor.mock;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;

import com.accor.asa.interfaces.domain.account.siebel.CustomUI.CreateOrganizationB2BV5Input;
import com.accor.asa.interfaces.domain.account.siebel.CustomUI.UpdateOrganizationB2BV5Input;
import com.accor.asa.interfaces.domain.account.siebel.CustomUI.UpdateOrganizationB2BV5Output;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2bio.Account;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2bio.ListOfSwiOrganizationB2BIO;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5.ListOfSwiOrganizationB2BOutIOV5;
import com.sb.tools.JaxbXmlConverter;
import com.sb.tools.StringUtilities;

public class JaxbXmlConverterTest {

	@Test
	public void testUnmarshallInputStreamUpdateInputSfa() throws JAXBException, XMLStreamException {
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
		converter.registerClasses(classesHead);
		converter.registerPrefix("http://siebel.com/CustomUI","");
		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BIOV5","");

		final String xml = StringUtilities
				.getStringFromResourceFile(JaxbXmlConverterTest.class
						.getResourceAsStream("/com/accor/mock/updateinput.xml"));
		
		UpdateOrganizationB2BV5Input unmarshall2 = converter.unmarshall(xml);
		
		String xmlmarshall  = converter.marshall(unmarshall2);
		
		Assert.assertEquals("108277472", unmarshall2.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId());
	}

	
	
	/**
	 * test sur un fichier au format specifique salesforce sur les namespace 
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	@Test
	public void testUnmarshallInputStreamUpdateOutSfa() throws JAXBException, XMLStreamException {
		JaxbXmlConverter<UpdateOrganizationB2BV5Output> converter = new JaxbXmlConverter<UpdateOrganizationB2BV5Output>();
		
		List<Class> classesHead = new ArrayList<Class>() ;
		classesHead.add(UpdateOrganizationB2BV5Output.class);
		converter.registerClasses(classesHead);
		converter.registerPrefix("http://siebel.com/CustomUI","ns");
		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5","");

		final String xml = StringUtilities
				.getStringFromResourceFile(JaxbXmlConverterTest.class
						.getResourceAsStream("/com/accor/mock/updateoutput.xml"));
		
		UpdateOrganizationB2BV5Output unmarshall2 = converter.unmarshall(xml);
		
		
		Assert.assertEquals("108277472", unmarshall2.getListOfSwiOrganizationB2BOutIOV5().getAccount().get(0).getIntegrationId());
	}
	@Test
	public void testUnmarshallInputStreamCreateInSfa() throws JAXBException, XMLStreamException {
		JaxbXmlConverter<CreateOrganizationB2BV5Input> converter = new JaxbXmlConverter<CreateOrganizationB2BV5Input>();
		
		List<Class> classesHead = new ArrayList<Class>() ;
		classesHead.add(CreateOrganizationB2BV5Input.class);
		converter.registerClasses(classesHead);
		converter.registerPrefix("http://siebel.com/CustomUI","");
		converter.registerPrefix("http://www.siebel.com/xml/SwiOrganizationB2BIOV5","");

		final String xml = StringUtilities
				.getStringFromResourceFile(JaxbXmlConverterTest.class
						.getResourceAsStream("/com/accor/mock/createinput.xml"));
		
		CreateOrganizationB2BV5Input unmarshall2 = converter.unmarshall(xml);
		
		Assert.assertEquals(null, unmarshall2.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId());
	}


}
