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
 * <p>Classe Java per contributorType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="contributorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ContactPerson"/&gt;
 *     &lt;enumeration value="DataCollector"/&gt;
 *     &lt;enumeration value="DataCurator"/&gt;
 *     &lt;enumeration value="DataManager"/&gt;
 *     &lt;enumeration value="Distributor"/&gt;
 *     &lt;enumeration value="Editor"/&gt;
 *     &lt;enumeration value="HostingInstitution"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Producer"/&gt;
 *     &lt;enumeration value="ProjectLeader"/&gt;
 *     &lt;enumeration value="ProjectManager"/&gt;
 *     &lt;enumeration value="ProjectMember"/&gt;
 *     &lt;enumeration value="RegistrationAgency"/&gt;
 *     &lt;enumeration value="RegistrationAuthority"/&gt;
 *     &lt;enumeration value="RelatedPerson"/&gt;
 *     &lt;enumeration value="ResearchGroup"/&gt;
 *     &lt;enumeration value="RightsHolder"/&gt;
 *     &lt;enumeration value="Researcher"/&gt;
 *     &lt;enumeration value="Sponsor"/&gt;
 *     &lt;enumeration value="Supervisor"/&gt;
 *     &lt;enumeration value="WorkPackageLeader"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "contributorType")
@XmlEnum
public enum ContributorType {

    @XmlEnumValue("ContactPerson")
    CONTACT_PERSON("ContactPerson"),
    @XmlEnumValue("DataCollector")
    DATA_COLLECTOR("DataCollector"),
    @XmlEnumValue("DataCurator")
    DATA_CURATOR("DataCurator"),
    @XmlEnumValue("DataManager")
    DATA_MANAGER("DataManager"),
    @XmlEnumValue("Distributor")
    DISTRIBUTOR("Distributor"),
    @XmlEnumValue("Editor")
    EDITOR("Editor"),
    @XmlEnumValue("HostingInstitution")
    HOSTING_INSTITUTION("HostingInstitution"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Producer")
    PRODUCER("Producer"),
    @XmlEnumValue("ProjectLeader")
    PROJECT_LEADER("ProjectLeader"),
    @XmlEnumValue("ProjectManager")
    PROJECT_MANAGER("ProjectManager"),
    @XmlEnumValue("ProjectMember")
    PROJECT_MEMBER("ProjectMember"),
    @XmlEnumValue("RegistrationAgency")
    REGISTRATION_AGENCY("RegistrationAgency"),
    @XmlEnumValue("RegistrationAuthority")
    REGISTRATION_AUTHORITY("RegistrationAuthority"),
    @XmlEnumValue("RelatedPerson")
    RELATED_PERSON("RelatedPerson"),
    @XmlEnumValue("ResearchGroup")
    RESEARCH_GROUP("ResearchGroup"),
    @XmlEnumValue("RightsHolder")
    RIGHTS_HOLDER("RightsHolder"),
    @XmlEnumValue("Researcher")
    RESEARCHER("Researcher"),
    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("Supervisor")
    SUPERVISOR("Supervisor"),
    @XmlEnumValue("WorkPackageLeader")
    WORK_PACKAGE_LEADER("WorkPackageLeader");
    private final String value;

    ContributorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContributorType fromValue(String v) {
        for (ContributorType c: ContributorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
