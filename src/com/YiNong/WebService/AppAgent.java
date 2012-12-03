package com.YiNong.WebService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-01T18:44:33.903+08:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "AppAgent", 
                  wsdlLocation = "http://www.118328.com/BlissCountryside/AppAgent.asmx?wsdl",
                  targetNamespace = "http://app.118328/") 
public class AppAgent extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://app.118328/", "AppAgent");
    public final static QName AppAgentSoap12 = new QName("http://app.118328/", "AppAgentSoap12");
    public final static QName AppAgentSoap = new QName("http://app.118328/", "AppAgentSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://www.118328.com/BlissCountryside/AppAgent.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AppAgent.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.118328.com/BlissCountryside/AppAgent.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AppAgent(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AppAgent(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppAgent() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns AppAgentSoap
     */
    @WebEndpoint(name = "AppAgentSoap12")
    public AppAgentSoap getAppAgentSoap12() {
        return super.getPort(AppAgentSoap12, AppAgentSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppAgentSoap
     */
    @WebEndpoint(name = "AppAgentSoap12")
    public AppAgentSoap getAppAgentSoap12(WebServiceFeature... features) {
        return super.getPort(AppAgentSoap12, AppAgentSoap.class, features);
    }
    /**
     *
     * @return
     *     returns AppAgentSoap
     */
    @WebEndpoint(name = "AppAgentSoap")
    public AppAgentSoap getAppAgentSoap() {
        return super.getPort(AppAgentSoap, AppAgentSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppAgentSoap
     */
    @WebEndpoint(name = "AppAgentSoap")
    public AppAgentSoap getAppAgentSoap(WebServiceFeature... features) {
        return super.getPort(AppAgentSoap, AppAgentSoap.class, features);
    }

}
