//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.12 at 02:25:21 AM CEST 
//


package it.negro.lm.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.negro.lm.ws package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.negro.lm.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReceiptRequest }
     * 
     */
    public GetReceiptRequest createGetReceiptRequest() {
        return new GetReceiptRequest();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse }
     * 
     */
    public GetCategoriesResponse createGetCategoriesResponse() {
        return new GetCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetReceiptResponse }
     * 
     */
    public GetReceiptResponse createGetReceiptResponse() {
        return new GetReceiptResponse();
    }

    /**
     * Create an instance of {@link GetReceiptResponse.Items }
     * 
     */
    public GetReceiptResponse.Items createGetReceiptResponseItems() {
        return new GetReceiptResponse.Items();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse.Categories }
     * 
     */
    public GetCategoriesResponse.Categories createGetCategoriesResponseCategories() {
        return new GetCategoriesResponse.Categories();
    }

    /**
     * Create an instance of {@link GetReceiptRequest.Items }
     * 
     */
    public GetReceiptRequest.Items createGetReceiptRequestItems() {
        return new GetReceiptRequest.Items();
    }

    /**
     * Create an instance of {@link GetCategoriesRequest }
     * 
     */
    public GetCategoriesRequest createGetCategoriesRequest() {
        return new GetCategoriesRequest();
    }

    /**
     * Create an instance of {@link GetReceiptResponse.Items.Item }
     * 
     */
    public GetReceiptResponse.Items.Item createGetReceiptResponseItemsItem() {
        return new GetReceiptResponse.Items.Item();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse.Categories.Category }
     * 
     */
    public GetCategoriesResponse.Categories.Category createGetCategoriesResponseCategoriesCategory() {
        return new GetCategoriesResponse.Categories.Category();
    }

    /**
     * Create an instance of {@link GetReceiptRequest.Items.Item }
     * 
     */
    public GetReceiptRequest.Items.Item createGetReceiptRequestItemsItem() {
        return new GetReceiptRequest.Items.Item();
    }

}
