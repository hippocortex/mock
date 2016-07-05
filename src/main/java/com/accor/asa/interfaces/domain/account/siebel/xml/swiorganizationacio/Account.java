
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationacio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Account complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccessCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccessCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BStartDateValidity1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BStartDateValidity2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "integrationId",
    "accorb2BAccessCode1",
    "accorb2BAccessCode2",
    "accorb2BStartDateValidity1",
    "accorb2BStartDateValidity2",
    "accorb2BExpirationDate"
})
public class Account {

    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "ACCORB2BAccessCode1")
    protected String accorb2BAccessCode1;
    @XmlElement(name = "ACCORB2BAccessCode2")
    protected String accorb2BAccessCode2;
    @XmlElement(name = "ACCORB2BStartDateValidity1")
    protected String accorb2BStartDateValidity1;
    @XmlElement(name = "ACCORB2BStartDateValidity2")
    protected String accorb2BStartDateValidity2;
    @XmlElement(name = "ACCORB2BExpirationDate")
    protected String accorb2BExpirationDate;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

    /**
     * Obtient la valeur de la propri�t� integrationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * D�finit la valeur de la propri�t� integrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAccessCode1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAccessCode1() {
        return accorb2BAccessCode1;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAccessCode1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAccessCode1(String value) {
        this.accorb2BAccessCode1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAccessCode2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAccessCode2() {
        return accorb2BAccessCode2;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAccessCode2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAccessCode2(String value) {
        this.accorb2BAccessCode2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BStartDateValidity1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BStartDateValidity1() {
        return accorb2BStartDateValidity1;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BStartDateValidity1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BStartDateValidity1(String value) {
        this.accorb2BStartDateValidity1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BStartDateValidity2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BStartDateValidity2() {
        return accorb2BStartDateValidity2;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BStartDateValidity2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BStartDateValidity2(String value) {
        this.accorb2BStartDateValidity2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BExpirationDate() {
        return accorb2BExpirationDate;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BExpirationDate(String value) {
        this.accorb2BExpirationDate = value;
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

}
