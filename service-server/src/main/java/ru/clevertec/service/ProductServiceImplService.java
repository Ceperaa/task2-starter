
package ru.clevertec.service;

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
@WebServiceClient(name = "ProductServiceImplService", targetNamespace = "http://service.clevertec.ru/", wsdlLocation = "http://localhost:9090/products?wsdl")
public class ProductServiceImplService
    extends Service
{

    private final static URL PRODUCTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICEIMPLSERVICE_QNAME = new QName("http://service.clevertec.ru/", "ProductServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/products?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ProductServiceImplService() {
        super(__getWsdlLocation(), PRODUCTSERVICEIMPLSERVICE_QNAME);
    }

    public ProductServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTSERVICEIMPLSERVICE_QNAME, features);
    }

    public ProductServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTSERVICEIMPLSERVICE_QNAME);
    }

    public ProductServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTSERVICEIMPLSERVICE_QNAME, features);
    }

    public ProductServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductServiceImpl
     */
    @WebEndpoint(name = "ProductServiceImplPort")
    public ProductServiceImpl getProductServiceImplPort() {
        return super.getPort(new QName("http://service.clevertec.ru/", "ProductServiceImplPort"), ProductServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductServiceImpl
     */
    @WebEndpoint(name = "ProductServiceImplPort")
    public ProductServiceImpl getProductServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.clevertec.ru/", "ProductServiceImplPort"), ProductServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return PRODUCTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
