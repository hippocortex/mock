
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfAccount_BusinessAddress complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccount_BusinessAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account_BusinessAddress" type="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}Account_BusinessAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccount_BusinessAddress", propOrder = {
    "accountBusinessAddress"
})
public class ListOfAccountBusinessAddress {

    @XmlElement(name = "Account_BusinessAddress")
    protected List<AccountBusinessAddress> accountBusinessAddress;

    /**
     * Gets the value of the accountBusinessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountBusinessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBusinessAddress }
     * 
     * 
     */
    public List<AccountBusinessAddress> getAccountBusinessAddress() {
        if (accountBusinessAddress == null) {
            accountBusinessAddress = new ArrayList<AccountBusinessAddress>();
        }
        return this.accountBusinessAddress;
    }

}
