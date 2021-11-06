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
 * <p>Classe Java per dateType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Collected"/&gt;
 *     &lt;enumeration value="Copyrighted"/&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Issued"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Submitted"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="Valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dateType")
@XmlEnum
public enum DateType {

    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Collected")
    COLLECTED("Collected"),
    @XmlEnumValue("Copyrighted")
    COPYRIGHTED("Copyrighted"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Valid")
    VALID("Valid");
    private final String value;

    DateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateType fromValue(String v) {
        for (DateType c: DateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
