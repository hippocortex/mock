
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Account_BusinessAddress complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Account_BusinessAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORNPAIFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORNPAIDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOROptOutFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOROptOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCleanseVerifiedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCleanseVerifiedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfACCORAccountAddressUsageType" type="{http://www.siebel.com/xml/SwiOrganizationB2BOutIOV5}ListOfACCORAccountAddressUsageType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "Account_BusinessAddress", propOrder = {
    "addressId",
    "addressIntegrationId",
    "billAddressFlag",
    "addressName",
    "streetAddress",
    "streetAddress2",
    "apartmentNumber",
    "accorAddressLine4",
    "city",
    "postalCode",
    "country",
    "state",
    "accornpaiFlag",
    "accornpaiDate",
    "accorOptOutFlag",
    "accorOptOutDate",
    "addressCleanseVerifiedFlag",
    "addressCleanseVerifiedStatus",
    "accorAddressType",
    "listOfACCORAccountAddressUsageType"
})
public class AccountBusinessAddress {

    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "AddressIntegrationId")
    protected String addressIntegrationId;
    @XmlElement(name = "BillAddressFlag")
    protected String billAddressFlag;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "StreetAddress")
    protected String streetAddress;
    @XmlElement(name = "StreetAddress2")
    protected String streetAddress2;
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    @XmlElement(name = "ACCORAddressLine4")
    protected String accorAddressLine4;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "ACCORNPAIFlag")
    protected String accornpaiFlag;
    @XmlElement(name = "ACCORNPAIDate")
    protected String accornpaiDate;
    @XmlElement(name = "ACCOROptOutFlag")
    protected String accorOptOutFlag;
    @XmlElement(name = "ACCOROptOutDate")
    protected String accorOptOutDate;
    @XmlElement(name = "AddressCleanseVerifiedFlag")
    protected String addressCleanseVerifiedFlag;
    @XmlElement(name = "AddressCleanseVerifiedStatus")
    protected String addressCleanseVerifiedStatus;
    @XmlElement(name = "ACCORAddressType")
    protected String accorAddressType;
    @XmlElement(name = "ListOfACCORAccountAddressUsageType")
    protected ListOfACCORAccountAddressUsageType listOfACCORAccountAddressUsageType;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

    /**
     * Obtient la valeur de la propriété addressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Définit la valeur de la propriété addressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Obtient la valeur de la propriété addressIntegrationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressIntegrationId() {
        return addressIntegrationId;
    }

    /**
     * Définit la valeur de la propriété addressIntegrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressIntegrationId(String value) {
        this.addressIntegrationId = value;
    }

    /**
     * Obtient la valeur de la propriété billAddressFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddressFlag() {
        return billAddressFlag;
    }

    /**
     * Définit la valeur de la propriété billAddressFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddressFlag(String value) {
        this.billAddressFlag = value;
    }

    /**
     * Obtient la valeur de la propriété addressName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Définit la valeur de la propriété addressName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * Obtient la valeur de la propriété streetAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Définit la valeur de la propriété streetAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Obtient la valeur de la propriété streetAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Définit la valeur de la propriété streetAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Obtient la valeur de la propriété apartmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Définit la valeur de la propriété apartmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Obtient la valeur de la propriété accorAddressLine4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORAddressLine4() {
        return accorAddressLine4;
    }

    /**
     * Définit la valeur de la propriété accorAddressLine4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORAddressLine4(String value) {
        this.accorAddressLine4 = value;
    }

    /**
     * Obtient la valeur de la propriété city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Définit la valeur de la propriété city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtient la valeur de la propriété postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Définit la valeur de la propriété postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Définit la valeur de la propriété state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété accornpaiFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORNPAIFlag() {
        return accornpaiFlag;
    }

    /**
     * Définit la valeur de la propriété accornpaiFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORNPAIFlag(String value) {
        this.accornpaiFlag = value;
    }

    /**
     * Obtient la valeur de la propriété accornpaiDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORNPAIDate() {
        return accornpaiDate;
    }

    /**
     * Définit la valeur de la propriété accornpaiDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORNPAIDate(String value) {
        this.accornpaiDate = value;
    }

    /**
     * Obtient la valeur de la propriété accorOptOutFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOROptOutFlag() {
        return accorOptOutFlag;
    }

    /**
     * Définit la valeur de la propriété accorOptOutFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOROptOutFlag(String value) {
        this.accorOptOutFlag = value;
    }

    /**
     * Obtient la valeur de la propriété accorOptOutDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOROptOutDate() {
        return accorOptOutDate;
    }

    /**
     * Définit la valeur de la propriété accorOptOutDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOROptOutDate(String value) {
        this.accorOptOutDate = value;
    }

    /**
     * Obtient la valeur de la propriété addressCleanseVerifiedFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCleanseVerifiedFlag() {
        return addressCleanseVerifiedFlag;
    }

    /**
     * Définit la valeur de la propriété addressCleanseVerifiedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCleanseVerifiedFlag(String value) {
        this.addressCleanseVerifiedFlag = value;
    }

    /**
     * Obtient la valeur de la propriété addressCleanseVerifiedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCleanseVerifiedStatus() {
        return addressCleanseVerifiedStatus;
    }

    /**
     * Définit la valeur de la propriété addressCleanseVerifiedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCleanseVerifiedStatus(String value) {
        this.addressCleanseVerifiedStatus = value;
    }

    /**
     * Obtient la valeur de la propriété accorAddressType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORAddressType() {
        return accorAddressType;
    }

    /**
     * Définit la valeur de la propriété accorAddressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORAddressType(String value) {
        this.accorAddressType = value;
    }

    /**
     * Obtient la valeur de la propriété listOfACCORAccountAddressUsageType.
     * 
     * @return
     *     possible object is
     *     {@link ListOfACCORAccountAddressUsageType }
     *     
     */
    public ListOfACCORAccountAddressUsageType getListOfACCORAccountAddressUsageType() {
        return listOfACCORAccountAddressUsageType;
    }

    /**
     * Définit la valeur de la propriété listOfACCORAccountAddressUsageType.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfACCORAccountAddressUsageType }
     *     
     */
    public void setListOfACCORAccountAddressUsageType(ListOfACCORAccountAddressUsageType value) {
        this.listOfACCORAccountAddressUsageType = value;
    }

    /**
     * Obtient la valeur de la propriété isPrimaryMVG.
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
     * Définit la valeur de la propriété isPrimaryMVG.
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
     * Obtient la valeur de la propriété operation.
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
     * Définit la valeur de la propriété operation.
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
     * Obtient la valeur de la propriété searchspec.
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
     * Définit la valeur de la propriété searchspec.
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
