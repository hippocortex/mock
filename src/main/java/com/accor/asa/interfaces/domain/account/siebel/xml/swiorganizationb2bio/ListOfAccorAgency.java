
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfAccorAgency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccorAgency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccorAgency" type="{http://www.siebel.com/xml/SwiOrganizationB2BIO}AccorAgency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccorAgency", propOrder = {
    "accorAgency"
})
public class ListOfAccorAgency {

    @XmlElement(name = "AccorAgency")
    protected List<AccorAgency> accorAgency;

    /**
     * Gets the value of the accorAgency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accorAgency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccorAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccorAgency }
     * 
     * 
     */
    public List<AccorAgency> getAccorAgency() {
        if (accorAgency == null) {
            accorAgency = new ArrayList<AccorAgency>();
        }
        return this.accorAgency;
    }

}
