//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.18 at 02:59:20 PM IST 
//


package com.order.process.xjc;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.order.process.xjc package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.order.process.xjc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerOrderElement }
     * 
     */
    public CustomerOrderElement createCustomerOrderElement() {
        return new CustomerOrderElement();
    }

    /**
     * Create an instance of {@link CustomerOrderElement.Customer }
     * 
     */
    public CustomerOrderElement.Customer createCustomerOrderElementCustomer() {
        return new CustomerOrderElement.Customer();
    }

    /**
     * Create an instance of {@link CustomerOrderElement.Customer.Address }
     * 
     */
    public CustomerOrderElement.Customer.Address createCustomerOrderElementCustomerAddress() {
        return new CustomerOrderElement.Customer.Address();
    }

}
