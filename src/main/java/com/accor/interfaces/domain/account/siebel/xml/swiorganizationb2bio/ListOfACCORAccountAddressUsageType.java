
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfACCORAccountAddressUsageType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfACCORAccountAddressUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCORAccountAddressUsageType" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ACCORAccountAddressUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfACCORAccountAddressUsageType", propOrder = {
    "accorAccountAddressUsageType"
})
public class ListOfACCORAccountAddressUsageType {

    @XmlElement(name = "ACCORAccountAddressUsageType")
    protected List<ACCORAccountAddressUsageType> accorAccountAddressUsageType;

    /**
     * Gets the value of the accorAccountAddressUsageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accorAccountAddressUsageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCORAccountAddressUsageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCORAccountAddressUsageType }
     * 
     * 
     */
    public List<ACCORAccountAddressUsageType> getACCORAccountAddressUsageType() {
        if (accorAccountAddressUsageType == null) {
            accorAccountAddressUsageType = new ArrayList<ACCORAccountAddressUsageType>();
        }
        return this.accorAccountAddressUsageType;
    }

}
