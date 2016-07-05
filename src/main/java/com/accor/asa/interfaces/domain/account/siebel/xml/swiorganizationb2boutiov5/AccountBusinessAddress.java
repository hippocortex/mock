
package com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Account_BusinessAddress complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� addressId.
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
     * D�finit la valeur de la propri�t� addressId.
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
     * Obtient la valeur de la propri�t� addressIntegrationId.
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
     * D�finit la valeur de la propri�t� addressIntegrationId.
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
     * Obtient la valeur de la propri�t� billAddressFlag.
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
     * D�finit la valeur de la propri�t� billAddressFlag.
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
     * Obtient la valeur de la propri�t� addressName.
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
     * D�finit la valeur de la propri�t� addressName.
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
     * Obtient la valeur de la propri�t� streetAddress.
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
     * D�finit la valeur de la propri�t� streetAddress.
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
     * Obtient la valeur de la propri�t� streetAddress2.
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
     * D�finit la valeur de la propri�t� streetAddress2.
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
     * Obtient la valeur de la propri�t� apartmentNumber.
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
     * D�finit la valeur de la propri�t� apartmentNumber.
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
     * Obtient la valeur de la propri�t� accorAddressLine4.
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
     * D�finit la valeur de la propri�t� accorAddressLine4.
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
     * Obtient la valeur de la propri�t� city.
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
     * D�finit la valeur de la propri�t� city.
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
     * Obtient la valeur de la propri�t� postalCode.
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
     * D�finit la valeur de la propri�t� postalCode.
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
     * Obtient la valeur de la propri�t� country.
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
     * D�finit la valeur de la propri�t� country.
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
     * Obtient la valeur de la propri�t� state.
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
     * D�finit la valeur de la propri�t� state.
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
     * Obtient la valeur de la propri�t� accornpaiFlag.
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
     * D�finit la valeur de la propri�t� accornpaiFlag.
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
     * Obtient la valeur de la propri�t� accornpaiDate.
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
     * D�finit la valeur de la propri�t� accornpaiDate.
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
     * Obtient la valeur de la propri�t� accorOptOutFlag.
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
     * D�finit la valeur de la propri�t� accorOptOutFlag.
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
     * Obtient la valeur de la propri�t� accorOptOutDate.
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
     * D�finit la valeur de la propri�t� accorOptOutDate.
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
     * Obtient la valeur de la propri�t� addressCleanseVerifiedFlag.
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
     * D�finit la valeur de la propri�t� addressCleanseVerifiedFlag.
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
     * Obtient la valeur de la propri�t� addressCleanseVerifiedStatus.
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
     * D�finit la valeur de la propri�t� addressCleanseVerifiedStatus.
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
     * Obtient la valeur de la propri�t� accorAddressType.
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
     * D�finit la valeur de la propri�t� accorAddressType.
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
     * Obtient la valeur de la propri�t� listOfACCORAccountAddressUsageType.
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
     * D�finit la valeur de la propri�t� listOfACCORAccountAddressUsageType.
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
