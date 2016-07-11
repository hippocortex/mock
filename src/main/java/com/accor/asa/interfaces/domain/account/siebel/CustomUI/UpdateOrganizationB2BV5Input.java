
package com.accor.asa.interfaces.domain.account.siebel.CustomUI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2bio.ListOfSwiOrganizationB2BIO;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Process_spcInstance_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RealtimePubSub" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Siebel_spcOperation_spcObject_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_sblesc_lstValue_grt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfSwiOrganizationB2BIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processSpcInstanceSpcId",
    "accountOperation",
    "objectSpcId",
    "realtimePubSub",
    "siebelSpcOperationSpcObjectSpcId",
    "sblescLstValueGrt",
    "listOfSwiOrganizationB2BIO"
})
@XmlRootElement(name = "updateOrganizationB2BV5_Input")
public class UpdateOrganizationB2BV5Input {

    @XmlElement(name = "Process_spcInstance_spcId", required = true)
    protected String processSpcInstanceSpcId;
    @XmlElement(name = "AccountOperation", required = true)
    protected String accountOperation;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "RealtimePubSub", required = true)
    protected String realtimePubSub;
    @XmlElement(name = "Siebel_spcOperation_spcObject_spcId", required = true)
    protected String siebelSpcOperationSpcObjectSpcId;
    @XmlElement(name = "_sblesc_lstValue_grt", required = true)
    protected String sblescLstValueGrt;
    @XmlElement(name = "ListOfSwiOrganizationB2BIO", required = true)
    protected ListOfSwiOrganizationB2BIO listOfSwiOrganizationB2BIO;

    /**
     * Obtient la valeur de la propri�t� processSpcInstanceSpcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessSpcInstanceSpcId() {
        return processSpcInstanceSpcId;
    }

    /**
     * D�finit la valeur de la propri�t� processSpcInstanceSpcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessSpcInstanceSpcId(String value) {
        this.processSpcInstanceSpcId = value;
    }

    /**
     * Obtient la valeur de la propri�t� accountOperation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOperation() {
        return accountOperation;
    }

    /**
     * D�finit la valeur de la propri�t� accountOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOperation(String value) {
        this.accountOperation = value;
    }

    /**
     * Obtient la valeur de la propri�t� objectSpcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectSpcId() {
        return objectSpcId;
    }

    /**
     * D�finit la valeur de la propri�t� objectSpcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectSpcId(String value) {
        this.objectSpcId = value;
    }

    /**
     * Obtient la valeur de la propri�t� realtimePubSub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealtimePubSub() {
        return realtimePubSub;
    }

    /**
     * D�finit la valeur de la propri�t� realtimePubSub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtimePubSub(String value) {
        this.realtimePubSub = value;
    }

    /**
     * Obtient la valeur de la propri�t� siebelSpcOperationSpcObjectSpcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebelSpcOperationSpcObjectSpcId() {
        return siebelSpcOperationSpcObjectSpcId;
    }

    /**
     * D�finit la valeur de la propri�t� siebelSpcOperationSpcObjectSpcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebelSpcOperationSpcObjectSpcId(String value) {
        this.siebelSpcOperationSpcObjectSpcId = value;
    }

    /**
     * Obtient la valeur de la propri�t� sblescLstValueGrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSblescLstValueGrt() {
        return sblescLstValueGrt;
    }

    /**
     * D�finit la valeur de la propri�t� sblescLstValueGrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSblescLstValueGrt(String value) {
        this.sblescLstValueGrt = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfSwiOrganizationB2BIO.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSwiOrganizationB2BIO }
     *     
     */
    public ListOfSwiOrganizationB2BIO getListOfSwiOrganizationB2BIO() {
        return listOfSwiOrganizationB2BIO;
    }

    /**
     * D�finit la valeur de la propri�t� listOfSwiOrganizationB2BIO.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSwiOrganizationB2BIO }
     *     
     */
    public void setListOfSwiOrganizationB2BIO(ListOfSwiOrganizationB2BIO value) {
        this.listOfSwiOrganizationB2BIO = value;
    }

}
