//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0.1 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.06 alle 03:53:07 PM UTC 
//


package org.datacite.schema.kernel_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per box complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="box"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="westBoundLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/&gt;
 *         &lt;element name="eastBoundLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/&gt;
 *         &lt;element name="southBoundLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/&gt;
 *         &lt;element name="northBoundLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "box", propOrder = {

})
public class Box {

    protected float westBoundLongitude;
    protected float eastBoundLongitude;
    protected float southBoundLatitude;
    protected float northBoundLatitude;

    /**
     * Recupera il valore della proprietà westBoundLongitude.
     * 
     */
    public float getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Imposta il valore della proprietà westBoundLongitude.
     * 
     */
    public void setWestBoundLongitude(float value) {
        this.westBoundLongitude = value;
    }

    /**
     * Recupera il valore della proprietà eastBoundLongitude.
     * 
     */
    public float getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Imposta il valore della proprietà eastBoundLongitude.
     * 
     */
    public void setEastBoundLongitude(float value) {
        this.eastBoundLongitude = value;
    }

    /**
     * Recupera il valore della proprietà southBoundLatitude.
     * 
     */
    public float getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Imposta il valore della proprietà southBoundLatitude.
     * 
     */
    public void setSouthBoundLatitude(float value) {
        this.southBoundLatitude = value;
    }

    /**
     * Recupera il valore della proprietà northBoundLatitude.
     * 
     */
    public float getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Imposta il valore della proprietà northBoundLatitude.
     * 
     */
    public void setNorthBoundLatitude(float value) {
        this.northBoundLatitude = value;
    }

}
