
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationacio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationacio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfSwiOrganizationB2BIO_QNAME = new QName("http://www.siebel.com/xml/SwiOrganizationACIO", "ListOfSwiOrganizationB2BIO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationacio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSwiOrganizationB2BIO }
     * 
     */
    public ListOfSwiOrganizationB2BIO createListOfSwiOrganizationB2BIO() {
        return new ListOfSwiOrganizationB2BIO();
    }

    /**
     * Create an instance of {@link ListOfSwiOrganizationB2BIOTopElmt }
     * 
     */
    public ListOfSwiOrganizationB2BIOTopElmt createListOfSwiOrganizationB2BIOTopElmt() {
        return new ListOfSwiOrganizationB2BIOTopElmt();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSwiOrganizationB2BIO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/SwiOrganizationACIO", name = "ListOfSwiOrganizationB2BIO")
    public JAXBElement<ListOfSwiOrganizationB2BIO> createListOfSwiOrganizationB2BIO(ListOfSwiOrganizationB2BIO value) {
        return new JAXBElement<ListOfSwiOrganizationB2BIO>(_ListOfSwiOrganizationB2BIO_QNAME, ListOfSwiOrganizationB2BIO.class, null, value);
    }

}
