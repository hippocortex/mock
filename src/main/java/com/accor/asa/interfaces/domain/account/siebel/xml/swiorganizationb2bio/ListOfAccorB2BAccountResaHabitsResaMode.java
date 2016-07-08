
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfAccorB2bAccountResaHabitsResaMode complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccorB2bAccountResaHabitsResaMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccorB2bAccountResaHabitsResaMode" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}AccorB2bAccountResaHabitsResaMode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccorB2bAccountResaHabitsResaMode", propOrder = {
    "accorB2BAccountResaHabitsResaMode"
})
public class ListOfAccorB2BAccountResaHabitsResaMode {

    @XmlElement(name = "AccorB2bAccountResaHabitsResaMode")
    protected List<AccorB2BAccountResaHabitsResaMode> accorB2BAccountResaHabitsResaMode;

    /**
     * Gets the value of the accorB2BAccountResaHabitsResaMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accorB2BAccountResaHabitsResaMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccorB2BAccountResaHabitsResaMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccorB2BAccountResaHabitsResaMode }
     * 
     * 
     */
    public List<AccorB2BAccountResaHabitsResaMode> getAccorB2BAccountResaHabitsResaMode() {
        if (accorB2BAccountResaHabitsResaMode == null) {
            accorB2BAccountResaHabitsResaMode = new ArrayList<AccorB2BAccountResaHabitsResaMode>();
        }
        return this.accorB2BAccountResaHabitsResaMode;
    }

}
