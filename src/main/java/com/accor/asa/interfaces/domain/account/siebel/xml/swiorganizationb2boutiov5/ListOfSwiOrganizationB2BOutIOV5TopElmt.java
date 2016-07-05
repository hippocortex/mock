
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfSwiOrganizationB2BOutIOV5TopElmt complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfSwiOrganizationB2BOutIOV5TopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSwiOrganizationB2BOutIOV5" type="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}ListOfSwiOrganizationB2BOutIOV5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSwiOrganizationB2BOutIOV5TopElmt", propOrder = {
    "listOfSwiOrganizationB2BOutIOV5"
})
public class ListOfSwiOrganizationB2BOutIOV5TopElmt {

    @XmlElement(name = "ListOfSwiOrganizationB2BOutIOV5", required = true)
    protected ListOfSwiOrganizationB2BOutIOV5 listOfSwiOrganizationB2BOutIOV5;

    /**
     * Obtient la valeur de la propriété listOfSwiOrganizationB2BOutIOV5.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSwiOrganizationB2BOutIOV5 }
     *     
     */
    public ListOfSwiOrganizationB2BOutIOV5 getListOfSwiOrganizationB2BOutIOV5() {
        return listOfSwiOrganizationB2BOutIOV5;
    }

    /**
     * Définit la valeur de la propriété listOfSwiOrganizationB2BOutIOV5.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSwiOrganizationB2BOutIOV5 }
     *     
     */
    public void setListOfSwiOrganizationB2BOutIOV5(ListOfSwiOrganizationB2BOutIOV5 value) {
        this.listOfSwiOrganizationB2BOutIOV5 = value;
    }

}
