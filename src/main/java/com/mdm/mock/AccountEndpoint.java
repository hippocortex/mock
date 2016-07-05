package com.mdm.mock;

import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.accor.asa.interfaces.domain.account.siebel.CustomUI.CreateOrganizationB2BV5Input;
import com.accor.asa.interfaces.domain.account.siebel.CustomUI.CreateOrganizationB2BV5Output;
/**
 * http://docs.spring.io/spring-ws/docs/2.2.0.RELEASE/reference/htmlsingle/#d4e112
 * @author sbarberye
 *
 */
@Endpoint
public class AccountEndpoint {
	private static final String NAMESPACE_URI = "http://siebel.com/CustomUI";
	private static final String NAMESPACE_URI_ACC = "http://www.siebel.com/xml/SwiOrganizationB2BIOV5";
    private XPathExpression<org.jdom2.Element> accountNameExpression;
    
    public AccountEndpoint() {
    	Namespace namespace = Namespace.getNamespace("swi", NAMESPACE_URI_ACC);
        XPathFactory xPathFactory = XPathFactory.instance();
        accountNameExpression = xPathFactory.compile("//swi:ACCORB2BLegalName", Filters.element(), null, namespace);
    }

	@PayloadRoot(namespace=NAMESPACE_URI,localPart = "createOrganizationB2BV5_Input")
	public @ResponsePayload CreateOrganizationB2BV5Output handleAccountRequest(@RequestPayload CreateOrganizationB2BV5Input accountRequest){
		//String name = accountNameExpression.evaluateFirst(accountRequest).getText() ;
		CreateOrganizationB2BV5Output output= new CreateOrganizationB2BV5Output();
		System.out.print("ok : "+accountRequest.getListOfSwiOrganizationB2BIO().getAccount().get(0).getACCORB2BLegalName());
		
		BeanUtils.copyProperties(accountRequest, output);
		return output;
			
	}
}
