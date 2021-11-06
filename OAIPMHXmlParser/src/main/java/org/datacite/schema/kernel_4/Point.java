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
 * <p>Classe Java per point complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="pointLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/&gt;
 *         &lt;element name="pointLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "point", propOrder = {

})
public class Point {

    protected float pointLongitude;
    protected float pointLatitude;

    /**
     * Recupera il valore della proprietà pointLongitude.
     * 
     */
    public float getPointLongitude() {
        return pointLongitude;
    }

    /**
     * Imposta il valore della proprietà pointLongitude.
     * 
     */
    public void setPointLongitude(float value) {
        this.pointLongitude = value;
    }

    /**
     * Recupera il valore della proprietà pointLatitude.
     * 
     */
    public float getPointLatitude() {
        return pointLatitude;
    }

    /**
     * Imposta il valore della proprietà pointLatitude.
     * 
     */
    public void setPointLatitude(float value) {
        this.pointLatitude = value;
    }

}
