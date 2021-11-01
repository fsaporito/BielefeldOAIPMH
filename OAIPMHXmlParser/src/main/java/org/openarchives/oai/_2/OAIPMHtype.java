//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.30 alle 01:51:51 PM UTC 
//


package org.openarchives.oai._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per OAI-PMHtype complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OAI-PMHtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="request" type="{http://www.openarchives.org/OAI/2.0/}requestType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="error" type="{http://www.openarchives.org/OAI/2.0/}OAI-PMHerrorType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="Identify" type="{http://www.openarchives.org/OAI/2.0/}IdentifyType"/&gt;
 *           &lt;element name="ListMetadataFormats" type="{http://www.openarchives.org/OAI/2.0/}ListMetadataFormatsType"/&gt;
 *           &lt;element name="ListSets" type="{http://www.openarchives.org/OAI/2.0/}ListSetsType"/&gt;
 *           &lt;element name="GetRecord" type="{http://www.openarchives.org/OAI/2.0/}GetRecordType"/&gt;
 *           &lt;element name="ListIdentifiers" type="{http://www.openarchives.org/OAI/2.0/}ListIdentifiersType"/&gt;
 *           &lt;element name="ListRecords" type="{http://www.openarchives.org/OAI/2.0/}ListRecordsType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAI-PMHtype", propOrder = {
    "responseDate",
    "request",
    "error",
    "identify",
    "listMetadataFormats",
    "listSets",
    "getRecord",
    "listIdentifiers",
    "listRecords"
})
public class OAIPMHtype {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(required = true)
    protected RequestType request;
    protected List<OAIPMHerrorType> error;
    @XmlElement(name = "Identify")
    protected IdentifyType identify;
    @XmlElement(name = "ListMetadataFormats")
    protected ListMetadataFormatsType listMetadataFormats;
    @XmlElement(name = "ListSets")
    protected ListSetsType listSets;
    @XmlElement(name = "GetRecord")
    protected GetRecordType getRecord;
    @XmlElement(name = "ListIdentifiers")
    protected ListIdentifiersType listIdentifiers;
    @XmlElement(name = "ListRecords")
    protected ListRecordsType listRecords;

    /**
     * Recupera il valore della proprietà responseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Imposta il valore della proprietà responseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Recupera il valore della proprietà request.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Imposta il valore della proprietà request.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OAIPMHerrorType }
     * 
     * 
     */
    public List<OAIPMHerrorType> getError() {
        if (error == null) {
            error = new ArrayList<OAIPMHerrorType>();
        }
        return this.error;
    }

    /**
     * Recupera il valore della proprietà identify.
     * 
     * @return
     *     possible object is
     *     {@link IdentifyType }
     *     
     */
    public IdentifyType getIdentify() {
        return identify;
    }

    /**
     * Imposta il valore della proprietà identify.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifyType }
     *     
     */
    public void setIdentify(IdentifyType value) {
        this.identify = value;
    }

    /**
     * Recupera il valore della proprietà listMetadataFormats.
     * 
     * @return
     *     possible object is
     *     {@link ListMetadataFormatsType }
     *     
     */
    public ListMetadataFormatsType getListMetadataFormats() {
        return listMetadataFormats;
    }

    /**
     * Imposta il valore della proprietà listMetadataFormats.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMetadataFormatsType }
     *     
     */
    public void setListMetadataFormats(ListMetadataFormatsType value) {
        this.listMetadataFormats = value;
    }

    /**
     * Recupera il valore della proprietà listSets.
     * 
     * @return
     *     possible object is
     *     {@link ListSetsType }
     *     
     */
    public ListSetsType getListSets() {
        return listSets;
    }

    /**
     * Imposta il valore della proprietà listSets.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSetsType }
     *     
     */
    public void setListSets(ListSetsType value) {
        this.listSets = value;
    }

    /**
     * Recupera il valore della proprietà getRecord.
     * 
     * @return
     *     possible object is
     *     {@link GetRecordType }
     *     
     */
    public GetRecordType getGetRecord() {
        return getRecord;
    }

    /**
     * Imposta il valore della proprietà getRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecordType }
     *     
     */
    public void setGetRecord(GetRecordType value) {
        this.getRecord = value;
    }

    /**
     * Recupera il valore della proprietà listIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link ListIdentifiersType }
     *     
     */
    public ListIdentifiersType getListIdentifiers() {
        return listIdentifiers;
    }

    /**
     * Imposta il valore della proprietà listIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link ListIdentifiersType }
     *     
     */
    public void setListIdentifiers(ListIdentifiersType value) {
        this.listIdentifiers = value;
    }

    /**
     * Recupera il valore della proprietà listRecords.
     * 
     * @return
     *     possible object is
     *     {@link ListRecordsType }
     *     
     */
    public ListRecordsType getListRecords() {
        return listRecords;
    }

    /**
     * Imposta il valore della proprietà listRecords.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRecordsType }
     *     
     */
    public void setListRecords(ListRecordsType value) {
        this.listRecords = value;
    }

}
