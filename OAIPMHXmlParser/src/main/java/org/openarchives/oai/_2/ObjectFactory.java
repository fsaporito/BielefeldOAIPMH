//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.06 alle 03:53:06 PM UTC 
//


package org.openarchives.oai._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openarchives.oai._2 package. 
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

    private final static QName _OAIPMH_QNAME = new QName("http://www.openarchives.org/OAI/2.0/", "OAI-PMH");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openarchives.oai._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OAIPMHtype }
     * 
     */
    public OAIPMHtype createOAIPMHtype() {
        return new OAIPMHtype();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link OAIPMHerrorType }
     * 
     */
    public OAIPMHerrorType createOAIPMHerrorType() {
        return new OAIPMHerrorType();
    }

    /**
     * Create an instance of {@link IdentifyType }
     * 
     */
    public IdentifyType createIdentifyType() {
        return new IdentifyType();
    }

    /**
     * Create an instance of {@link ListMetadataFormatsType }
     * 
     */
    public ListMetadataFormatsType createListMetadataFormatsType() {
        return new ListMetadataFormatsType();
    }

    /**
     * Create an instance of {@link ListSetsType }
     * 
     */
    public ListSetsType createListSetsType() {
        return new ListSetsType();
    }

    /**
     * Create an instance of {@link GetRecordType }
     * 
     */
    public GetRecordType createGetRecordType() {
        return new GetRecordType();
    }

    /**
     * Create an instance of {@link ListRecordsType }
     * 
     */
    public ListRecordsType createListRecordsType() {
        return new ListRecordsType();
    }

    /**
     * Create an instance of {@link ListIdentifiersType }
     * 
     */
    public ListIdentifiersType createListIdentifiersType() {
        return new ListIdentifiersType();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link MetadataType }
     * 
     */
    public MetadataType createMetadataType() {
        return new MetadataType();
    }

    /**
     * Create an instance of {@link AboutType }
     * 
     */
    public AboutType createAboutType() {
        return new AboutType();
    }

    /**
     * Create an instance of {@link ResumptionTokenType }
     * 
     */
    public ResumptionTokenType createResumptionTokenType() {
        return new ResumptionTokenType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link MetadataFormatType }
     * 
     */
    public MetadataFormatType createMetadataFormatType() {
        return new MetadataFormatType();
    }

    /**
     * Create an instance of {@link SetType }
     * 
     */
    public SetType createSetType() {
        return new SetType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAIPMHtype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OAIPMHtype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.openarchives.org/OAI/2.0/", name = "OAI-PMH")
    public JAXBElement<OAIPMHtype> createOAIPMH(OAIPMHtype value) {
        return new JAXBElement<OAIPMHtype>(_OAIPMH_QNAME, OAIPMHtype.class, null, value);
    }

}
