
package com.accor.asa.interfaces.domain.account.siebel.CustomUI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5.ListOfSwiOrganizationB2BOutIOV5;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_sblesc_lstValue_grt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Process_spcInstance_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RealtimePubSub" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Siebel_spcOperation_spcObject_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}ListOfSwiOrganizationB2BOutIOV5"/>
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
    "sblescLstValueGrt",
    "errorSpcCode",
    "errorSpcMessage",
    "errorCode",
    "errorField",
    "errorMsg",
    "objectSpcId",
    "processSpcInstanceSpcId",
    "realtimePubSub",
    "siebelSpcOperationSpcObjectSpcId",
    "listOfSwiOrganizationB2BOutIOV5"
})
@XmlRootElement(name = "createOrganizationB2BV5_Output")
public class CreateOrganizationB2BV5Output {

    @XmlElement(name = "_sblesc_lstValue_grt", required = true)
    protected String sblescLstValueGrt;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorField", required = true)
    protected String errorField;
    @XmlElement(name = "ErrorMsg", required = true)
    protected String errorMsg;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "Process_spcInstance_spcId", required = true)
    protected String processSpcInstanceSpcId;
    @XmlElement(name = "RealtimePubSub", required = true)
    protected String realtimePubSub;
    @XmlElement(name = "Siebel_spcOperation_spcObject_spcId", required = true)
    protected String siebelSpcOperationSpcObjectSpcId;
    @XmlElement(name = "ListOfSwiOrganizationB2BOutIOV5", namespace = "http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5", required = true)
    protected ListOfSwiOrganizationB2BOutIOV5 listOfSwiOrganizationB2BOutIOV5;

    /**
     * Obtient la valeur de la propriété sblescLstValueGrt.
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
     * Définit la valeur de la propriété sblescLstValueGrt.
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
     * Obtient la valeur de la propriété errorSpcCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcCode() {
        return errorSpcCode;
    }

    /**
     * Définit la valeur de la propriété errorSpcCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcCode(String value) {
        this.errorSpcCode = value;
    }

    /**
     * Obtient la valeur de la propriété errorSpcMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }

    /**
     * Définit la valeur de la propriété errorSpcMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcMessage(String value) {
        this.errorSpcMessage = value;
    }

    /**
     * Obtient la valeur de la propriété errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Définit la valeur de la propriété errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtient la valeur de la propriété errorField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorField() {
        return errorField;
    }

    /**
     * Définit la valeur de la propriété errorField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorField(String value) {
        this.errorField = value;
    }

    /**
     * Obtient la valeur de la propriété errorMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Définit la valeur de la propriété errorMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Obtient la valeur de la propriété objectSpcId.
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
     * Définit la valeur de la propriété objectSpcId.
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
     * Obtient la valeur de la propriété processSpcInstanceSpcId.
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
     * Définit la valeur de la propriété processSpcInstanceSpcId.
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
     * Obtient la valeur de la propriété realtimePubSub.
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
     * Définit la valeur de la propriété realtimePubSub.
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
     * Obtient la valeur de la propriété siebelSpcOperationSpcObjectSpcId.
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
     * Définit la valeur de la propriété siebelSpcOperationSpcObjectSpcId.
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
     * Obtient la valeur de la propriété listOfSwiOrganizationB2BOutIOV5.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSwiOrganizationB2BOutIOV5 }
     *     
     */
    public ListOfSwiOrganizationB2BOutIOV5 getListOfSwiOrganizationB2BOutIOV5() {
        return listOfSwiOrganizationB2BOutIOV5;
    }

    /**
     * Définit la valeur de la propriété listOfSwiOrganizationB2BOutIOV5.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSwiOrganizationB2BOutIOV5 }
     *     
     */
    public void setListOfSwiOrganizationB2BOutIOV5(ListOfSwiOrganizationB2BOutIOV5 value) {
        this.listOfSwiOrganizationB2BOutIOV5 = value;
    }

}
