
package com.example.examcswclient.service;

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
@WebServiceClient(name = "ProductServiceService", targetNamespace = "http://service.examcsw.example.com/", wsdlLocation = "http://localhost:8012/api/product?wsdl")
public class ProductServiceService
    extends Service
{

    private final static URL PRODUCTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICESERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICESERVICE_QNAME = new QName("http://service.examcsw.example.com/", "ProductServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8012/api/product?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICESERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICESERVICE_EXCEPTION = e;
    }

    public ProductServiceService() {
        super(__getWsdlLocation(), PRODUCTSERVICESERVICE_QNAME);
    }

    public ProductServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTSERVICESERVICE_QNAME, features);
    }

    public ProductServiceService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTSERVICESERVICE_QNAME);
    }

    public ProductServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTSERVICESERVICE_QNAME, features);
    }

    public ProductServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductService
     */
    @WebEndpoint(name = "ProductServicePort")
    public ProductService getProductServicePort() {
        return super.getPort(new QName("http://service.examcsw.example.com/", "ProductServicePort"), ProductService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductService
     */
    @WebEndpoint(name = "ProductServicePort")
    public ProductService getProductServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.examcsw.example.com/", "ProductServicePort"), ProductService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICESERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICESERVICE_EXCEPTION;
        }
        return PRODUCTSERVICESERVICE_WSDL_LOCATION;
    }

}