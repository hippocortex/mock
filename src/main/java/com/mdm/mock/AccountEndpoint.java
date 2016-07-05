package com.mdm.mock;

import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

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
	public void handleAccountRequest(@RequestPayload Element accountRequest){
		String name = accountNameExpression.evaluateFirst(accountRequest).getText() ;
		
		System.out.print("ok : "+name);
			
	}
}
