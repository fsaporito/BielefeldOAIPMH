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
 * <p>Classe Java per funderIdentifierType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="funderIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISNI"/&gt;
 *     &lt;enumeration value="GRID"/&gt;
 *     &lt;enumeration value="Crossref Funder ID"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "funderIdentifierType")
@XmlEnum
public enum FunderIdentifierType {

    ISNI("ISNI"),
    GRID("GRID"),
    @XmlEnumValue("Crossref Funder ID")
    CROSSREF_FUNDER_ID("Crossref Funder ID"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FunderIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunderIdentifierType fromValue(String v) {
        for (FunderIdentifierType c: FunderIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
