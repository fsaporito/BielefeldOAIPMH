//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.06 alle 03:53:07 PM UTC 
//


package org.datacite.schema.kernel_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per relatedIdentifierType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="relatedIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARK"/&gt;
 *     &lt;enumeration value="arXiv"/&gt;
 *     &lt;enumeration value="bibcode"/&gt;
 *     &lt;enumeration value="DOI"/&gt;
 *     &lt;enumeration value="EAN13"/&gt;
 *     &lt;enumeration value="EISSN"/&gt;
 *     &lt;enumeration value="Handle"/&gt;
 *     &lt;enumeration value="IGSN"/&gt;
 *     &lt;enumeration value="ISBN"/&gt;
 *     &lt;enumeration value="ISSN"/&gt;
 *     &lt;enumeration value="ISTC"/&gt;
 *     &lt;enumeration value="LISSN"/&gt;
 *     &lt;enumeration value="LSID"/&gt;
 *     &lt;enumeration value="PMID"/&gt;
 *     &lt;enumeration value="PURL"/&gt;
 *     &lt;enumeration value="UPC"/&gt;
 *     &lt;enumeration value="URL"/&gt;
 *     &lt;enumeration value="URN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "relatedIdentifierType")
@XmlEnum
public enum RelatedIdentifierType {

    ARK("ARK"),
    @XmlEnumValue("arXiv")
    AR_XIV("arXiv"),
    @XmlEnumValue("bibcode")
    BIBCODE("bibcode"),
    DOI("DOI"),
    @XmlEnumValue("EAN13")
    EAN_13("EAN13"),
    EISSN("EISSN"),
    @XmlEnumValue("Handle")
    HANDLE("Handle"),
    IGSN("IGSN"),
    ISBN("ISBN"),
    ISSN("ISSN"),
    ISTC("ISTC"),
    LISSN("LISSN"),
    LSID("LSID"),
    PMID("PMID"),
    PURL("PURL"),
    UPC("UPC"),
    URL("URL"),
    URN("URN");
    private final String value;

    RelatedIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelatedIdentifierType fromValue(String v) {
        for (RelatedIdentifierType c: RelatedIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
