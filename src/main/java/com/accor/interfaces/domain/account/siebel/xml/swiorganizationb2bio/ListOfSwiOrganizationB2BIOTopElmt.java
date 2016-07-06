
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfSwiOrganizationB2BIOTopElmt complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfSwiOrganizationB2BIOTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSwiOrganizationB2BIO" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfSwiOrganizationB2BIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSwiOrganizationB2BIOTopElmt", propOrder = {
    "listOfSwiOrganizationB2BIO"
})
public class ListOfSwiOrganizationB2BIOTopElmt {

    @XmlElement(name = "ListOfSwiOrganizationB2BIO", required = true)
    protected ListOfSwiOrganizationB2BIO listOfSwiOrganizationB2BIO;

    /**
     * Obtient la valeur de la propriété listOfSwiOrganizationB2BIO.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSwiOrganizationB2BIO }
     *     
     */
    public ListOfSwiOrganizationB2BIO getListOfSwiOrganizationB2BIO() {
        return listOfSwiOrganizationB2BIO;
    }

    /**
     * Définit la valeur de la propriété listOfSwiOrganizationB2BIO.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSwiOrganizationB2BIO }
     *     
     */
    public void setListOfSwiOrganizationB2BIO(ListOfSwiOrganizationB2BIO value) {
        this.listOfSwiOrganizationB2BIO = value;
    }

}
