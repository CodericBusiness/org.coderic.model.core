//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.04.07 a las 03:21:09 AM COT 
//


package org.coderic.model.common.xmldsig;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para RevocationValuesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RevocationValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRLValues" type="{http://uri.etsi.org/01903/v1.3.2#}CRLValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OCSPValues" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherValues" type="{http://uri.etsi.org/01903/v1.3.2#}OtherCertStatusValuesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationValuesType", propOrder = {
    "crlValues",
    "ocspValues",
    "otherValues"
})
public class RevocationValuesType {

    @XmlElement(name = "CRLValues")
    protected CRLValuesType crlValues;
    @XmlElement(name = "OCSPValues")
    protected OCSPValuesType ocspValues;
    @XmlElement(name = "OtherValues")
    protected OtherCertStatusValuesType otherValues;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad crlValues.
     * 
     * @return
     *     possible object is
     *     {@link CRLValuesType }
     *     
     */
    public CRLValuesType getCRLValues() {
        return crlValues;
    }

    /**
     * Define el valor de la propiedad crlValues.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLValuesType }
     *     
     */
    public void setCRLValues(CRLValuesType value) {
        this.crlValues = value;
    }

    /**
     * Obtiene el valor de la propiedad ocspValues.
     * 
     * @return
     *     possible object is
     *     {@link OCSPValuesType }
     *     
     */
    public OCSPValuesType getOCSPValues() {
        return ocspValues;
    }

    /**
     * Define el valor de la propiedad ocspValues.
     * 
     * @param value
     *     allowed object is
     *     {@link OCSPValuesType }
     *     
     */
    public void setOCSPValues(OCSPValuesType value) {
        this.ocspValues = value;
    }

    /**
     * Obtiene el valor de la propiedad otherValues.
     * 
     * @return
     *     possible object is
     *     {@link OtherCertStatusValuesType }
     *     
     */
    public OtherCertStatusValuesType getOtherValues() {
        return otherValues;
    }

    /**
     * Define el valor de la propiedad otherValues.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCertStatusValuesType }
     *     
     */
    public void setOtherValues(OtherCertStatusValuesType value) {
        this.otherValues = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
