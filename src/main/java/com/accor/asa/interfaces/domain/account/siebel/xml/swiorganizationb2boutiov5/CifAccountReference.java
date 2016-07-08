
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CifAccountReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CifAccountReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CifAccountReference", propOrder = {
    "externalId1",
    "systemNumber"
})
public class CifAccountReference {

    @XmlElement(name = "ExternalId1")
    protected String externalId1;
    @XmlElement(name = "SystemNumber")
    protected String systemNumber;

    /**
     * Obtient la valeur de la propriété externalId1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId1() {
        return externalId1;
    }

    /**
     * Définit la valeur de la propriété externalId1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId1(String value) {
        this.externalId1 = value;
    }

    /**
     * Obtient la valeur de la propriété systemNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNumber() {
        return systemNumber;
    }

    /**
     * Définit la valeur de la propriété systemNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemNumber(String value) {
        this.systemNumber = value;
    }

}
