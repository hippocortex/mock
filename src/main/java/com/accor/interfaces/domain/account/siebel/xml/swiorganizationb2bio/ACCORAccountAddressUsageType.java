
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ACCORAccountAddressUsageType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ACCORAccountAddressUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Searchspec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORAccountAddressUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCORAccountAddressUsageType", propOrder = {
    "searchspec",
    "accorAccountAddressUsage"
})
public class ACCORAccountAddressUsageType {

    @XmlElement(name = "Searchspec")
    protected String searchspec;
    @XmlElement(name = "ACCORAccountAddressUsage")
    protected String accorAccountAddressUsage;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "Operation")
    protected String operation;

    /**
     * Obtient la valeur de la propri�t� searchspec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * D�finit la valeur de la propri�t� searchspec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorAccountAddressUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORAccountAddressUsage() {
        return accorAccountAddressUsage;
    }

    /**
     * D�finit la valeur de la propri�t� accorAccountAddressUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORAccountAddressUsage(String value) {
        this.accorAccountAddressUsage = value;
    }

    /**
     * Obtient la valeur de la propri�t� isPrimaryMVG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimaryMVG() {
        return isPrimaryMVG;
    }

    /**
     * D�finit la valeur de la propri�t� isPrimaryMVG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimaryMVG(String value) {
        this.isPrimaryMVG = value;
    }

    /**
     * Obtient la valeur de la propri�t� operation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * D�finit la valeur de la propri�t� operation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
