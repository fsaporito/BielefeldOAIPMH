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
 * <p>Classe Java per resourceType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Audiovisual"/&gt;
 *     &lt;enumeration value="Collection"/&gt;
 *     &lt;enumeration value="DataPaper"/&gt;
 *     &lt;enumeration value="Dataset"/&gt;
 *     &lt;enumeration value="Event"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="InteractiveResource"/&gt;
 *     &lt;enumeration value="Model"/&gt;
 *     &lt;enumeration value="PhysicalObject"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Software"/&gt;
 *     &lt;enumeration value="Sound"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Workflow"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "resourceType")
@XmlEnum
public enum ResourceType {

    @XmlEnumValue("Audiovisual")
    AUDIOVISUAL("Audiovisual"),
    @XmlEnumValue("Collection")
    COLLECTION("Collection"),
    @XmlEnumValue("DataPaper")
    DATA_PAPER("DataPaper"),
    @XmlEnumValue("Dataset")
    DATASET("Dataset"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("InteractiveResource")
    INTERACTIVE_RESOURCE("InteractiveResource"),
    @XmlEnumValue("Model")
    MODEL("Model"),
    @XmlEnumValue("PhysicalObject")
    PHYSICAL_OBJECT("PhysicalObject"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Software")
    SOFTWARE("Software"),
    @XmlEnumValue("Sound")
    SOUND("Sound"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceType fromValue(String v) {
        for (ResourceType c: ResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
