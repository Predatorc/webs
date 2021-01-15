
package tr.gov.turkiye.standart.universite.v3;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UniversiteStandartervice", targetNamespace = "http://standart.turkiye.gov.tr/universite/v3", wsdlLocation = "file:/C:/Users/cagri/Downloads/Zuhtu/Universite.wsdl")
public class UniversiteStandartervice
    extends Service
{

    private final static URL UNIVERSITESTANDARTERVICE_WSDL_LOCATION;
    private final static WebServiceException UNIVERSITESTANDARTERVICE_EXCEPTION;
    private final static QName UNIVERSITESTANDARTERVICE_QNAME = new QName("http://standart.turkiye.gov.tr/universite/v3", "UniversiteStandartervice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/cagri/Downloads/Zuhtu/Universite.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UNIVERSITESTANDARTERVICE_WSDL_LOCATION = url;
        UNIVERSITESTANDARTERVICE_EXCEPTION = e;
    }

    public UniversiteStandartervice() {
        super(__getWsdlLocation(), UNIVERSITESTANDARTERVICE_QNAME);
    }

    public UniversiteStandartervice(WebServiceFeature... features) {
        super(__getWsdlLocation(), UNIVERSITESTANDARTERVICE_QNAME, features);
    }

    public UniversiteStandartervice(URL wsdlLocation) {
        super(wsdlLocation, UNIVERSITESTANDARTERVICE_QNAME);
    }

    public UniversiteStandartervice(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UNIVERSITESTANDARTERVICE_QNAME, features);
    }

    public UniversiteStandartervice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UniversiteStandartervice(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UniversiteStandartPortType
     */
    @WebEndpoint(name = "UniversiteStandartPortTypeBindingPort")
    public UniversiteStandartPortType getUniversiteStandartPortTypeBindingPort() {
        return super.getPort(new QName("http://standart.turkiye.gov.tr/universite/v3", "UniversiteStandartPortTypeBindingPort"), UniversiteStandartPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UniversiteStandartPortType
     */
    @WebEndpoint(name = "UniversiteStandartPortTypeBindingPort")
    public UniversiteStandartPortType getUniversiteStandartPortTypeBindingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://standart.turkiye.gov.tr/universite/v3", "UniversiteStandartPortTypeBindingPort"), UniversiteStandartPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UNIVERSITESTANDARTERVICE_EXCEPTION!= null) {
            throw UNIVERSITESTANDARTERVICE_EXCEPTION;
        }
        return UNIVERSITESTANDARTERVICE_WSDL_LOCATION;
    }

}
