//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.06 alle 03:53:06 PM UTC 
//


package org.openarchives.oai._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Define requestType, indicating the protocol request that 
 *       led to the response. Element content is BASE-URL, attributes are arguments 
 *       of protocol request, attribute-values are values of arguments of protocol 
 *       request
 * 
 * <p>Classe Java per requestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="requestType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *       &lt;attribute name="verb" type="{http://www.openarchives.org/OAI/2.0/}verbType" /&gt;
 *       &lt;attribute name="identifier" type="{http://www.openarchives.org/OAI/2.0/}identifierType" /&gt;
 *       &lt;attribute name="metadataPrefix" type="{http://www.openarchives.org/OAI/2.0/}metadataPrefixType" /&gt;
 *       &lt;attribute name="from" type="{http://www.openarchives.org/OAI/2.0/}UTCdatetimeType" /&gt;
 *       &lt;attribute name="until" type="{http://www.openarchives.org/OAI/2.0/}UTCdatetimeType" /&gt;
 *       &lt;attribute name="set" type="{http://www.openarchives.org/OAI/2.0/}setSpecType" /&gt;
 *       &lt;attribute name="resumptionToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestType", propOrder = {
    "value"
})
public class RequestType {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "verb")
    protected VerbType verb;
    @XmlAttribute(name = "identifier")
    protected String identifier;
    @XmlAttribute(name = "metadataPrefix")
    protected String metadataPrefix;
    @XmlAttribute(name = "from")
    protected String from;
    @XmlAttribute(name = "until")
    protected String until;
    @XmlAttribute(name = "set")
    protected String set;
    @XmlAttribute(name = "resumptionToken")
    protected String resumptionToken;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà verb.
     * 
     * @return
     *     possible object is
     *     {@link VerbType }
     *     
     */
    public VerbType getVerb() {
        return verb;
    }

    /**
     * Imposta il valore della proprietà verb.
     * 
     * @param value
     *     allowed object is
     *     {@link VerbType }
     *     
     */
    public void setVerb(VerbType value) {
        this.verb = value;
    }

    /**
     * Recupera il valore della proprietà identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Imposta il valore della proprietà identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Recupera il valore della proprietà metadataPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataPrefix() {
        return metadataPrefix;
    }

    /**
     * Imposta il valore della proprietà metadataPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataPrefix(String value) {
        this.metadataPrefix = value;
    }

    /**
     * Recupera il valore della proprietà from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Imposta il valore della proprietà from.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Recupera il valore della proprietà until.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntil() {
        return until;
    }

    /**
     * Imposta il valore della proprietà until.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntil(String value) {
        this.until = value;
    }

    /**
     * Recupera il valore della proprietà set.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSet() {
        return set;
    }

    /**
     * Imposta il valore della proprietà set.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSet(String value) {
        this.set = value;
    }

    /**
     * Recupera il valore della proprietà resumptionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumptionToken() {
        return resumptionToken;
    }

    /**
     * Imposta il valore della proprietà resumptionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumptionToken(String value) {
        this.resumptionToken = value;
    }

}
