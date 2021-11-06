//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.06 alle 03:53:07 PM UTC 
//


package org.datacite.schema.kernel_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="identifier"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;doiType"&gt;
 *                 &lt;attribute name="identifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DOI" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="creators"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="creator" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="creatorName"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
 *                                     &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="nameIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
 *                                     &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titles"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="title" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
 *                           &lt;attribute name="titleType" type="{http://datacite.org/schema/kernel-4}titleType" /&gt;
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="publisher"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="publicationYear"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://datacite.org/schema/kernel-4}yearType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resourceType"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="resourceTypeGeneral" use="required" type="{http://datacite.org/schema/kernel-4}resourceType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subjects" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subject" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="subjectScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contributors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contributor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="contributorName"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
 *                                     &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="nameIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="contributorType" use="required" type="{http://datacite.org/schema/kernel-4}contributorType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="date" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="dateType" use="required" type="{http://datacite.org/schema/kernel-4}dateType" /&gt;
 *                           &lt;attribute name="dateInformation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
 *         &lt;element name="alternateIdentifiers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="alternateIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="alternateIdentifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="relatedIdentifiers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="relatedIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="resourceTypeGeneral" type="{http://datacite.org/schema/kernel-4}resourceType" /&gt;
 *                           &lt;attribute name="relatedIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}relatedIdentifierType" /&gt;
 *                           &lt;attribute name="relationType" use="required" type="{http://datacite.org/schema/kernel-4}relationType" /&gt;
 *                           &lt;attribute name="relatedMetadataScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute name="schemeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sizes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="formats" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightsList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rights" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="rightsURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="description" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="br" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;length value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attribute name="descriptionType" use="required" type="{http://datacite.org/schema/kernel-4}descriptionType" /&gt;
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geoLocations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geoLocation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice maxOccurs="unbounded"&gt;
 *                             &lt;element name="geoLocationPlace" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="geoLocationPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
 *                             &lt;element name="geoLocationBox" type="{http://datacite.org/schema/kernel-4}box" minOccurs="0"/&gt;
 *                             &lt;element name="geoLocationPolygon" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="polygonPoint" type="{http://datacite.org/schema/kernel-4}point" maxOccurs="unbounded" minOccurs="4"/&gt;
 *                                       &lt;element name="inPolygonPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fundingReferences" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fundingReference" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="funderName"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="funderIdentifier" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awardNumber" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awardTitle" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "resource")
public class Resource {

    @XmlElement(required = true)
    protected Resource.Identifier identifier;
    @XmlElement(required = true)
    protected Resource.Creators creators;
    @XmlElement(required = true)
    protected Resource.Titles titles;
    @XmlElement(required = true)
    protected String publisher;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationYear;
    @XmlElement(required = true)
    protected Resource.ResourceType resourceType;
    protected Resource.Subjects subjects;
    protected Resource.Contributors contributors;
    protected Resource.Dates dates;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    protected Resource.AlternateIdentifiers alternateIdentifiers;
    protected Resource.RelatedIdentifiers relatedIdentifiers;
    protected Resource.Sizes sizes;
    protected Resource.Formats formats;
    protected String version;
    protected Resource.RightsList rightsList;
    protected Resource.Descriptions descriptions;
    protected Resource.GeoLocations geoLocations;
    protected Resource.FundingReferences fundingReferences;

    /**
     * Recupera il valore della proprietà identifier.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Identifier }
     *     
     */
    public Resource.Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Imposta il valore della proprietà identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Identifier }
     *     
     */
    public void setIdentifier(Resource.Identifier value) {
        this.identifier = value;
    }

    /**
     * Recupera il valore della proprietà creators.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Creators }
     *     
     */
    public Resource.Creators getCreators() {
        return creators;
    }

    /**
     * Imposta il valore della proprietà creators.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Creators }
     *     
     */
    public void setCreators(Resource.Creators value) {
        this.creators = value;
    }

    /**
     * Recupera il valore della proprietà titles.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Titles }
     *     
     */
    public Resource.Titles getTitles() {
        return titles;
    }

    /**
     * Imposta il valore della proprietà titles.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Titles }
     *     
     */
    public void setTitles(Resource.Titles value) {
        this.titles = value;
    }

    /**
     * Recupera il valore della proprietà publisher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Imposta il valore della proprietà publisher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Recupera il valore della proprietà publicationYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationYear() {
        return publicationYear;
    }

    /**
     * Imposta il valore della proprietà publicationYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationYear(String value) {
        this.publicationYear = value;
    }

    /**
     * Recupera il valore della proprietà resourceType.
     * 
     * @return
     *     possible object is
     *     {@link Resource.ResourceType }
     *     
     */
    public Resource.ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Imposta il valore della proprietà resourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.ResourceType }
     *     
     */
    public void setResourceType(Resource.ResourceType value) {
        this.resourceType = value;
    }

    /**
     * Recupera il valore della proprietà subjects.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Subjects }
     *     
     */
    public Resource.Subjects getSubjects() {
        return subjects;
    }

    /**
     * Imposta il valore della proprietà subjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Subjects }
     *     
     */
    public void setSubjects(Resource.Subjects value) {
        this.subjects = value;
    }

    /**
     * Recupera il valore della proprietà contributors.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Contributors }
     *     
     */
    public Resource.Contributors getContributors() {
        return contributors;
    }

    /**
     * Imposta il valore della proprietà contributors.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Contributors }
     *     
     */
    public void setContributors(Resource.Contributors value) {
        this.contributors = value;
    }

    /**
     * Recupera il valore della proprietà dates.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Dates }
     *     
     */
    public Resource.Dates getDates() {
        return dates;
    }

    /**
     * Imposta il valore della proprietà dates.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Dates }
     *     
     */
    public void setDates(Resource.Dates value) {
        this.dates = value;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Recupera il valore della proprietà alternateIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link Resource.AlternateIdentifiers }
     *     
     */
    public Resource.AlternateIdentifiers getAlternateIdentifiers() {
        return alternateIdentifiers;
    }

    /**
     * Imposta il valore della proprietà alternateIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.AlternateIdentifiers }
     *     
     */
    public void setAlternateIdentifiers(Resource.AlternateIdentifiers value) {
        this.alternateIdentifiers = value;
    }

    /**
     * Recupera il valore della proprietà relatedIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link Resource.RelatedIdentifiers }
     *     
     */
    public Resource.RelatedIdentifiers getRelatedIdentifiers() {
        return relatedIdentifiers;
    }

    /**
     * Imposta il valore della proprietà relatedIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.RelatedIdentifiers }
     *     
     */
    public void setRelatedIdentifiers(Resource.RelatedIdentifiers value) {
        this.relatedIdentifiers = value;
    }

    /**
     * Recupera il valore della proprietà sizes.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Sizes }
     *     
     */
    public Resource.Sizes getSizes() {
        return sizes;
    }

    /**
     * Imposta il valore della proprietà sizes.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Sizes }
     *     
     */
    public void setSizes(Resource.Sizes value) {
        this.sizes = value;
    }

    /**
     * Recupera il valore della proprietà formats.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Formats }
     *     
     */
    public Resource.Formats getFormats() {
        return formats;
    }

    /**
     * Imposta il valore della proprietà formats.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Formats }
     *     
     */
    public void setFormats(Resource.Formats value) {
        this.formats = value;
    }

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Recupera il valore della proprietà rightsList.
     * 
     * @return
     *     possible object is
     *     {@link Resource.RightsList }
     *     
     */
    public Resource.RightsList getRightsList() {
        return rightsList;
    }

    /**
     * Imposta il valore della proprietà rightsList.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.RightsList }
     *     
     */
    public void setRightsList(Resource.RightsList value) {
        this.rightsList = value;
    }

    /**
     * Recupera il valore della proprietà descriptions.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Descriptions }
     *     
     */
    public Resource.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Imposta il valore della proprietà descriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Descriptions }
     *     
     */
    public void setDescriptions(Resource.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Recupera il valore della proprietà geoLocations.
     * 
     * @return
     *     possible object is
     *     {@link Resource.GeoLocations }
     *     
     */
    public Resource.GeoLocations getGeoLocations() {
        return geoLocations;
    }

    /**
     * Imposta il valore della proprietà geoLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.GeoLocations }
     *     
     */
    public void setGeoLocations(Resource.GeoLocations value) {
        this.geoLocations = value;
    }

    /**
     * Recupera il valore della proprietà fundingReferences.
     * 
     * @return
     *     possible object is
     *     {@link Resource.FundingReferences }
     *     
     */
    public Resource.FundingReferences getFundingReferences() {
        return fundingReferences;
    }

    /**
     * Imposta il valore della proprietà fundingReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.FundingReferences }
     *     
     */
    public void setFundingReferences(Resource.FundingReferences value) {
        this.fundingReferences = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="alternateIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="alternateIdentifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alternateIdentifier"
    })
    public static class AlternateIdentifiers {

        protected List<Resource.AlternateIdentifiers.AlternateIdentifier> alternateIdentifier;

        /**
         * Gets the value of the alternateIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.AlternateIdentifiers.AlternateIdentifier }
         * 
         * 
         */
        public List<Resource.AlternateIdentifiers.AlternateIdentifier> getAlternateIdentifier() {
            if (alternateIdentifier == null) {
                alternateIdentifier = new ArrayList<Resource.AlternateIdentifiers.AlternateIdentifier>();
            }
            return this.alternateIdentifier;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="alternateIdentifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AlternateIdentifier {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "alternateIdentifierType", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String alternateIdentifierType;

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
             * Recupera il valore della proprietà alternateIdentifierType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternateIdentifierType() {
                return alternateIdentifierType;
            }

            /**
             * Imposta il valore della proprietà alternateIdentifierType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternateIdentifierType(String value) {
                this.alternateIdentifierType = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="contributor" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="contributorName"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
     *                           &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="nameIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="contributorType" use="required" type="{http://datacite.org/schema/kernel-4}contributorType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributor"
    })
    public static class Contributors {

        protected List<Resource.Contributors.Contributor> contributor;

        /**
         * Gets the value of the contributor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contributor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContributor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.Contributors.Contributor }
         * 
         * 
         */
        public List<Resource.Contributors.Contributor> getContributor() {
            if (contributor == null) {
                contributor = new ArrayList<Resource.Contributors.Contributor>();
            }
            return this.contributor;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="contributorName"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
         *                 &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="nameIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="contributorType" use="required" type="{http://datacite.org/schema/kernel-4}contributorType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contributorName",
            "givenName",
            "familyName",
            "nameIdentifier",
            "affiliation"
        })
        public static class Contributor {

            @XmlElement(required = true)
            protected Resource.Contributors.Contributor.ContributorName contributorName;
            protected Object givenName;
            protected Object familyName;
            protected List<Resource.Contributors.Contributor.NameIdentifier> nameIdentifier;
            protected List<Object> affiliation;
            @XmlAttribute(name = "contributorType", required = true)
            protected ContributorType contributorType;

            /**
             * Recupera il valore della proprietà contributorName.
             * 
             * @return
             *     possible object is
             *     {@link Resource.Contributors.Contributor.ContributorName }
             *     
             */
            public Resource.Contributors.Contributor.ContributorName getContributorName() {
                return contributorName;
            }

            /**
             * Imposta il valore della proprietà contributorName.
             * 
             * @param value
             *     allowed object is
             *     {@link Resource.Contributors.Contributor.ContributorName }
             *     
             */
            public void setContributorName(Resource.Contributors.Contributor.ContributorName value) {
                this.contributorName = value;
            }

            /**
             * Recupera il valore della proprietà givenName.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getGivenName() {
                return givenName;
            }

            /**
             * Imposta il valore della proprietà givenName.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setGivenName(Object value) {
                this.givenName = value;
            }

            /**
             * Recupera il valore della proprietà familyName.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFamilyName() {
                return familyName;
            }

            /**
             * Imposta il valore della proprietà familyName.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFamilyName(Object value) {
                this.familyName = value;
            }

            /**
             * Gets the value of the nameIdentifier property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nameIdentifier property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNameIdentifier().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Resource.Contributors.Contributor.NameIdentifier }
             * 
             * 
             */
            public List<Resource.Contributors.Contributor.NameIdentifier> getNameIdentifier() {
                if (nameIdentifier == null) {
                    nameIdentifier = new ArrayList<Resource.Contributors.Contributor.NameIdentifier>();
                }
                return this.nameIdentifier;
            }

            /**
             * Gets the value of the affiliation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the affiliation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAffiliation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAffiliation() {
                if (affiliation == null) {
                    affiliation = new ArrayList<Object>();
                }
                return this.affiliation;
            }

            /**
             * Recupera il valore della proprietà contributorType.
             * 
             * @return
             *     possible object is
             *     {@link ContributorType }
             *     
             */
            public ContributorType getContributorType() {
                return contributorType;
            }

            /**
             * Imposta il valore della proprietà contributorType.
             * 
             * @param value
             *     allowed object is
             *     {@link ContributorType }
             *     
             */
            public void setContributorType(ContributorType value) {
                this.contributorType = value;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
             *       &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContributorName {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "nameType")
                protected NameType nameType;

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
                 * Recupera il valore della proprietà nameType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameType }
                 *     
                 */
                public NameType getNameType() {
                    return nameType;
                }

                /**
                 * Imposta il valore della proprietà nameType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameType }
                 *     
                 */
                public void setNameType(NameType value) {
                    this.nameType = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class NameIdentifier {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "nameIdentifierScheme", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String nameIdentifierScheme;
                @XmlAttribute(name = "schemeURI")
                @XmlSchemaType(name = "anyURI")
                protected String schemeURI;

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
                 * Recupera il valore della proprietà nameIdentifierScheme.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNameIdentifierScheme() {
                    return nameIdentifierScheme;
                }

                /**
                 * Imposta il valore della proprietà nameIdentifierScheme.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNameIdentifierScheme(String value) {
                    this.nameIdentifierScheme = value;
                }

                /**
                 * Recupera il valore della proprietà schemeURI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchemeURI() {
                    return schemeURI;
                }

                /**
                 * Imposta il valore della proprietà schemeURI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchemeURI(String value) {
                    this.schemeURI = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="creator" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="creatorName"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
     *                           &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="nameIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
     *                           &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creator"
    })
    public static class Creators {

        @XmlElement(required = true)
        protected List<Resource.Creators.Creator> creator;

        /**
         * Gets the value of the creator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.Creators.Creator }
         * 
         * 
         */
        public List<Resource.Creators.Creator> getCreator() {
            if (creator == null) {
                creator = new ArrayList<Resource.Creators.Creator>();
            }
            return this.creator;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="creatorName"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
         *                 &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="nameIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
         *                 &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "creatorName",
            "givenName",
            "familyName",
            "nameIdentifier",
            "affiliation"
        })
        public static class Creator {

            @XmlElement(required = true)
            protected Resource.Creators.Creator.CreatorName creatorName;
            protected Object givenName;
            protected Object familyName;
            protected List<Resource.Creators.Creator.NameIdentifier> nameIdentifier;
            protected List<Object> affiliation;

            /**
             * Recupera il valore della proprietà creatorName.
             * 
             * @return
             *     possible object is
             *     {@link Resource.Creators.Creator.CreatorName }
             *     
             */
            public Resource.Creators.Creator.CreatorName getCreatorName() {
                return creatorName;
            }

            /**
             * Imposta il valore della proprietà creatorName.
             * 
             * @param value
             *     allowed object is
             *     {@link Resource.Creators.Creator.CreatorName }
             *     
             */
            public void setCreatorName(Resource.Creators.Creator.CreatorName value) {
                this.creatorName = value;
            }

            /**
             * Recupera il valore della proprietà givenName.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getGivenName() {
                return givenName;
            }

            /**
             * Imposta il valore della proprietà givenName.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setGivenName(Object value) {
                this.givenName = value;
            }

            /**
             * Recupera il valore della proprietà familyName.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFamilyName() {
                return familyName;
            }

            /**
             * Imposta il valore della proprietà familyName.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFamilyName(Object value) {
                this.familyName = value;
            }

            /**
             * Gets the value of the nameIdentifier property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nameIdentifier property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNameIdentifier().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Resource.Creators.Creator.NameIdentifier }
             * 
             * 
             */
            public List<Resource.Creators.Creator.NameIdentifier> getNameIdentifier() {
                if (nameIdentifier == null) {
                    nameIdentifier = new ArrayList<Resource.Creators.Creator.NameIdentifier>();
                }
                return this.nameIdentifier;
            }

            /**
             * Gets the value of the affiliation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the affiliation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAffiliation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAffiliation() {
                if (affiliation == null) {
                    affiliation = new ArrayList<Object>();
                }
                return this.affiliation;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
             *       &lt;attribute name="nameType" type="{http://datacite.org/schema/kernel-4}nameType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CreatorName {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "nameType")
                protected NameType nameType;

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
                 * Recupera il valore della proprietà nameType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameType }
                 *     
                 */
                public NameType getNameType() {
                    return nameType;
                }

                /**
                 * Imposta il valore della proprietà nameType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameType }
                 *     
                 */
                public void setNameType(NameType value) {
                    this.nameType = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
             *       &lt;attribute name="nameIdentifierScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class NameIdentifier {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "nameIdentifierScheme", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String nameIdentifierScheme;
                @XmlAttribute(name = "schemeURI")
                @XmlSchemaType(name = "anyURI")
                protected String schemeURI;

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
                 * Recupera il valore della proprietà nameIdentifierScheme.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNameIdentifierScheme() {
                    return nameIdentifierScheme;
                }

                /**
                 * Imposta il valore della proprietà nameIdentifierScheme.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNameIdentifierScheme(String value) {
                    this.nameIdentifierScheme = value;
                }

                /**
                 * Recupera il valore della proprietà schemeURI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchemeURI() {
                    return schemeURI;
                }

                /**
                 * Imposta il valore della proprietà schemeURI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchemeURI(String value) {
                    this.schemeURI = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="date" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="dateType" use="required" type="{http://datacite.org/schema/kernel-4}dateType" /&gt;
     *                 &lt;attribute name="dateInformation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date"
    })
    public static class Dates {

        protected List<Resource.Dates.Date> date;

        /**
         * Gets the value of the date property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.Dates.Date }
         * 
         * 
         */
        public List<Resource.Dates.Date> getDate() {
            if (date == null) {
                date = new ArrayList<Resource.Dates.Date>();
            }
            return this.date;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="dateType" use="required" type="{http://datacite.org/schema/kernel-4}dateType" /&gt;
         *       &lt;attribute name="dateInformation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Date {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "dateType", required = true)
            protected DateType dateType;
            @XmlAttribute(name = "dateInformation")
            @XmlSchemaType(name = "anySimpleType")
            protected String dateInformation;

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
             * Recupera il valore della proprietà dateType.
             * 
             * @return
             *     possible object is
             *     {@link DateType }
             *     
             */
            public DateType getDateType() {
                return dateType;
            }

            /**
             * Imposta il valore della proprietà dateType.
             * 
             * @param value
             *     allowed object is
             *     {@link DateType }
             *     
             */
            public void setDateType(DateType value) {
                this.dateType = value;
            }

            /**
             * Recupera il valore della proprietà dateInformation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateInformation() {
                return dateInformation;
            }

            /**
             * Imposta il valore della proprietà dateInformation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateInformation(String value) {
                this.dateInformation = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="description" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="br" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;length value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/choice&gt;
     *                 &lt;attribute name="descriptionType" use="required" type="{http://datacite.org/schema/kernel-4}descriptionType" /&gt;
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Descriptions {

        protected List<Resource.Descriptions.Description> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.Descriptions.Description }
         * 
         * 
         */
        public List<Resource.Descriptions.Description> getDescription() {
            if (description == null) {
                description = new ArrayList<Resource.Descriptions.Description>();
            }
            return this.description;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="br" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;length value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/choice&gt;
         *       &lt;attribute name="descriptionType" use="required" type="{http://datacite.org/schema/kernel-4}descriptionType" /&gt;
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Description {

            @XmlElementRef(name = "br", namespace = "http://datacite.org/schema/kernel-4", type = JAXBElement.class, required = false)
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "descriptionType", required = true)
            protected DescriptionType descriptionType;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link String }
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Recupera il valore della proprietà descriptionType.
             * 
             * @return
             *     possible object is
             *     {@link DescriptionType }
             *     
             */
            public DescriptionType getDescriptionType() {
                return descriptionType;
            }

            /**
             * Imposta il valore della proprietà descriptionType.
             * 
             * @param value
             *     allowed object is
             *     {@link DescriptionType }
             *     
             */
            public void setDescriptionType(DescriptionType value) {
                this.descriptionType = value;
            }

            /**
             * Recupera il valore della proprietà lang.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Imposta il valore della proprietà lang.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "format"
    })
    public static class Formats {

        protected List<String> format;

        /**
         * Gets the value of the format property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the format property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFormat() {
            if (format == null) {
                format = new ArrayList<String>();
            }
            return this.format;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fundingReference" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="funderName"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="funderIdentifier" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awardNumber" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awardTitle" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fundingReference"
    })
    public static class FundingReferences {

        protected List<Resource.FundingReferences.FundingReference> fundingReference;

        /**
         * Gets the value of the fundingReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fundingReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFundingReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.FundingReferences.FundingReference }
         * 
         * 
         */
        public List<Resource.FundingReferences.FundingReference> getFundingReference() {
            if (fundingReference == null) {
                fundingReference = new ArrayList<Resource.FundingReferences.FundingReference>();
            }
            return this.fundingReference;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="funderName"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="funderIdentifier" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awardNumber" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awardTitle" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://datacite.org/schema/kernel-4}nonemptycontentStringType"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class FundingReference {

            @XmlElement(required = true)
            protected String funderName;
            protected Resource.FundingReferences.FundingReference.FunderIdentifier funderIdentifier;
            protected Resource.FundingReferences.FundingReference.AwardNumber awardNumber;
            protected String awardTitle;

            /**
             * Recupera il valore della proprietà funderName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFunderName() {
                return funderName;
            }

            /**
             * Imposta il valore della proprietà funderName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFunderName(String value) {
                this.funderName = value;
            }

            /**
             * Recupera il valore della proprietà funderIdentifier.
             * 
             * @return
             *     possible object is
             *     {@link Resource.FundingReferences.FundingReference.FunderIdentifier }
             *     
             */
            public Resource.FundingReferences.FundingReference.FunderIdentifier getFunderIdentifier() {
                return funderIdentifier;
            }

            /**
             * Imposta il valore della proprietà funderIdentifier.
             * 
             * @param value
             *     allowed object is
             *     {@link Resource.FundingReferences.FundingReference.FunderIdentifier }
             *     
             */
            public void setFunderIdentifier(Resource.FundingReferences.FundingReference.FunderIdentifier value) {
                this.funderIdentifier = value;
            }

            /**
             * Recupera il valore della proprietà awardNumber.
             * 
             * @return
             *     possible object is
             *     {@link Resource.FundingReferences.FundingReference.AwardNumber }
             *     
             */
            public Resource.FundingReferences.FundingReference.AwardNumber getAwardNumber() {
                return awardNumber;
            }

            /**
             * Imposta il valore della proprietà awardNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Resource.FundingReferences.FundingReference.AwardNumber }
             *     
             */
            public void setAwardNumber(Resource.FundingReferences.FundingReference.AwardNumber value) {
                this.awardNumber = value;
            }

            /**
             * Recupera il valore della proprietà awardTitle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwardTitle() {
                return awardTitle;
            }

            /**
             * Imposta il valore della proprietà awardTitle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwardTitle(String value) {
                this.awardTitle = value;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class AwardNumber {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "awardURI")
                @XmlSchemaType(name = "anyURI")
                protected String awardURI;

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
                 * Recupera il valore della proprietà awardURI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwardURI() {
                    return awardURI;
                }

                /**
                 * Imposta il valore della proprietà awardURI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwardURI(String value) {
                    this.awardURI = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class FunderIdentifier {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "funderIdentifierType", required = true)
                protected FunderIdentifierType funderIdentifierType;

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
                 * Recupera il valore della proprietà funderIdentifierType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FunderIdentifierType }
                 *     
                 */
                public FunderIdentifierType getFunderIdentifierType() {
                    return funderIdentifierType;
                }

                /**
                 * Imposta il valore della proprietà funderIdentifierType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FunderIdentifierType }
                 *     
                 */
                public void setFunderIdentifierType(FunderIdentifierType value) {
                    this.funderIdentifierType = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="geoLocation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice maxOccurs="unbounded"&gt;
     *                   &lt;element name="geoLocationPlace" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="geoLocationPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
     *                   &lt;element name="geoLocationBox" type="{http://datacite.org/schema/kernel-4}box" minOccurs="0"/&gt;
     *                   &lt;element name="geoLocationPolygon" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="polygonPoint" type="{http://datacite.org/schema/kernel-4}point" maxOccurs="unbounded" minOccurs="4"/&gt;
     *                             &lt;element name="inPolygonPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geoLocation"
    })
    public static class GeoLocations {

        protected List<Resource.GeoLocations.GeoLocation> geoLocation;

        /**
         * Gets the value of the geoLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geoLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeoLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.GeoLocations.GeoLocation }
         * 
         * 
         */
        public List<Resource.GeoLocations.GeoLocation> getGeoLocation() {
            if (geoLocation == null) {
                geoLocation = new ArrayList<Resource.GeoLocations.GeoLocation>();
            }
            return this.geoLocation;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice maxOccurs="unbounded"&gt;
         *         &lt;element name="geoLocationPlace" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="geoLocationPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
         *         &lt;element name="geoLocationBox" type="{http://datacite.org/schema/kernel-4}box" minOccurs="0"/&gt;
         *         &lt;element name="geoLocationPolygon" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="polygonPoint" type="{http://datacite.org/schema/kernel-4}point" maxOccurs="unbounded" minOccurs="4"/&gt;
         *                   &lt;element name="inPolygonPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "geoLocationPlaceOrGeoLocationPointOrGeoLocationBox"
        })
        public static class GeoLocation {

            @XmlElements({
                @XmlElement(name = "geoLocationPlace"),
                @XmlElement(name = "geoLocationPoint", type = Point.class),
                @XmlElement(name = "geoLocationBox", type = Box.class),
                @XmlElement(name = "geoLocationPolygon", type = Resource.GeoLocations.GeoLocation.GeoLocationPolygon.class)
            })
            protected List<Object> geoLocationPlaceOrGeoLocationPointOrGeoLocationBox;

            /**
             * Gets the value of the geoLocationPlaceOrGeoLocationPointOrGeoLocationBox property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the geoLocationPlaceOrGeoLocationPointOrGeoLocationBox property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeoLocationPlaceOrGeoLocationPointOrGeoLocationBox().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * {@link Point }
             * {@link Box }
             * {@link Resource.GeoLocations.GeoLocation.GeoLocationPolygon }
             * 
             * 
             */
            public List<Object> getGeoLocationPlaceOrGeoLocationPointOrGeoLocationBox() {
                if (geoLocationPlaceOrGeoLocationPointOrGeoLocationBox == null) {
                    geoLocationPlaceOrGeoLocationPointOrGeoLocationBox = new ArrayList<Object>();
                }
                return this.geoLocationPlaceOrGeoLocationPointOrGeoLocationBox;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="polygonPoint" type="{http://datacite.org/schema/kernel-4}point" maxOccurs="unbounded" minOccurs="4"/&gt;
             *         &lt;element name="inPolygonPoint" type="{http://datacite.org/schema/kernel-4}point" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "polygonPoint",
                "inPolygonPoint"
            })
            public static class GeoLocationPolygon {

                @XmlElement(required = true)
                protected List<Point> polygonPoint;
                protected Point inPolygonPoint;

                /**
                 * Gets the value of the polygonPoint property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the polygonPoint property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPolygonPoint().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Point }
                 * 
                 * 
                 */
                public List<Point> getPolygonPoint() {
                    if (polygonPoint == null) {
                        polygonPoint = new ArrayList<Point>();
                    }
                    return this.polygonPoint;
                }

                /**
                 * Recupera il valore della proprietà inPolygonPoint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Point }
                 *     
                 */
                public Point getInPolygonPoint() {
                    return inPolygonPoint;
                }

                /**
                 * Imposta il valore della proprietà inPolygonPoint.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Point }
                 *     
                 */
                public void setInPolygonPoint(Point value) {
                    this.inPolygonPoint = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;doiType"&gt;
     *       &lt;attribute name="identifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DOI" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Identifier {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "identifierType", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String identifierType;

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
         * Recupera il valore della proprietà identifierType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifierType() {
            if (identifierType == null) {
                return "DOI";
            } else {
                return identifierType;
            }
        }

        /**
         * Imposta il valore della proprietà identifierType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifierType(String value) {
            this.identifierType = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="relatedIdentifier" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="resourceTypeGeneral" type="{http://datacite.org/schema/kernel-4}resourceType" /&gt;
     *                 &lt;attribute name="relatedIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}relatedIdentifierType" /&gt;
     *                 &lt;attribute name="relationType" use="required" type="{http://datacite.org/schema/kernel-4}relationType" /&gt;
     *                 &lt;attribute name="relatedMetadataScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute name="schemeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relatedIdentifier"
    })
    public static class RelatedIdentifiers {

        protected List<Resource.RelatedIdentifiers.RelatedIdentifier> relatedIdentifier;

        /**
         * Gets the value of the relatedIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.RelatedIdentifiers.RelatedIdentifier }
         * 
         * 
         */
        public List<Resource.RelatedIdentifiers.RelatedIdentifier> getRelatedIdentifier() {
            if (relatedIdentifier == null) {
                relatedIdentifier = new ArrayList<Resource.RelatedIdentifiers.RelatedIdentifier>();
            }
            return this.relatedIdentifier;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="resourceTypeGeneral" type="{http://datacite.org/schema/kernel-4}resourceType" /&gt;
         *       &lt;attribute name="relatedIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}relatedIdentifierType" /&gt;
         *       &lt;attribute name="relationType" use="required" type="{http://datacite.org/schema/kernel-4}relationType" /&gt;
         *       &lt;attribute name="relatedMetadataScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute name="schemeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class RelatedIdentifier {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "resourceTypeGeneral")
            protected org.datacite.schema.kernel_4.ResourceType resourceTypeGeneral;
            @XmlAttribute(name = "relatedIdentifierType", required = true)
            protected RelatedIdentifierType relatedIdentifierType;
            @XmlAttribute(name = "relationType", required = true)
            protected RelationType relationType;
            @XmlAttribute(name = "relatedMetadataScheme")
            @XmlSchemaType(name = "anySimpleType")
            protected String relatedMetadataScheme;
            @XmlAttribute(name = "schemeURI")
            @XmlSchemaType(name = "anyURI")
            protected String schemeURI;
            @XmlAttribute(name = "schemeType")
            @XmlSchemaType(name = "anySimpleType")
            protected String schemeType;

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
             * Recupera il valore della proprietà resourceTypeGeneral.
             * 
             * @return
             *     possible object is
             *     {@link org.datacite.schema.kernel_4.ResourceType }
             *     
             */
            public org.datacite.schema.kernel_4.ResourceType getResourceTypeGeneral() {
                return resourceTypeGeneral;
            }

            /**
             * Imposta il valore della proprietà resourceTypeGeneral.
             * 
             * @param value
             *     allowed object is
             *     {@link org.datacite.schema.kernel_4.ResourceType }
             *     
             */
            public void setResourceTypeGeneral(org.datacite.schema.kernel_4.ResourceType value) {
                this.resourceTypeGeneral = value;
            }

            /**
             * Recupera il valore della proprietà relatedIdentifierType.
             * 
             * @return
             *     possible object is
             *     {@link RelatedIdentifierType }
             *     
             */
            public RelatedIdentifierType getRelatedIdentifierType() {
                return relatedIdentifierType;
            }

            /**
             * Imposta il valore della proprietà relatedIdentifierType.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedIdentifierType }
             *     
             */
            public void setRelatedIdentifierType(RelatedIdentifierType value) {
                this.relatedIdentifierType = value;
            }

            /**
             * Recupera il valore della proprietà relationType.
             * 
             * @return
             *     possible object is
             *     {@link RelationType }
             *     
             */
            public RelationType getRelationType() {
                return relationType;
            }

            /**
             * Imposta il valore della proprietà relationType.
             * 
             * @param value
             *     allowed object is
             *     {@link RelationType }
             *     
             */
            public void setRelationType(RelationType value) {
                this.relationType = value;
            }

            /**
             * Recupera il valore della proprietà relatedMetadataScheme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelatedMetadataScheme() {
                return relatedMetadataScheme;
            }

            /**
             * Imposta il valore della proprietà relatedMetadataScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelatedMetadataScheme(String value) {
                this.relatedMetadataScheme = value;
            }

            /**
             * Recupera il valore della proprietà schemeURI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemeURI() {
                return schemeURI;
            }

            /**
             * Imposta il valore della proprietà schemeURI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemeURI(String value) {
                this.schemeURI = value;
            }

            /**
             * Recupera il valore della proprietà schemeType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemeType() {
                return schemeType;
            }

            /**
             * Imposta il valore della proprietà schemeType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemeType(String value) {
                this.schemeType = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="resourceTypeGeneral" use="required" type="{http://datacite.org/schema/kernel-4}resourceType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ResourceType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "resourceTypeGeneral", required = true)
        protected org.datacite.schema.kernel_4.ResourceType resourceTypeGeneral;

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
         * Recupera il valore della proprietà resourceTypeGeneral.
         * 
         * @return
         *     possible object is
         *     {@link org.datacite.schema.kernel_4.ResourceType }
         *     
         */
        public org.datacite.schema.kernel_4.ResourceType getResourceTypeGeneral() {
            return resourceTypeGeneral;
        }

        /**
         * Imposta il valore della proprietà resourceTypeGeneral.
         * 
         * @param value
         *     allowed object is
         *     {@link org.datacite.schema.kernel_4.ResourceType }
         *     
         */
        public void setResourceTypeGeneral(org.datacite.schema.kernel_4.ResourceType value) {
            this.resourceTypeGeneral = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="rights" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="rightsURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rights"
    })
    public static class RightsList {

        protected List<Resource.RightsList.Rights> rights;

        /**
         * Gets the value of the rights property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rights property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRights().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.RightsList.Rights }
         * 
         * 
         */
        public List<Resource.RightsList.Rights> getRights() {
            if (rights == null) {
                rights = new ArrayList<Resource.RightsList.Rights>();
            }
            return this.rights;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="rightsURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Rights {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "rightsURI")
            @XmlSchemaType(name = "anyURI")
            protected String rightsURI;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

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
             * Recupera il valore della proprietà rightsURI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRightsURI() {
                return rightsURI;
            }

            /**
             * Imposta il valore della proprietà rightsURI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRightsURI(String value) {
                this.rightsURI = value;
            }

            /**
             * Recupera il valore della proprietà lang.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Imposta il valore della proprietà lang.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "size"
    })
    public static class Sizes {

        protected List<String> size;

        /**
         * Gets the value of the size property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the size property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSize() {
            if (size == null) {
                size = new ArrayList<String>();
            }
            return this.size;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="subject" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="subjectScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subject"
    })
    public static class Subjects {

        protected List<Resource.Subjects.Subject> subject;

        /**
         * Gets the value of the subject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.Subjects.Subject }
         * 
         * 
         */
        public List<Resource.Subjects.Subject> getSubject() {
            if (subject == null) {
                subject = new ArrayList<Resource.Subjects.Subject>();
            }
            return this.subject;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="subjectScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Subject {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "subjectScheme")
            @XmlSchemaType(name = "anySimpleType")
            protected String subjectScheme;
            @XmlAttribute(name = "schemeURI")
            @XmlSchemaType(name = "anyURI")
            protected String schemeURI;
            @XmlAttribute(name = "valueURI")
            @XmlSchemaType(name = "anyURI")
            protected String valueURI;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

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
             * Recupera il valore della proprietà subjectScheme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubjectScheme() {
                return subjectScheme;
            }

            /**
             * Imposta il valore della proprietà subjectScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubjectScheme(String value) {
                this.subjectScheme = value;
            }

            /**
             * Recupera il valore della proprietà schemeURI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemeURI() {
                return schemeURI;
            }

            /**
             * Imposta il valore della proprietà schemeURI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemeURI(String value) {
                this.schemeURI = value;
            }

            /**
             * Recupera il valore della proprietà valueURI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueURI() {
                return valueURI;
            }

            /**
             * Imposta il valore della proprietà valueURI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueURI(String value) {
                this.valueURI = value;
            }

            /**
             * Recupera il valore della proprietà lang.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Imposta il valore della proprietà lang.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="title" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
     *                 &lt;attribute name="titleType" type="{http://datacite.org/schema/kernel-4}titleType" /&gt;
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title"
    })
    public static class Titles {

        @XmlElement(required = true)
        protected List<Resource.Titles.Title> title;

        /**
         * Gets the value of the title property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the title property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTitle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resource.Titles.Title }
         * 
         * 
         */
        public List<Resource.Titles.Title> getTitle() {
            if (title == null) {
                title = new ArrayList<Resource.Titles.Title>();
            }
            return this.title;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://datacite.org/schema/kernel-4&gt;nonemptycontentStringType"&gt;
         *       &lt;attribute name="titleType" type="{http://datacite.org/schema/kernel-4}titleType" /&gt;
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Title {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "titleType")
            protected TitleType titleType;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

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
             * Recupera il valore della proprietà titleType.
             * 
             * @return
             *     possible object is
             *     {@link TitleType }
             *     
             */
            public TitleType getTitleType() {
                return titleType;
            }

            /**
             * Imposta il valore della proprietà titleType.
             * 
             * @param value
             *     allowed object is
             *     {@link TitleType }
             *     
             */
            public void setTitleType(TitleType value) {
                this.titleType = value;
            }

            /**
             * Recupera il valore della proprietà lang.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Imposta il valore della proprietà lang.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }

}
