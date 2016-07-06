
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfAccorB2bAccountCi complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccorB2bAccountCi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccorB2bAccountCi" type="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}AccorB2bAccountCi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccorB2bAccountCi", propOrder = {
    "accorB2BAccountCi"
})
public class ListOfAccorB2BAccountCi {

    @XmlElement(name = "AccorB2bAccountCi")
    protected List<AccorB2BAccountCi> accorB2BAccountCi;

    /**
     * Gets the value of the accorB2BAccountCi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accorB2BAccountCi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccorB2BAccountCi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccorB2BAccountCi }
     * 
     * 
     */
    public List<AccorB2BAccountCi> getAccorB2BAccountCi() {
        if (accorB2BAccountCi == null) {
            accorB2BAccountCi = new ArrayList<AccorB2BAccountCi>();
        }
        return this.accorB2BAccountCi;
    }

}
