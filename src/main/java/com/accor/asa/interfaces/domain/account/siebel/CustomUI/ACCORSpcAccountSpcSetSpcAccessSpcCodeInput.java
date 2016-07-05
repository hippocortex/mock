
package com.accor.asa.interfaces.domain.account.siebel.CustomUI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationacio.ListOfSwiOrganizationB2BIO;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siebel.com/xml/SwiOrganizationACIO}ListOfSwiOrganizationB2BIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfSwiOrganizationB2BIO"
})
@XmlRootElement(name = "ACCOR_spcAccount_spcSet_spcAccess_spcCode_Input")
public class ACCORSpcAccountSpcSetSpcAccessSpcCodeInput {

    @XmlElement(name = "ListOfSwiOrganizationB2BIO", namespace = "http://www.siebel.com/xml/SwiOrganizationACIO", required = true)
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
