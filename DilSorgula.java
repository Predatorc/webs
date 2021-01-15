
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dilSorgula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dilSorgula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dilKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dilValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dilSorgula", propOrder = {
    "dilKey",
    "dilValue"
})
public class DilSorgula {

    @XmlElement(required = true)
    protected String dilKey;
    @XmlElement(required = true)
    protected String dilValue;

    /**
     * Gets the value of the dilKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDilKey() {
        return dilKey;
    }

    /**
     * Sets the value of the dilKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDilKey(String value) {
        this.dilKey = value;
    }

    /**
     * Gets the value of the dilValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDilValue() {
        return dilValue;
    }

    /**
     * Sets the value of the dilValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDilValue(String value) {
        this.dilValue = value;
    }

}
