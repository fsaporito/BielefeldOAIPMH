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
 * <p>Classe Java per relationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="relationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IsCitedBy"/&gt;
 *     &lt;enumeration value="Cites"/&gt;
 *     &lt;enumeration value="IsSupplementTo"/&gt;
 *     &lt;enumeration value="IsSupplementedBy"/&gt;
 *     &lt;enumeration value="IsContinuedBy"/&gt;
 *     &lt;enumeration value="Continues"/&gt;
 *     &lt;enumeration value="IsNewVersionOf"/&gt;
 *     &lt;enumeration value="IsPreviousVersionOf"/&gt;
 *     &lt;enumeration value="IsPartOf"/&gt;
 *     &lt;enumeration value="HasPart"/&gt;
 *     &lt;enumeration value="IsReferencedBy"/&gt;
 *     &lt;enumeration value="References"/&gt;
 *     &lt;enumeration value="IsDocumentedBy"/&gt;
 *     &lt;enumeration value="Documents"/&gt;
 *     &lt;enumeration value="IsCompiledBy"/&gt;
 *     &lt;enumeration value="Compiles"/&gt;
 *     &lt;enumeration value="IsVariantFormOf"/&gt;
 *     &lt;enumeration value="IsOriginalFormOf"/&gt;
 *     &lt;enumeration value="IsIdenticalTo"/&gt;
 *     &lt;enumeration value="HasMetadata"/&gt;
 *     &lt;enumeration value="IsMetadataFor"/&gt;
 *     &lt;enumeration value="Reviews"/&gt;
 *     &lt;enumeration value="IsReviewedBy"/&gt;
 *     &lt;enumeration value="IsDerivedFrom"/&gt;
 *     &lt;enumeration value="IsSourceOf"/&gt;
 *     &lt;enumeration value="Describes"/&gt;
 *     &lt;enumeration value="IsDescribedBy"/&gt;
 *     &lt;enumeration value="HasVersion"/&gt;
 *     &lt;enumeration value="IsVersionOf"/&gt;
 *     &lt;enumeration value="Requires"/&gt;
 *     &lt;enumeration value="IsRequiredBy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "relationType")
@XmlEnum
public enum RelationType {

    @XmlEnumValue("IsCitedBy")
    IS_CITED_BY("IsCitedBy"),
    @XmlEnumValue("Cites")
    CITES("Cites"),
    @XmlEnumValue("IsSupplementTo")
    IS_SUPPLEMENT_TO("IsSupplementTo"),
    @XmlEnumValue("IsSupplementedBy")
    IS_SUPPLEMENTED_BY("IsSupplementedBy"),
    @XmlEnumValue("IsContinuedBy")
    IS_CONTINUED_BY("IsContinuedBy"),
    @XmlEnumValue("Continues")
    CONTINUES("Continues"),
    @XmlEnumValue("IsNewVersionOf")
    IS_NEW_VERSION_OF("IsNewVersionOf"),
    @XmlEnumValue("IsPreviousVersionOf")
    IS_PREVIOUS_VERSION_OF("IsPreviousVersionOf"),
    @XmlEnumValue("IsPartOf")
    IS_PART_OF("IsPartOf"),
    @XmlEnumValue("HasPart")
    HAS_PART("HasPart"),
    @XmlEnumValue("IsReferencedBy")
    IS_REFERENCED_BY("IsReferencedBy"),
    @XmlEnumValue("References")
    REFERENCES("References"),
    @XmlEnumValue("IsDocumentedBy")
    IS_DOCUMENTED_BY("IsDocumentedBy"),
    @XmlEnumValue("Documents")
    DOCUMENTS("Documents"),
    @XmlEnumValue("IsCompiledBy")
    IS_COMPILED_BY("IsCompiledBy"),
    @XmlEnumValue("Compiles")
    COMPILES("Compiles"),
    @XmlEnumValue("IsVariantFormOf")
    IS_VARIANT_FORM_OF("IsVariantFormOf"),
    @XmlEnumValue("IsOriginalFormOf")
    IS_ORIGINAL_FORM_OF("IsOriginalFormOf"),
    @XmlEnumValue("IsIdenticalTo")
    IS_IDENTICAL_TO("IsIdenticalTo"),
    @XmlEnumValue("HasMetadata")
    HAS_METADATA("HasMetadata"),
    @XmlEnumValue("IsMetadataFor")
    IS_METADATA_FOR("IsMetadataFor"),
    @XmlEnumValue("Reviews")
    REVIEWS("Reviews"),
    @XmlEnumValue("IsReviewedBy")
    IS_REVIEWED_BY("IsReviewedBy"),
    @XmlEnumValue("IsDerivedFrom")
    IS_DERIVED_FROM("IsDerivedFrom"),
    @XmlEnumValue("IsSourceOf")
    IS_SOURCE_OF("IsSourceOf"),
    @XmlEnumValue("Describes")
    DESCRIBES("Describes"),
    @XmlEnumValue("IsDescribedBy")
    IS_DESCRIBED_BY("IsDescribedBy"),
    @XmlEnumValue("HasVersion")
    HAS_VERSION("HasVersion"),
    @XmlEnumValue("IsVersionOf")
    IS_VERSION_OF("IsVersionOf"),
    @XmlEnumValue("Requires")
    REQUIRES("Requires"),
    @XmlEnumValue("IsRequiredBy")
    IS_REQUIRED_BY("IsRequiredBy");
    private final String value;

    RelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationType fromValue(String v) {
        for (RelationType c: RelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
