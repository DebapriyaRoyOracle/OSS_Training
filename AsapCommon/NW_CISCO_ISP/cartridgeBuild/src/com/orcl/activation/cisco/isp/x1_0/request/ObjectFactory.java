//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.10 at 03:47:46 PM IST 
//


package com.orcl.activation.cisco.isp.x1_0.request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orcl.activation.cisco.isp.x1_0.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orcl.activation.cisco.isp.x1_0.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryRequest }
     * 
     */
    public QueryRequest createQueryRequest() {
        return new QueryRequest();
    }

    /**
     * Create an instance of {@link ModifyRequest }
     * 
     */
    public ModifyRequest createModifyRequest() {
        return new ModifyRequest();
    }

    /**
     * Create an instance of {@link ProvisionRequest }
     * 
     */
    public ProvisionRequest createProvisionRequest() {
        return new ProvisionRequest();
    }

    /**
     * Create an instance of {@link TerminateRequest }
     * 
     */
    public TerminateRequest createTerminateRequest() {
        return new TerminateRequest();
    }

    /**
     * Create an instance of {@link QueryRequest.Credential }
     * 
     */
    public QueryRequest.Credential createQueryRequestCredential() {
        return new QueryRequest.Credential();
    }

    /**
     * Create an instance of {@link ModifyRequest.Service }
     * 
     */
    public ModifyRequest.Service createModifyRequestService() {
        return new ModifyRequest.Service();
    }

    /**
     * Create an instance of {@link ModifyRequest.Credential }
     * 
     */
    public ModifyRequest.Credential createModifyRequestCredential() {
        return new ModifyRequest.Credential();
    }

    /**
     * Create an instance of {@link ProvisionRequest.Service }
     * 
     */
    public ProvisionRequest.Service createProvisionRequestService() {
        return new ProvisionRequest.Service();
    }

    /**
     * Create an instance of {@link ProvisionRequest.Credential }
     * 
     */
    public ProvisionRequest.Credential createProvisionRequestCredential() {
        return new ProvisionRequest.Credential();
    }

    /**
     * Create an instance of {@link TerminateRequest.Credential }
     * 
     */
    public TerminateRequest.Credential createTerminateRequestCredential() {
        return new TerminateRequest.Credential();
    }

}
