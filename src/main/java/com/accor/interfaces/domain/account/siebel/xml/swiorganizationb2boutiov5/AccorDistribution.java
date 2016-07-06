
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AccorDistribution complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccorDistribution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Searchspec2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BGDSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BGDSIATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BNRCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BPCCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BRateaccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSGACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSGASite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccorDistribution", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "searchspec2",
    "accorb2BGDSCode",
    "accorb2BGDSIATA",
    "accorb2BNRCCode",
    "accorb2BPCCCode",
    "accorb2BRateaccess",
    "accorb2BSGACode",
    "accorb2BSGASite",
    "accountId",
    "name",
    "type2"
})
public class AccorDistribution {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "Searchspec2")
    protected String searchspec2;
    @XmlElement(name = "ACCORB2BGDSCode")
    protected String accorb2BGDSCode;
    @XmlElement(name = "ACCORB2BGDSIATA")
    protected String accorb2BGDSIATA;
    @XmlElement(name = "ACCORB2BNRCCode")
    protected String accorb2BNRCCode;
    @XmlElement(name = "ACCORB2BPCCCode")
    protected String accorb2BPCCCode;
    @XmlElement(name = "ACCORB2BRateaccess")
    protected String accorb2BRateaccess;
    @XmlElement(name = "ACCORB2BSGACode")
    protected String accorb2BSGACode;
    @XmlElement(name = "ACCORB2BSGASite")
    protected String accorb2BSGASite;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type2")
    protected String type2;
    @XmlAttribute(name = "Operation")
    protected String operation;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * D�finit la valeur de la propri�t� created.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Obtient la valeur de la propri�t� createdBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * D�finit la valeur de la propri�t� createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Obtient la valeur de la propri�t� updated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * D�finit la valeur de la propri�t� updated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Obtient la valeur de la propri�t� updatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * D�finit la valeur de la propri�t� updatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Obtient la valeur de la propri�t� conflictId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * D�finit la valeur de la propri�t� conflictId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Obtient la valeur de la propri�t� searchspec2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec2() {
        return searchspec2;
    }

    /**
     * D�finit la valeur de la propri�t� searchspec2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec2(String value) {
        this.searchspec2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BGDSCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BGDSCode() {
        return accorb2BGDSCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BGDSCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BGDSCode(String value) {
        this.accorb2BGDSCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BGDSIATA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BGDSIATA() {
        return accorb2BGDSIATA;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BGDSIATA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BGDSIATA(String value) {
        this.accorb2BGDSIATA = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BNRCCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BNRCCode() {
        return accorb2BNRCCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BNRCCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BNRCCode(String value) {
        this.accorb2BNRCCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BPCCCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BPCCCode() {
        return accorb2BPCCCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BPCCCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BPCCCode(String value) {
        this.accorb2BPCCCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BRateaccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BRateaccess() {
        return accorb2BRateaccess;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BRateaccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BRateaccess(String value) {
        this.accorb2BRateaccess = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSGACode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSGACode() {
        return accorb2BSGACode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSGACode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSGACode(String value) {
        this.accorb2BSGACode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSGASite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSGASite() {
        return accorb2BSGASite;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSGASite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSGASite(String value) {
        this.accorb2BSGASite = value;
    }

    /**
     * Obtient la valeur de la propri�t� accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * D�finit la valeur de la propri�t� accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� type2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType2() {
        return type2;
    }

    /**
     * D�finit la valeur de la propri�t� type2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType2(String value) {
        this.type2 = value;
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
