
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListOfCifAccountReference complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListOfCifAccountReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CifAccountReference" type="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}CifAccountReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCifAccountReference", propOrder = {
    "cifAccountReference"
})
public class ListOfCifAccountReference {

    @XmlElement(name = "CifAccountReference")
    protected List<CifAccountReference> cifAccountReference;

    /**
     * Gets the value of the cifAccountReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cifAccountReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCifAccountReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CifAccountReference }
     * 
     * 
     */
    public List<CifAccountReference> getCifAccountReference() {
        if (cifAccountReference == null) {
            cifAccountReference = new ArrayList<CifAccountReference>();
        }
        return this.cifAccountReference;
    }

}