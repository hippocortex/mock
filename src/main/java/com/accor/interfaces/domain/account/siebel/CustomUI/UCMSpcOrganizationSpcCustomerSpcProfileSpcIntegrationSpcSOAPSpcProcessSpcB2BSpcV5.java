package com.accor.interfaces.domain.account.siebel.CustomUI;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.10
 * 2016-01-11T11:07:55.341+01:00
 * Generated source version: 2.5.10
 * 
 */
@WebService(targetNamespace = "http://siebel.com/CustomUI", name = "UCM_spcOrganization_spcCustomer_spcProfile_spcIntegration_spcSOAP_spcProcess_spcB2B_spcV5")
@XmlSeeAlso({com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5.ObjectFactory.class, com.accor.interfaces.domain.account.siebel.xml.swiorganizationb2bio.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UCMSpcOrganizationSpcCustomerSpcProfileSpcIntegrationSpcSOAPSpcProcessSpcB2BSpcV5 {

    @WebResult(name = "updateOrganizationB2BV5_Output", targetNamespace = "http://siebel.com/CustomUI", partName = "updateOrganizationB2BV5_Output")
    @WebMethod(action = "document/http://siebel.com/CustomUI:updateOrganizationB2BV5")
    public UpdateOrganizationB2BV5Output updateOrganizationB2BV5(
        @WebParam(partName = "updateOrganizationB2BV5_Input", name = "updateOrganizationB2BV5_Input", targetNamespace = "http://siebel.com/CustomUI")
        UpdateOrganizationB2BV5Input updateOrganizationB2BV5Input
    );

    @WebResult(name = "createOrganizationB2BV5_Output", targetNamespace = "http://siebel.com/CustomUI", partName = "createOrganizationB2BV5_Output")
    @WebMethod(action = "document/http://siebel.com/CustomUI:createOrganizationB2BV5")
    public CreateOrganizationB2BV5Output createOrganizationB2BV5(
        @WebParam(partName = "createOrganizationB2BV5_Input", name = "createOrganizationB2BV5_Input", targetNamespace = "http://siebel.com/CustomUI")
        CreateOrganizationB2BV5Input createOrganizationB2BV5Input
    );
}
