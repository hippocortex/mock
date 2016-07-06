
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DnbAccount complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DnbAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentHQDUNS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateDUNS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateDUNS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BRiskBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BOriginalLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BOriginalDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalIdentificationNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BDNBUpdateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccountDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualSalesLocalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BDevise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BOutOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeHere2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORMailingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORRegisteredAddInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CableTelexNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORCEOFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORCEOTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryLocalActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearStarted1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualSalesLocalCurrencyCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORAnnualSalesUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeHereCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeTotalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORIncludePrinciples" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportExportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubsidiaryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORPreviousDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORReportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberofFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiasCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HierarchyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORMarketableIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBSIC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBSIC3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBSIC4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBSIC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBSIC6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BOriginalLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfDnbSic" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfDnbSic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DnbAccount", propOrder = {
    "dunsNumber3",
    "parentHQDUNS3",
    "domesticUltimateDUNS2",
    "globalUltimateDUNS3",
    "accorb2BRequestDate",
    "accorb2BRiskBand",
    "accorb2BOriginalLimit",
    "accorb2BOriginalDecision",
    "accorb2BComments",
    "employeeTotal",
    "accorb2BIDType",
    "nationalIdentificationNumber2",
    "sicCode",
    "accorb2BDNBUpdateStatus",
    "accorb2BAccountDUNSNumber",
    "businessName",
    "annualSalesLocalCurrency",
    "accorb2BDevise",
    "accorb2BOutOfBusiness",
    "employeeHere2",
    "mailAddress",
    "mailCity",
    "mailState",
    "mailZip",
    "accorMailingCountry",
    "accorRegisteredAddInd",
    "cableTelexNumber",
    "accorceoFullName",
    "accorceoTitle",
    "primaryLocalActivityCode",
    "accorActivityIndicator",
    "yearStarted1",
    "annualSalesLocalCurrencyCD",
    "accorAnnualSalesUS",
    "employeeHereCode",
    "employeeTotalCode",
    "accorIncludePrinciples",
    "importExportCode",
    "legalStatus2",
    "siteStatus",
    "subsidiaryIndicator",
    "accorPreviousDUNSNumber",
    "accorReportDate",
    "numberofFamilyMembers",
    "diasCode",
    "hierarchyCode",
    "familyUpdateDate",
    "accorMarketableIndicator",
    "accordnbsic2",
    "accordnbsic3",
    "accordnbsic4",
    "accordnbsic5",
    "accordnbsic6",
    "accorb2BOriginalLimitCurrency",
    "listOfDnbSic"
})
public class DnbAccount {

