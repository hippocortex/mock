
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfAccorB2bAccountResaHabitsDistribMode complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccorB2bAccountResaHabitsDistribMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccorB2bAccountResaHabitsDistribMode" type="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}AccorB2bAccountResaHabitsDistribMode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccorB2bAccountResaHabitsDistribMode", propOrder = {
    "accorB2BAccountResaHabitsDistribMode"
})
public class ListOfAccorB2BAccountResaHabitsDistribMode {

    @XmlElement(name = "AccorB2bAccountResaHabitsDistribMode")
    protected List<AccorB2BAccountResaHabitsDistribMode> accorB2BAccountResaHabitsDistribMode;

    /**
     * Gets the value of the accorB2BAccountResaHabitsDistribMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accorB2BAccountResaHabitsDistribMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccorB2BAccountResaHabitsDistribMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccorB2BAccountResaHabitsDistribMode }
     * 
     * 
     */
    public List<AccorB2BAccountResaHabitsDistribMode> getAccorB2BAccountResaHabitsDistribMode() {
        if (accorB2BAccountResaHabitsDistribMode == null) {
            accorB2BAccountResaHabitsDistribMode = new ArrayList<AccorB2BAccountResaHabitsDistribMode>();
        }
        return this.accorB2BAccountResaHabitsDistribMode;
    }

}
