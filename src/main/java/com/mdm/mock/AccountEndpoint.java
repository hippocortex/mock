package com.mdm.mock;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.springframework.util.StringUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.accor.asa.interfaces.domain.account.siebel.CustomUI.CreateOrganizationB2BV5Input;
import com.accor.asa.interfaces.domain.account.siebel.CustomUI.CreateOrganizationB2BV5Output;
import com.accor.asa.interfaces.domain.account.siebel.CustomUI.UpdateOrganizationB2BV5Input;
import com.accor.asa.interfaces.domain.account.siebel.CustomUI.UpdateOrganizationB2BV5Output;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5.Account;
import com.accor.asa.interfaces.domain.account.siebel.xml.swiorganizationb2boutiov5.ListOfSwiOrganizationB2BOutIOV5;
import com.sb.tools.StringTool;

/**
 * http://docs.spring.io/spring-ws/docs/2.2.0.RELEASE/reference/htmlsingle/#
 * d4e112
 * 
 * @author sbarberye
 *
 */
@Endpoint
public class AccountEndpoint {
	private static final String NAMESPACE_URI = "http://siebel.com/CustomUI";
	private static final String NAMESPACE_URI_ACC = "http://www.siebel.com/xml/SwiOrganizationB2BIOV5";
	private XPathExpression<org.jdom2.Element> accountNameExpression;

	private SecureRandom random = new SecureRandom();

	public AccountEndpoint() {
		Namespace namespace = Namespace.getNamespace("swi", NAMESPACE_URI_ACC);
		XPathFactory xPathFactory = XPathFactory.instance();
		accountNameExpression = xPathFactory.compile("//swi:ACCORB2BLegalName", Filters.element(), null, namespace);
	}

	@PayloadRoot(namespace=NAMESPACE_URI,localPart = "createOrganizationB2BV5_Input")
	public @ResponsePayload CreateOrganizationB2BV5Output handleAccountRequest(@RequestPayload CreateOrganizationB2BV5Input accountRequest){
		//String name = accountNameExpression.evaluateFirst(accountRequest).getText() ;
		CreateOrganizationB2BV5Output output= new CreateOrganizationB2BV5Output();
		ListOfSwiOrganizationB2BOutIOV5 swiOrg = new ListOfSwiOrganizationB2BOutIOV5();
		System.out.print("ok : "+accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getACCORB2BLegalName());
		
		
		//TODO generer le code compte SCPxxxxxx
		String location = !StringUtils.isEmpty(accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getLocation())?accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getLocation():"SCP"+StringTool.randomString(6); 
		String integrationID=!StringUtils.isEmpty(accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId())?accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId():StringTool.randomString(25);
		
		
		Account outAccount = new Account();
		outAccount.setIntegrationId(integrationID);
		outAccount.setLocation(location);
		swiOrg.addAccount(outAccount);
		output.setListOfSwiOrganizationB2BOutIOV5(swiOrg);
		//MIGAG - CHM - Add the booking code from MDM
       // accountParam.BookingCode__c = calloutResponse.ListOfSwiOrganizationB2BOutIOV5.Account[0].ACCORB2BBookingCode;
		
		return output;
			
	}
	
	
	
	@PayloadRoot(namespace=NAMESPACE_URI,localPart = "createOrganizationB2BV5_Input")
	public @ResponsePayload UpdateOrganizationB2BV5Output handleAccountRequest(@RequestPayload UpdateOrganizationB2BV5Input accountRequest){
		//String name = accountNameExpression.evaluateFirst(accountRequest).getText() ;
		UpdateOrganizationB2BV5Output output= new UpdateOrganizationB2BV5Output();
		ListOfSwiOrganizationB2BOutIOV5 swiOrg = new ListOfSwiOrganizationB2BOutIOV5();
		System.out.print("ok : "+accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getACCORB2BLegalName());
		
		
		//TODO generer le code compte SCPxxxxxx
		String location = !StringUtils.isEmpty(accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getLocation())?accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getLocation():"SCP"+StringTool.randomString(6); 
		String integrationID=!StringUtils.isEmpty(accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId())?accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getIntegrationId():StringTool.randomString(25);
		
		
		Account outAccount = new Account();
		outAccount.setIntegrationId(integrationID);
		outAccount.setLocation(location);
		swiOrg.addAccount(outAccount);
		output.setListOfSwiOrganizationB2BOutIOV5(swiOrg);
		//MIGAG - CHM - Add the booking code from MDM
       // accountParam.BookingCode__c = calloutResponse.ListOfSwiOrganizationB2BOutIOV5.Account[0].ACCORB2BBookingCode;
		
		return output;
			
	}
	
}