    @XmlElement(name = "DUNSNumber3")
    protected String dunsNumber3;
    @XmlElement(name = "ParentHQDUNS3")
    protected String parentHQDUNS3;
    @XmlElement(name = "DomesticUltimateDUNS2")
    protected String domesticUltimateDUNS2;
    @XmlElement(name = "GlobalUltimateDUNS3")
    protected String globalUltimateDUNS3;
    @XmlElement(name = "ACCORB2BRequestDate")
    protected String accorb2BRequestDate;
    @XmlElement(name = "ACCORB2BRiskBand")
    protected String accorb2BRiskBand;
    @XmlElement(name = "ACCORB2BOriginalLimit")
    protected String accorb2BOriginalLimit;
    @XmlElement(name = "ACCORB2BOriginalDecision")
    protected String accorb2BOriginalDecision;
    @XmlElement(name = "ACCORB2BComments")
    protected String accorb2BComments;
    @XmlElement(name = "EmployeeTotal")
    protected String employeeTotal;
    @XmlElement(name = "ACCORB2BIDType")
    protected String accorb2BIDType;
    @XmlElement(name = "NationalIdentificationNumber2")
    protected String nationalIdentificationNumber2;
    @XmlElement(name = "SICCode")
    protected String sicCode;
    @XmlElement(name = "ACCORB2BDNBUpdateStatus")
    protected String accorb2BDNBUpdateStatus;
    @XmlElement(name = "ACCORB2BAccountDUNSNumber")
    protected String accorb2BAccountDUNSNumber;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "AnnualSalesLocalCurrency")
    protected String annualSalesLocalCurrency;
    @XmlElement(name = "ACCORB2BDevise")
    protected String accorb2BDevise;
    @XmlElement(name = "ACCORB2BOutOfBusiness")
    protected String accorb2BOutOfBusiness;
    @XmlElement(name = "EmployeeHere2")
    protected String employeeHere2;
    @XmlElement(name = "MailAddress")
    protected String mailAddress;
    @XmlElement(name = "MailCity")
    protected String mailCity;
    @XmlElement(name = "MailState")
    protected String mailState;
    @XmlElement(name = "MailZip")
    protected String mailZip;
    @XmlElement(name = "ACCORMailingCountry")
    protected String accorMailingCountry;
    @XmlElement(name = "ACCORRegisteredAddInd")
    protected String accorRegisteredAddInd;
    @XmlElement(name = "CableTelexNumber")
    protected String cableTelexNumber;
    @XmlElement(name = "ACCORCEOFullName")
    protected String accorceoFullName;
    @XmlElement(name = "ACCORCEOTitle")
    protected String accorceoTitle;
    @XmlElement(name = "PrimaryLocalActivityCode")
    protected String primaryLocalActivityCode;
    @XmlElement(name = "ACCORActivityIndicator")
    protected String accorActivityIndicator;
    @XmlElement(name = "YearStarted1")
    protected String yearStarted1;
    @XmlElement(name = "AnnualSalesLocalCurrencyCD")
    protected String annualSalesLocalCurrencyCD;
    @XmlElement(name = "ACCORAnnualSalesUS")
    protected String accorAnnualSalesUS;
    @XmlElement(name = "EmployeeHereCode")
    protected String employeeHereCode;
    @XmlElement(name = "EmployeeTotalCode")
    protected String employeeTotalCode;
    @XmlElement(name = "ACCORIncludePrinciples")
    protected String accorIncludePrinciples;
    @XmlElement(name = "ImportExportCode")
    protected String importExportCode;
    @XmlElement(name = "LegalStatus2")
    protected String legalStatus2;
    @XmlElement(name = "SiteStatus")
    protected String siteStatus;
    @XmlElement(name = "SubsidiaryIndicator")
    protected String subsidiaryIndicator;
    @XmlElement(name = "ACCORPreviousDUNSNumber")
    protected String accorPreviousDUNSNumber;
    @XmlElement(name = "ACCORReportDate")
    protected String accorReportDate;
    @XmlElement(name = "NumberofFamilyMembers")
    protected String numberofFamilyMembers;
    @XmlElement(name = "DiasCode")
    protected String diasCode;
    @XmlElement(name = "HierarchyCode")
    protected String hierarchyCode;
    @XmlElement(name = "FamilyUpdateDate")
    protected String familyUpdateDate;
    @XmlElement(name = "ACCORMarketableIndicator")
    protected String accorMarketableIndicator;
    @XmlElement(name = "ACCORDNBSIC2")
    protected String accordnbsic2;
    @XmlElement(name = "ACCORDNBSIC3")
    protected String accordnbsic3;
    @XmlElement(name = "ACCORDNBSIC4")
    protected String accordnbsic4;
    @XmlElement(name = "ACCORDNBSIC5")
    protected String accordnbsic5;
    @XmlElement(name = "ACCORDNBSIC6")
    protected String accordnbsic6;
    @XmlElement(name = "ACCORB2BOriginalLimitCurrency")
    protected String accorb2BOriginalLimitCurrency;
    @XmlElement(name = "ListOfDnbSic")
    protected ListOfDnbSic listOfDnbSic;

    /**
     * Obtient la valeur de la propri�t� dunsNumber3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber3() {
        return dunsNumber3;
    }

    /**
     * D�finit la valeur de la propri�t� dunsNumber3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber3(String value) {
        this.dunsNumber3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� parentHQDUNS3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentHQDUNS3() {
        return parentHQDUNS3;
    }

    /**
     * D�finit la valeur de la propri�t� parentHQDUNS3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentHQDUNS3(String value) {
        this.parentHQDUNS3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� domesticUltimateDUNS2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticUltimateDUNS2() {
        return domesticUltimateDUNS2;
    }

    /**
     * D�finit la valeur de la propri�t� domesticUltimateDUNS2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticUltimateDUNS2(String value) {
        this.domesticUltimateDUNS2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� globalUltimateDUNS3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalUltimateDUNS3() {
        return globalUltimateDUNS3;
    }

    /**
     * D�finit la valeur de la propri�t� globalUltimateDUNS3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalUltimateDUNS3(String value) {
        this.globalUltimateDUNS3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BRequestDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BRequestDate() {
        return accorb2BRequestDate;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BRequestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BRequestDate(String value) {
        this.accorb2BRequestDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BRiskBand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BRiskBand() {
        return accorb2BRiskBand;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BRiskBand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BRiskBand(String value) {
        this.accorb2BRiskBand = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BOriginalLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BOriginalLimit() {
        return accorb2BOriginalLimit;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BOriginalLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BOriginalLimit(String value) {
        this.accorb2BOriginalLimit = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BOriginalDecision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BOriginalDecision() {
        return accorb2BOriginalDecision;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BOriginalDecision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BOriginalDecision(String value) {
        this.accorb2BOriginalDecision = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BComments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BComments() {
        return accorb2BComments;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BComments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BComments(String value) {
        this.accorb2BComments = value;
    }

    /**
     * Obtient la valeur de la propri�t� employeeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTotal() {
        return employeeTotal;
    }

    /**
     * D�finit la valeur de la propri�t� employeeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTotal(String value) {
        this.employeeTotal = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BIDType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BIDType() {
        return accorb2BIDType;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BIDType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BIDType(String value) {
        this.accorb2BIDType = value;
    }

    /**
     * Obtient la valeur de la propri�t� nationalIdentificationNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentificationNumber2() {
        return nationalIdentificationNumber2;
    }

    /**
     * D�finit la valeur de la propri�t� nationalIdentificationNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentificationNumber2(String value) {
        this.nationalIdentificationNumber2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� sicCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSICCode() {
        return sicCode;
    }

    /**
     * D�finit la valeur de la propri�t� sicCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSICCode(String value) {
        this.sicCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BDNBUpdateStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BDNBUpdateStatus() {
        return accorb2BDNBUpdateStatus;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BDNBUpdateStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BDNBUpdateStatus(String value) {
        this.accorb2BDNBUpdateStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAccountDUNSNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAccountDUNSNumber() {
        return accorb2BAccountDUNSNumber;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAccountDUNSNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAccountDUNSNumber(String value) {
        this.accorb2BAccountDUNSNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� businessName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * D�finit la valeur de la propri�t� businessName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Obtient la valeur de la propri�t� annualSalesLocalCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualSalesLocalCurrency() {
        return annualSalesLocalCurrency;
    }

    /**
     * D�finit la valeur de la propri�t� annualSalesLocalCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualSalesLocalCurrency(String value) {
        this.annualSalesLocalCurrency = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BDevise() {
        return accorb2BDevise;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BDevise(String value) {
        this.accorb2BDevise = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BOutOfBusiness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BOutOfBusiness() {
        return accorb2BOutOfBusiness;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BOutOfBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BOutOfBusiness(String value) {
        this.accorb2BOutOfBusiness = value;
    }

    /**
     * Obtient la valeur de la propri�t� employeeHere2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeHere2() {
        return employeeHere2;
    }

    /**
     * D�finit la valeur de la propri�t� employeeHere2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeHere2(String value) {
        this.employeeHere2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * D�finit la valeur de la propri�t� mailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress(String value) {
        this.mailAddress = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCity() {
        return mailCity;
    }

    /**
     * D�finit la valeur de la propri�t� mailCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCity(String value) {
        this.mailCity = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailState() {
        return mailState;
    }

    /**
     * D�finit la valeur de la propri�t� mailState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailState(String value) {
        this.mailState = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailZip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailZip() {
        return mailZip;
    }

    /**
     * D�finit la valeur de la propri�t� mailZip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailZip(String value) {
        this.mailZip = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorMailingCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORMailingCountry() {
        return accorMailingCountry;
    }

    /**
     * D�finit la valeur de la propri�t� accorMailingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORMailingCountry(String value) {
        this.accorMailingCountry = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorRegisteredAddInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORRegisteredAddInd() {
        return accorRegisteredAddInd;
    }

    /**
     * D�finit la valeur de la propri�t� accorRegisteredAddInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORRegisteredAddInd(String value) {
        this.accorRegisteredAddInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� cableTelexNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableTelexNumber() {
        return cableTelexNumber;
    }

    /**
     * D�finit la valeur de la propri�t� cableTelexNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableTelexNumber(String value) {
        this.cableTelexNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorceoFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORCEOFullName() {
        return accorceoFullName;
    }

    /**
     * D�finit la valeur de la propri�t� accorceoFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORCEOFullName(String value) {
        this.accorceoFullName = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorceoTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORCEOTitle() {
        return accorceoTitle;
    }

    /**
     * D�finit la valeur de la propri�t� accorceoTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORCEOTitle(String value) {
        this.accorceoTitle = value;
    }

    /**
     * Obtient la valeur de la propri�t� primaryLocalActivityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLocalActivityCode() {
        return primaryLocalActivityCode;
    }

    /**
     * D�finit la valeur de la propri�t� primaryLocalActivityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLocalActivityCode(String value) {
        this.primaryLocalActivityCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorActivityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORActivityIndicator() {
        return accorActivityIndicator;
    }

    /**
     * D�finit la valeur de la propri�t� accorActivityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORActivityIndicator(String value) {
        this.accorActivityIndicator = value;
    }

    /**
     * Obtient la valeur de la propri�t� yearStarted1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearStarted1() {
        return yearStarted1;
    }

    /**
     * D�finit la valeur de la propri�t� yearStarted1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearStarted1(String value) {
        this.yearStarted1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� annualSalesLocalCurrencyCD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualSalesLocalCurrencyCD() {
        return annualSalesLocalCurrencyCD;
    }

    /**
     * D�finit la valeur de la propri�t� annualSalesLocalCurrencyCD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualSalesLocalCurrencyCD(String value) {
        this.annualSalesLocalCurrencyCD = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorAnnualSalesUS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORAnnualSalesUS() {
        return accorAnnualSalesUS;
    }

    /**
     * D�finit la valeur de la propri�t� accorAnnualSalesUS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORAnnualSalesUS(String value) {
        this.accorAnnualSalesUS = value;
    }

    /**
     * Obtient la valeur de la propri�t� employeeHereCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeHereCode() {
        return employeeHereCode;
    }

    /**
     * D�finit la valeur de la propri�t� employeeHereCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeHereCode(String value) {
        this.employeeHereCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� employeeTotalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTotalCode() {
        return employeeTotalCode;
    }

    /**
     * D�finit la valeur de la propri�t� employeeTotalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTotalCode(String value) {
        this.employeeTotalCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorIncludePrinciples.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORIncludePrinciples() {
        return accorIncludePrinciples;
    }

    /**
     * D�finit la valeur de la propri�t� accorIncludePrinciples.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORIncludePrinciples(String value) {
        this.accorIncludePrinciples = value;
    }

    /**
     * Obtient la valeur de la propri�t� importExportCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportExportCode() {
        return importExportCode;
    }

    /**
     * D�finit la valeur de la propri�t� importExportCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportExportCode(String value) {
        this.importExportCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� legalStatus2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus2() {
        return legalStatus2;
    }

    /**
     * D�finit la valeur de la propri�t� legalStatus2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus2(String value) {
        this.legalStatus2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� siteStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteStatus() {
        return siteStatus;
    }

    /**
     * D�finit la valeur de la propri�t� siteStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteStatus(String value) {
        this.siteStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� subsidiaryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidiaryIndicator() {
        return subsidiaryIndicator;
    }

    /**
     * D�finit la valeur de la propri�t� subsidiaryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidiaryIndicator(String value) {
        this.subsidiaryIndicator = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorPreviousDUNSNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORPreviousDUNSNumber() {
        return accorPreviousDUNSNumber;
    }

    /**
     * D�finit la valeur de la propri�t� accorPreviousDUNSNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORPreviousDUNSNumber(String value) {
        this.accorPreviousDUNSNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorReportDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORReportDate() {
        return accorReportDate;
    }

    /**
     * D�finit la valeur de la propri�t� accorReportDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORReportDate(String value) {
        this.accorReportDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberofFamilyMembers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberofFamilyMembers() {
        return numberofFamilyMembers;
    }

    /**
     * D�finit la valeur de la propri�t� numberofFamilyMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberofFamilyMembers(String value) {
        this.numberofFamilyMembers = value;
    }

    /**
     * Obtient la valeur de la propri�t� diasCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiasCode() {
        return diasCode;
    }

    /**
     * D�finit la valeur de la propri�t� diasCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiasCode(String value) {
        this.diasCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� hierarchyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyCode() {
        return hierarchyCode;
    }

    /**
     * D�finit la valeur de la propri�t� hierarchyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyCode(String value) {
        this.hierarchyCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� familyUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyUpdateDate() {
        return familyUpdateDate;
    }

    /**
     * D�finit la valeur de la propri�t� familyUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyUpdateDate(String value) {
        this.familyUpdateDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorMarketableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORMarketableIndicator() {
        return accorMarketableIndicator;
    }

    /**
     * D�finit la valeur de la propri�t� accorMarketableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORMarketableIndicator(String value) {
        this.accorMarketableIndicator = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbsic2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBSIC2() {
        return accordnbsic2;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbsic2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBSIC2(String value) {
        this.accordnbsic2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbsic3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBSIC3() {
        return accordnbsic3;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbsic3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBSIC3(String value) {
        this.accordnbsic3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbsic4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBSIC4() {
        return accordnbsic4;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbsic4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBSIC4(String value) {
        this.accordnbsic4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbsic5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBSIC5() {
        return accordnbsic5;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbsic5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBSIC5(String value) {
        this.accordnbsic5 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbsic6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBSIC6() {
        return accordnbsic6;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbsic6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBSIC6(String value) {
        this.accordnbsic6 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BOriginalLimitCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BOriginalLimitCurrency() {
        return accorb2BOriginalLimitCurrency;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BOriginalLimitCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BOriginalLimitCurrency(String value) {
        this.accorb2BOriginalLimitCurrency = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfDnbSic.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDnbSic }
     *     
     */
    public ListOfDnbSic getListOfDnbSic() {
        return listOfDnbSic;
    }

    /**
     * D�finit la valeur de la propri�t� listOfDnbSic.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDnbSic }
     *     
     */
    public void setListOfDnbSic(ListOfDnbSic value) {
        this.listOfDnbSic = value;
    }

}
