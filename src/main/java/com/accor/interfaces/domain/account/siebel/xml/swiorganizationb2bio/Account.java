
package com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio;

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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateSDQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSFAAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCreatedByLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BPhonePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BFaxPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccountResponsableLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BResponsableNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BResponsablePrenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BParentAccountResponsableLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BMasterAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BBusinessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BKeyAccountClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BInactiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSystematicTracking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCASociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BBusinessLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BBusinessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BMainAccorDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BTypeSociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDescription2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDescription3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCreditManagement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BLastUpdatedGrappe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BLastUpdatedGrappeSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORContratNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBDevise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBNationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBOutBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORDNBTotalEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccountCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BBookingCodeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BNetPriceRemunerationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BReservationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BTerritoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAgencyUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAgencyCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BHomeAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BPreviousAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BToBeDeleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BDeletionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BNetworkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BNetworkTARSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BNetworkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BExternalAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSuspiciousAgencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BConsortiumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BConsortiumTARSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSuspiciousAgencyStatusLastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSuspiciousAgencyComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BNoshowPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCancelledRevenue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BTARSTransferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccessCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BAccessCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BStartDateValidity1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BStartDateValidity2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BSubsidiaryAccountClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BIndividualGenericAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BLeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BCreatedByDelphi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCORB2BUpdatedByDelphi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfCifAccountReference" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfCifAccountReference" minOccurs="0"/>
 *         &lt;element name="ListOfDnbAccount" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfDnbAccount" minOccurs="0"/>
 *         &lt;element name="ListOfAccorSegment" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccorSegment" minOccurs="0"/>
 *         &lt;element name="ListOfAccount_BusinessAddress" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccount_BusinessAddress" minOccurs="0"/>
 *         &lt;element name="ListOfAccorAccountSegment" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccorAccountSegment" minOccurs="0"/>
 *         &lt;element name="ListOfAccorDistribution" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccorDistribution" minOccurs="0"/>
 *         &lt;element name="ListOfAccorB2bAccountResaHabitsDistribMode" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccorB2bAccountResaHabitsDistribMode" minOccurs="0"/>
 *         &lt;element name="ListOfAccorB2bAccountResaHabitsResaMode" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccorB2bAccountResaHabitsResaMode" minOccurs="0"/>
 *         &lt;element name="ListOfAccorB2bAccountCi" type="{http://www.siebel.com/xml/SwiOrganizationB2BIOV5}ListOfAccorB2bAccountCi" minOccurs="0"/>
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
    "id",
    "rowId",
    "partyTypeCode",
    "partyUId",
    "lastUpdateSDQ",
    "updatedBy",
    "updated",
    "location",
    "integrationId",
    "name",
    "accorb2BLegalName",
    "accountStatus",
    "accorb2BSFAAccountStatus",
    "status",
    "type",
    "accorb2BCreatedDate",
    "accountCreatedBy",
    "accorb2BCreatedByLogin",
    "accorb2BUpdated",
    "accountUpdatedBy",
    "accorb2BUpdatedBy",
    "accorb2BPhonePrefix",
    "accorb2BClientType",
    "mainPhoneNumber",
    "accorb2BFaxPrefix",
    "mainFaxNumber",
    "homePage",
    "accorb2BEmail",
    "accorb2BAccountResponsableLogin",
    "accorb2BResponsableNom",
    "accorb2BResponsablePrenom",
    "parentAccountIntegrationId",
    "accorb2BParentAccountResponsableLogin",
    "accorb2BMasterAccountIntegrationId",
    "accorb2BBusinessType",
    "accorb2BKeyAccountClassification",
    "accorb2BInactiveFlag",
    "accorb2BSystematicTracking",
    "dunsNumber",
    "accorb2BCapital",
    "accorb2BCASociete",
    "accorb2BBusinessLine",
    "accorb2BBusinessSector",
    "accorb2BMainAccorDivision",
    "accorb2BRegistrationNumber",
    "accorb2BTypeSociete",
    "description",
    "accorDescription2",
    "accorDescription3",
    "accorb2BCreditManagement",
    "accorb2BLastUpdatedGrappe",
    "accorb2BLastUpdatedGrappeSystemId",
    "accorContratNumber",
    "accordnbDevise",
    "accordnbNationalID",
    "accordnbidType",
    "accordnbOutBusiness",
    "accordnbTotalEmployees",
    "accorb2BAccountCategory",
    "accorb2BBookingCodeSource",
    "accorb2BBookingCode",
    "accorb2BRecordType",
    "accorb2BNetPriceRemunerationFlag",
    "accorb2BReservationMode",
    "accorb2BTerritoryCode",
    "accorb2BAgencyUpdated",
    "accorb2BAgencyCreated",
    "accorb2BAccountStatus",
    "accorb2BHomeAgencyCode",
    "accorb2BPreviousAgencyCode",
    "accorb2BTransactionCode",
    "accorb2BToBeDeleted",
    "accorb2BDeletionReason",
    "accorb2BNetworkId",
    "accorb2BNetworkTARSCode",
    "accorb2BNetworkName",
    "accorb2BExternalAgencyCode",
    "accorb2BSuspiciousAgencyStatus",
    "accorb2BConsortiumName",
    "accorb2BConsortiumTARSCode",
    "accorb2BSuspiciousAgencyStatusLastUpdate",
    "accorb2BSuspiciousAgencyComments",
    "accorb2BNoshowPercentage",
    "accorb2BCancelledRevenue",
    "accorb2BTARSTransferred",
    "accorb2BAccessCode1",
    "accorb2BAccessCode2",
    "accorb2BStartDateValidity1",
    "accorb2BStartDateValidity2",
    "accorb2BExpirationDate",
    "accorb2BSubsidiaryAccountClassification",
    "accorb2BIndividualGenericAccount",
    "accorb2BLeadSource",
    "accorb2BCreatedByDelphi",
    "accorb2BUpdatedByDelphi",
    "listOfCifAccountReference",
    "listOfDnbAccount",
    "listOfAccorSegment",
    "listOfAccountBusinessAddress",
    "listOfAccorAccountSegment",
    "listOfAccorDistribution",
    "listOfAccorB2BAccountResaHabitsDistribMode",
    "listOfAccorB2BAccountResaHabitsResaMode",
    "listOfAccorB2BAccountCi"
})
public class Account {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "PartyTypeCode")
    protected String partyTypeCode;
    @XmlElement(name = "PartyUId")
    protected String partyUId;
    @XmlElement(name = "LastUpdateSDQ")
    protected String lastUpdateSDQ;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ACCORB2BLegalName")
    protected String accorb2BLegalName;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "ACCORB2BSFAAccountStatus")
    protected String accorb2BSFAAccountStatus;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "ACCORB2BCreatedDate")
    protected String accorb2BCreatedDate;
    @XmlElement(name = "AccountCreatedBy")
    protected String accountCreatedBy;
    @XmlElement(name = "ACCORB2BCreatedByLogin")
    protected String accorb2BCreatedByLogin;
    @XmlElement(name = "ACCORB2BUpdated")
    protected String accorb2BUpdated;
    @XmlElement(name = "AccountUpdatedBy")
    protected String accountUpdatedBy;
    @XmlElement(name = "ACCORB2BUpdatedBy")
    protected String accorb2BUpdatedBy;
    @XmlElement(name = "ACCORB2BPhonePrefix")
    protected String accorb2BPhonePrefix;
    @XmlElement(name = "ACCORB2BClientType")
    protected String accorb2BClientType;
    @XmlElement(name = "MainPhoneNumber")
    protected String mainPhoneNumber;
    @XmlElement(name = "ACCORB2BFaxPrefix")
    protected String accorb2BFaxPrefix;
    @XmlElement(name = "MainFaxNumber")
    protected String mainFaxNumber;
    @XmlElement(name = "HomePage")
    protected String homePage;
    @XmlElement(name = "ACCORB2BEmail")
    protected String accorb2BEmail;
    @XmlElement(name = "ACCORB2BAccountResponsableLogin")
    protected String accorb2BAccountResponsableLogin;
    @XmlElement(name = "ACCORB2BResponsableNom")
    protected String accorb2BResponsableNom;
    @XmlElement(name = "ACCORB2BResponsablePrenom")
    protected String accorb2BResponsablePrenom;
    @XmlElement(name = "ParentAccountIntegrationId")
    protected String parentAccountIntegrationId;
    @XmlElement(name = "ACCORB2BParentAccountResponsableLogin")
    protected String accorb2BParentAccountResponsableLogin;
    @XmlElement(name = "ACCORB2BMasterAccountIntegrationId")
    protected String accorb2BMasterAccountIntegrationId;
    @XmlElement(name = "ACCORB2BBusinessType")
    protected String accorb2BBusinessType;
    @XmlElement(name = "ACCORB2BKeyAccountClassification")
    protected String accorb2BKeyAccountClassification;
    @XmlElement(name = "ACCORB2BInactiveFlag")
    protected String accorb2BInactiveFlag;
    @XmlElement(name = "ACCORB2BSystematicTracking")
    protected String accorb2BSystematicTracking;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "ACCORB2BCapital")
    protected String accorb2BCapital;
    @XmlElement(name = "ACCORB2BCASociete")
    protected String accorb2BCASociete;
    @XmlElement(name = "ACCORB2BBusinessLine")
    protected String accorb2BBusinessLine;
    @XmlElement(name = "ACCORB2BBusinessSector")
    protected String accorb2BBusinessSector;
    @XmlElement(name = "ACCORB2BMainAccorDivision")
    protected String accorb2BMainAccorDivision;
    @XmlElement(name = "ACCORB2BRegistrationNumber")
    protected String accorb2BRegistrationNumber;
    @XmlElement(name = "ACCORB2BTypeSociete")
    protected String accorb2BTypeSociete;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ACCORDescription2")
    protected String accorDescription2;
    @XmlElement(name = "ACCORDescription3")
    protected String accorDescription3;
    @XmlElement(name = "ACCORB2BCreditManagement")
    protected String accorb2BCreditManagement;
    @XmlElement(name = "ACCORB2BLastUpdatedGrappe")
    protected String accorb2BLastUpdatedGrappe;
    @XmlElement(name = "ACCORB2BLastUpdatedGrappeSystemId")
    protected String accorb2BLastUpdatedGrappeSystemId;
    @XmlElement(name = "ACCORContratNumber")
    protected String accorContratNumber;
    @XmlElement(name = "ACCORDNBDevise")
    protected String accordnbDevise;
    @XmlElement(name = "ACCORDNBNationalID")
    protected String accordnbNationalID;
    @XmlElement(name = "ACCORDNBIDType")
    protected String accordnbidType;
    @XmlElement(name = "ACCORDNBOutBusiness")
    protected String accordnbOutBusiness;
    @XmlElement(name = "ACCORDNBTotalEmployees")
    protected String accordnbTotalEmployees;
    @XmlElement(name = "ACCORB2BAccountCategory")
    protected String accorb2BAccountCategory;
    @XmlElement(name = "ACCORB2BBookingCodeSource")
    protected String accorb2BBookingCodeSource;
    @XmlElement(name = "ACCORB2BBookingCode")
    protected String accorb2BBookingCode;
    @XmlElement(name = "ACCORB2BRecordType")
    protected String accorb2BRecordType;
    @XmlElement(name = "ACCORB2BNetPriceRemunerationFlag")
    protected String accorb2BNetPriceRemunerationFlag;
    @XmlElement(name = "ACCORB2BReservationMode")
    protected String accorb2BReservationMode;
    @XmlElement(name = "ACCORB2BTerritoryCode")
    protected String accorb2BTerritoryCode;
    @XmlElement(name = "ACCORB2BAgencyUpdated")
    protected String accorb2BAgencyUpdated;
    @XmlElement(name = "ACCORB2BAgencyCreated")
    protected String accorb2BAgencyCreated;
    @XmlElement(name = "ACCORB2BAccountStatus")
    protected String accorb2BAccountStatus;
    @XmlElement(name = "ACCORB2BHomeAgencyCode")
    protected String accorb2BHomeAgencyCode;
    @XmlElement(name = "ACCORB2BPreviousAgencyCode")
    protected String accorb2BPreviousAgencyCode;
    @XmlElement(name = "ACCORB2BTransactionCode")
    protected String accorb2BTransactionCode;
    @XmlElement(name = "ACCORB2BToBeDeleted")
    protected String accorb2BToBeDeleted;
    @XmlElement(name = "ACCORB2BDeletionReason")
    protected String accorb2BDeletionReason;
    @XmlElement(name = "ACCORB2BNetworkId")
    protected String accorb2BNetworkId;
    @XmlElement(name = "ACCORB2BNetworkTARSCode")
    protected String accorb2BNetworkTARSCode;
    @XmlElement(name = "ACCORB2BNetworkName")
    protected String accorb2BNetworkName;
    @XmlElement(name = "ACCORB2BExternalAgencyCode")
    protected String accorb2BExternalAgencyCode;
    @XmlElement(name = "ACCORB2BSuspiciousAgencyStatus")
    protected String accorb2BSuspiciousAgencyStatus;
    @XmlElement(name = "ACCORB2BConsortiumName")
    protected String accorb2BConsortiumName;
    @XmlElement(name = "ACCORB2BConsortiumTARSCode")
    protected String accorb2BConsortiumTARSCode;
    @XmlElement(name = "ACCORB2BSuspiciousAgencyStatusLastUpdate")
    protected String accorb2BSuspiciousAgencyStatusLastUpdate;
    @XmlElement(name = "ACCORB2BSuspiciousAgencyComments")
    protected String accorb2BSuspiciousAgencyComments;
    @XmlElement(name = "ACCORB2BNoshowPercentage")
    protected String accorb2BNoshowPercentage;
    @XmlElement(name = "ACCORB2BCancelledRevenue")
    protected String accorb2BCancelledRevenue;
    @XmlElement(name = "ACCORB2BTARSTransferred")
    protected String accorb2BTARSTransferred;
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
    @XmlElement(name = "ACCORB2BSubsidiaryAccountClassification")
    protected String accorb2BSubsidiaryAccountClassification;
    @XmlElement(name = "ACCORB2BIndividualGenericAccount")
    protected String accorb2BIndividualGenericAccount;
    @XmlElement(name = "ACCORB2BLeadSource")
    protected String accorb2BLeadSource;
    @XmlElement(name = "ACCORB2BCreatedByDelphi")
    protected String accorb2BCreatedByDelphi;
    @XmlElement(name = "ACCORB2BUpdatedByDelphi")
    protected String accorb2BUpdatedByDelphi;
    @XmlElement(name = "ListOfCifAccountReference")
    protected ListOfCifAccountReference listOfCifAccountReference;
    @XmlElement(name = "ListOfDnbAccount")
    protected ListOfDnbAccount listOfDnbAccount;
    @XmlElement(name = "ListOfAccorSegment")
    protected ListOfAccorSegment listOfAccorSegment;
    @XmlElement(name = "ListOfAccount_BusinessAddress")
    protected ListOfAccountBusinessAddress listOfAccountBusinessAddress;
    @XmlElement(name = "ListOfAccorAccountSegment")
    protected ListOfAccorAccountSegment listOfAccorAccountSegment;
    @XmlElement(name = "ListOfAccorDistribution")
    protected ListOfAccorDistribution listOfAccorDistribution;
    @XmlElement(name = "ListOfAccorB2bAccountResaHabitsDistribMode")
    protected ListOfAccorB2BAccountResaHabitsDistribMode listOfAccorB2BAccountResaHabitsDistribMode;
    @XmlElement(name = "ListOfAccorB2bAccountResaHabitsResaMode")
    protected ListOfAccorB2BAccountResaHabitsResaMode listOfAccorB2BAccountResaHabitsResaMode;
    @XmlElement(name = "ListOfAccorB2bAccountCi")
    protected ListOfAccorB2BAccountCi listOfAccorB2BAccountCi;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

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
     * Obtient la valeur de la propri�t� rowId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * D�finit la valeur de la propri�t� rowId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Obtient la valeur de la propri�t� partyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * D�finit la valeur de la propri�t� partyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTypeCode(String value) {
        this.partyTypeCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� partyUId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUId() {
        return partyUId;
    }

    /**
     * D�finit la valeur de la propri�t� partyUId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUId(String value) {
        this.partyUId = value;
    }

    /**
     * Obtient la valeur de la propri�t� lastUpdateSDQ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateSDQ() {
        return lastUpdateSDQ;
    }

    /**
     * D�finit la valeur de la propri�t� lastUpdateSDQ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateSDQ(String value) {
        this.lastUpdateSDQ = value;
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
     * Obtient la valeur de la propri�t� location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * D�finit la valeur de la propri�t� location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

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
     * Obtient la valeur de la propri�t� accorb2BLegalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BLegalName() {
        return accorb2BLegalName;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BLegalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BLegalName(String value) {
        this.accorb2BLegalName = value;
    }

    /**
     * Obtient la valeur de la propri�t� accountStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * D�finit la valeur de la propri�t� accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSFAAccountStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSFAAccountStatus() {
        return accorb2BSFAAccountStatus;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSFAAccountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSFAAccountStatus(String value) {
        this.accorb2BSFAAccountStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCreatedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCreatedDate() {
        return accorb2BCreatedDate;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCreatedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCreatedDate(String value) {
        this.accorb2BCreatedDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� accountCreatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCreatedBy() {
        return accountCreatedBy;
    }

    /**
     * D�finit la valeur de la propri�t� accountCreatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCreatedBy(String value) {
        this.accountCreatedBy = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCreatedByLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCreatedByLogin() {
        return accorb2BCreatedByLogin;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCreatedByLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCreatedByLogin(String value) {
        this.accorb2BCreatedByLogin = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BUpdated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BUpdated() {
        return accorb2BUpdated;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BUpdated(String value) {
        this.accorb2BUpdated = value;
    }

    /**
     * Obtient la valeur de la propri�t� accountUpdatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUpdatedBy() {
        return accountUpdatedBy;
    }

    /**
     * D�finit la valeur de la propri�t� accountUpdatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUpdatedBy(String value) {
        this.accountUpdatedBy = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BUpdatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BUpdatedBy() {
        return accorb2BUpdatedBy;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BUpdatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BUpdatedBy(String value) {
        this.accorb2BUpdatedBy = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BPhonePrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BPhonePrefix() {
        return accorb2BPhonePrefix;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BPhonePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BPhonePrefix(String value) {
        this.accorb2BPhonePrefix = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BClientType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BClientType() {
        return accorb2BClientType;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BClientType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BClientType(String value) {
        this.accorb2BClientType = value;
    }

    /**
     * Obtient la valeur de la propri�t� mainPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    /**
     * D�finit la valeur de la propri�t� mainPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoneNumber(String value) {
        this.mainPhoneNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BFaxPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BFaxPrefix() {
        return accorb2BFaxPrefix;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BFaxPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BFaxPrefix(String value) {
        this.accorb2BFaxPrefix = value;
    }

    /**
     * Obtient la valeur de la propri�t� mainFaxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFaxNumber() {
        return mainFaxNumber;
    }

    /**
     * D�finit la valeur de la propri�t� mainFaxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFaxNumber(String value) {
        this.mainFaxNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� homePage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * D�finit la valeur de la propri�t� homePage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BEmail() {
        return accorb2BEmail;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BEmail(String value) {
        this.accorb2BEmail = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAccountResponsableLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAccountResponsableLogin() {
        return accorb2BAccountResponsableLogin;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAccountResponsableLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAccountResponsableLogin(String value) {
        this.accorb2BAccountResponsableLogin = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BResponsableNom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BResponsableNom() {
        return accorb2BResponsableNom;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BResponsableNom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BResponsableNom(String value) {
        this.accorb2BResponsableNom = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BResponsablePrenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BResponsablePrenom() {
        return accorb2BResponsablePrenom;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BResponsablePrenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BResponsablePrenom(String value) {
        this.accorb2BResponsablePrenom = value;
    }

    /**
     * Obtient la valeur de la propri�t� parentAccountIntegrationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountIntegrationId() {
        return parentAccountIntegrationId;
    }

    /**
     * D�finit la valeur de la propri�t� parentAccountIntegrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountIntegrationId(String value) {
        this.parentAccountIntegrationId = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BParentAccountResponsableLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BParentAccountResponsableLogin() {
        return accorb2BParentAccountResponsableLogin;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BParentAccountResponsableLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BParentAccountResponsableLogin(String value) {
        this.accorb2BParentAccountResponsableLogin = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BMasterAccountIntegrationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BMasterAccountIntegrationId() {
        return accorb2BMasterAccountIntegrationId;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BMasterAccountIntegrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BMasterAccountIntegrationId(String value) {
        this.accorb2BMasterAccountIntegrationId = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BBusinessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BBusinessType() {
        return accorb2BBusinessType;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BBusinessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BBusinessType(String value) {
        this.accorb2BBusinessType = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BKeyAccountClassification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BKeyAccountClassification() {
        return accorb2BKeyAccountClassification;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BKeyAccountClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BKeyAccountClassification(String value) {
        this.accorb2BKeyAccountClassification = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BInactiveFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BInactiveFlag() {
        return accorb2BInactiveFlag;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BInactiveFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BInactiveFlag(String value) {
        this.accorb2BInactiveFlag = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSystematicTracking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSystematicTracking() {
        return accorb2BSystematicTracking;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSystematicTracking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSystematicTracking(String value) {
        this.accorb2BSystematicTracking = value;
    }

    /**
     * Obtient la valeur de la propri�t� dunsNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * D�finit la valeur de la propri�t� dunsNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCapital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCapital() {
        return accorb2BCapital;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCapital(String value) {
        this.accorb2BCapital = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCASociete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCASociete() {
        return accorb2BCASociete;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCASociete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCASociete(String value) {
        this.accorb2BCASociete = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BBusinessLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BBusinessLine() {
        return accorb2BBusinessLine;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BBusinessLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BBusinessLine(String value) {
        this.accorb2BBusinessLine = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BBusinessSector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BBusinessSector() {
        return accorb2BBusinessSector;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BBusinessSector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BBusinessSector(String value) {
        this.accorb2BBusinessSector = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BMainAccorDivision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BMainAccorDivision() {
        return accorb2BMainAccorDivision;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BMainAccorDivision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BMainAccorDivision(String value) {
        this.accorb2BMainAccorDivision = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BRegistrationNumber() {
        return accorb2BRegistrationNumber;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BRegistrationNumber(String value) {
        this.accorb2BRegistrationNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BTypeSociete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BTypeSociete() {
        return accorb2BTypeSociete;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BTypeSociete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BTypeSociete(String value) {
        this.accorb2BTypeSociete = value;
    }

    /**
     * Obtient la valeur de la propri�t� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * D�finit la valeur de la propri�t� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorDescription2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDescription2() {
        return accorDescription2;
    }

    /**
     * D�finit la valeur de la propri�t� accorDescription2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDescription2(String value) {
        this.accorDescription2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorDescription3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDescription3() {
        return accorDescription3;
    }

    /**
     * D�finit la valeur de la propri�t� accorDescription3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDescription3(String value) {
        this.accorDescription3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCreditManagement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCreditManagement() {
        return accorb2BCreditManagement;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCreditManagement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCreditManagement(String value) {
        this.accorb2BCreditManagement = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BLastUpdatedGrappe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BLastUpdatedGrappe() {
        return accorb2BLastUpdatedGrappe;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BLastUpdatedGrappe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BLastUpdatedGrappe(String value) {
        this.accorb2BLastUpdatedGrappe = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BLastUpdatedGrappeSystemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BLastUpdatedGrappeSystemId() {
        return accorb2BLastUpdatedGrappeSystemId;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BLastUpdatedGrappeSystemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BLastUpdatedGrappeSystemId(String value) {
        this.accorb2BLastUpdatedGrappeSystemId = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorContratNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORContratNumber() {
        return accorContratNumber;
    }

    /**
     * D�finit la valeur de la propri�t� accorContratNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORContratNumber(String value) {
        this.accorContratNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBDevise() {
        return accordnbDevise;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBDevise(String value) {
        this.accordnbDevise = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbNationalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBNationalID() {
        return accordnbNationalID;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbNationalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBNationalID(String value) {
        this.accordnbNationalID = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbidType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBIDType() {
        return accordnbidType;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbidType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBIDType(String value) {
        this.accordnbidType = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbOutBusiness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBOutBusiness() {
        return accordnbOutBusiness;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbOutBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBOutBusiness(String value) {
        this.accordnbOutBusiness = value;
    }

    /**
     * Obtient la valeur de la propri�t� accordnbTotalEmployees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORDNBTotalEmployees() {
        return accordnbTotalEmployees;
    }

    /**
     * D�finit la valeur de la propri�t� accordnbTotalEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORDNBTotalEmployees(String value) {
        this.accordnbTotalEmployees = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAccountCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAccountCategory() {
        return accorb2BAccountCategory;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAccountCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAccountCategory(String value) {
        this.accorb2BAccountCategory = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BBookingCodeSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BBookingCodeSource() {
        return accorb2BBookingCodeSource;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BBookingCodeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BBookingCodeSource(String value) {
        this.accorb2BBookingCodeSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BBookingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BBookingCode() {
        return accorb2BBookingCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BBookingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BBookingCode(String value) {
        this.accorb2BBookingCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BRecordType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BRecordType() {
        return accorb2BRecordType;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BRecordType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BRecordType(String value) {
        this.accorb2BRecordType = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BNetPriceRemunerationFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BNetPriceRemunerationFlag() {
        return accorb2BNetPriceRemunerationFlag;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BNetPriceRemunerationFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BNetPriceRemunerationFlag(String value) {
        this.accorb2BNetPriceRemunerationFlag = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BReservationMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BReservationMode() {
        return accorb2BReservationMode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BReservationMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BReservationMode(String value) {
        this.accorb2BReservationMode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BTerritoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BTerritoryCode() {
        return accorb2BTerritoryCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BTerritoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BTerritoryCode(String value) {
        this.accorb2BTerritoryCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAgencyUpdated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAgencyUpdated() {
        return accorb2BAgencyUpdated;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAgencyUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAgencyUpdated(String value) {
        this.accorb2BAgencyUpdated = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAgencyCreated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAgencyCreated() {
        return accorb2BAgencyCreated;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAgencyCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAgencyCreated(String value) {
        this.accorb2BAgencyCreated = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BAccountStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BAccountStatus() {
        return accorb2BAccountStatus;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BAccountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BAccountStatus(String value) {
        this.accorb2BAccountStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BHomeAgencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BHomeAgencyCode() {
        return accorb2BHomeAgencyCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BHomeAgencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BHomeAgencyCode(String value) {
        this.accorb2BHomeAgencyCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BPreviousAgencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BPreviousAgencyCode() {
        return accorb2BPreviousAgencyCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BPreviousAgencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BPreviousAgencyCode(String value) {
        this.accorb2BPreviousAgencyCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BTransactionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BTransactionCode() {
        return accorb2BTransactionCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BTransactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BTransactionCode(String value) {
        this.accorb2BTransactionCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BToBeDeleted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BToBeDeleted() {
        return accorb2BToBeDeleted;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BToBeDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BToBeDeleted(String value) {
        this.accorb2BToBeDeleted = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BDeletionReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BDeletionReason() {
        return accorb2BDeletionReason;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BDeletionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BDeletionReason(String value) {
        this.accorb2BDeletionReason = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BNetworkId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BNetworkId() {
        return accorb2BNetworkId;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BNetworkId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BNetworkId(String value) {
        this.accorb2BNetworkId = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BNetworkTARSCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BNetworkTARSCode() {
        return accorb2BNetworkTARSCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BNetworkTARSCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BNetworkTARSCode(String value) {
        this.accorb2BNetworkTARSCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BNetworkName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BNetworkName() {
        return accorb2BNetworkName;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BNetworkName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BNetworkName(String value) {
        this.accorb2BNetworkName = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BExternalAgencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BExternalAgencyCode() {
        return accorb2BExternalAgencyCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BExternalAgencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BExternalAgencyCode(String value) {
        this.accorb2BExternalAgencyCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSuspiciousAgencyStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSuspiciousAgencyStatus() {
        return accorb2BSuspiciousAgencyStatus;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSuspiciousAgencyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSuspiciousAgencyStatus(String value) {
        this.accorb2BSuspiciousAgencyStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BConsortiumName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BConsortiumName() {
        return accorb2BConsortiumName;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BConsortiumName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BConsortiumName(String value) {
        this.accorb2BConsortiumName = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BConsortiumTARSCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BConsortiumTARSCode() {
        return accorb2BConsortiumTARSCode;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BConsortiumTARSCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BConsortiumTARSCode(String value) {
        this.accorb2BConsortiumTARSCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSuspiciousAgencyStatusLastUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSuspiciousAgencyStatusLastUpdate() {
        return accorb2BSuspiciousAgencyStatusLastUpdate;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSuspiciousAgencyStatusLastUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSuspiciousAgencyStatusLastUpdate(String value) {
        this.accorb2BSuspiciousAgencyStatusLastUpdate = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BSuspiciousAgencyComments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSuspiciousAgencyComments() {
        return accorb2BSuspiciousAgencyComments;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSuspiciousAgencyComments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSuspiciousAgencyComments(String value) {
        this.accorb2BSuspiciousAgencyComments = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BNoshowPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BNoshowPercentage() {
        return accorb2BNoshowPercentage;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BNoshowPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BNoshowPercentage(String value) {
        this.accorb2BNoshowPercentage = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCancelledRevenue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCancelledRevenue() {
        return accorb2BCancelledRevenue;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCancelledRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCancelledRevenue(String value) {
        this.accorb2BCancelledRevenue = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BTARSTransferred.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BTARSTransferred() {
        return accorb2BTARSTransferred;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BTARSTransferred.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BTARSTransferred(String value) {
        this.accorb2BTARSTransferred = value;
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
     * Obtient la valeur de la propri�t� accorb2BSubsidiaryAccountClassification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BSubsidiaryAccountClassification() {
        return accorb2BSubsidiaryAccountClassification;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BSubsidiaryAccountClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BSubsidiaryAccountClassification(String value) {
        this.accorb2BSubsidiaryAccountClassification = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BIndividualGenericAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BIndividualGenericAccount() {
        return accorb2BIndividualGenericAccount;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BIndividualGenericAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BIndividualGenericAccount(String value) {
        this.accorb2BIndividualGenericAccount = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BLeadSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BLeadSource() {
        return accorb2BLeadSource;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BLeadSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BLeadSource(String value) {
        this.accorb2BLeadSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BCreatedByDelphi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BCreatedByDelphi() {
        return accorb2BCreatedByDelphi;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BCreatedByDelphi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BCreatedByDelphi(String value) {
        this.accorb2BCreatedByDelphi = value;
    }

    /**
     * Obtient la valeur de la propri�t� accorb2BUpdatedByDelphi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCORB2BUpdatedByDelphi() {
        return accorb2BUpdatedByDelphi;
    }

    /**
     * D�finit la valeur de la propri�t� accorb2BUpdatedByDelphi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCORB2BUpdatedByDelphi(String value) {
        this.accorb2BUpdatedByDelphi = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfCifAccountReference.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCifAccountReference }
     *     
     */
    public ListOfCifAccountReference getListOfCifAccountReference() {
        return listOfCifAccountReference;
    }

    /**
     * D�finit la valeur de la propri�t� listOfCifAccountReference.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCifAccountReference }
     *     
     */
    public void setListOfCifAccountReference(ListOfCifAccountReference value) {
        this.listOfCifAccountReference = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfDnbAccount.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDnbAccount }
     *     
     */
    public ListOfDnbAccount getListOfDnbAccount() {
        return listOfDnbAccount;
    }

    /**
     * D�finit la valeur de la propri�t� listOfDnbAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDnbAccount }
     *     
     */
    public void setListOfDnbAccount(ListOfDnbAccount value) {
        this.listOfDnbAccount = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccorSegment.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccorSegment }
     *     
     */
    public ListOfAccorSegment getListOfAccorSegment() {
        return listOfAccorSegment;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccorSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccorSegment }
     *     
     */
    public void setListOfAccorSegment(ListOfAccorSegment value) {
        this.listOfAccorSegment = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccountBusinessAddress.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountBusinessAddress }
     *     
     */
    public ListOfAccountBusinessAddress getListOfAccountBusinessAddress() {
        return listOfAccountBusinessAddress;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccountBusinessAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountBusinessAddress }
     *     
     */
    public void setListOfAccountBusinessAddress(ListOfAccountBusinessAddress value) {
        this.listOfAccountBusinessAddress = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccorAccountSegment.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccorAccountSegment }
     *     
     */
    public ListOfAccorAccountSegment getListOfAccorAccountSegment() {
        return listOfAccorAccountSegment;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccorAccountSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccorAccountSegment }
     *     
     */
    public void setListOfAccorAccountSegment(ListOfAccorAccountSegment value) {
        this.listOfAccorAccountSegment = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccorDistribution.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccorDistribution }
     *     
     */
    public ListOfAccorDistribution getListOfAccorDistribution() {
        return listOfAccorDistribution;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccorDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccorDistribution }
     *     
     */
    public void setListOfAccorDistribution(ListOfAccorDistribution value) {
        this.listOfAccorDistribution = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccorB2BAccountResaHabitsDistribMode.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccorB2BAccountResaHabitsDistribMode }
     *     
     */
    public ListOfAccorB2BAccountResaHabitsDistribMode getListOfAccorB2BAccountResaHabitsDistribMode() {
        return listOfAccorB2BAccountResaHabitsDistribMode;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccorB2BAccountResaHabitsDistribMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccorB2BAccountResaHabitsDistribMode }
     *     
     */
    public void setListOfAccorB2BAccountResaHabitsDistribMode(ListOfAccorB2BAccountResaHabitsDistribMode value) {
        this.listOfAccorB2BAccountResaHabitsDistribMode = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccorB2BAccountResaHabitsResaMode.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccorB2BAccountResaHabitsResaMode }
     *     
     */
    public ListOfAccorB2BAccountResaHabitsResaMode getListOfAccorB2BAccountResaHabitsResaMode() {
        return listOfAccorB2BAccountResaHabitsResaMode;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccorB2BAccountResaHabitsResaMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccorB2BAccountResaHabitsResaMode }
     *     
     */
    public void setListOfAccorB2BAccountResaHabitsResaMode(ListOfAccorB2BAccountResaHabitsResaMode value) {
        this.listOfAccorB2BAccountResaHabitsResaMode = value;
    }

    /**
     * Obtient la valeur de la propri�t� listOfAccorB2BAccountCi.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccorB2BAccountCi }
     *     
     */
    public ListOfAccorB2BAccountCi getListOfAccorB2BAccountCi() {
        return listOfAccorB2BAccountCi;
    }

    /**
     * D�finit la valeur de la propri�t� listOfAccorB2BAccountCi.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccorB2BAccountCi }
     *     
     */
    public void setListOfAccorB2BAccountCi(ListOfAccorB2BAccountCi value) {
        this.listOfAccorB2BAccountCi = value;
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
