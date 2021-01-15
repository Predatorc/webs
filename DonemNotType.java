
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for donemNotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="donemNotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="donemTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="donemAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="donemNotOrtalamasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genelNotOrtalamasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "donemNotType", propOrder = {
    "donemTarihi",
    "donemAdi",
    "donemNotOrtalamasi",
    "genelNotOrtalamasi"
})
public class DonemNotType {

    @XmlElement(required = true)
    protected String donemTarihi;
    @XmlElement(required = true)
    protected String donemAdi;
    @XmlElement(required = true)
    protected String donemNotOrtalamasi;
    @XmlElement(required = true)
    protected String genelNotOrtalamasi;

    /**
     * Gets the value of the donemTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonemTarihi() {
        return donemTarihi;
    }

    /**
     * Sets the value of the donemTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonemTarihi(String value) {
        this.donemTarihi = value;
    }

    /**
     * Gets the value of the donemAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonemAdi() {
        return donemAdi;
    }

    /**
     * Sets the value of the donemAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonemAdi(String value) {
        this.donemAdi = value;
    }

    /**
     * Gets the value of the donemNotOrtalamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonemNotOrtalamasi() {
        return donemNotOrtalamasi;
    }

    /**
     * Sets the value of the donemNotOrtalamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonemNotOrtalamasi(String value) {
        this.donemNotOrtalamasi = value;
    }

    /**
     * Gets the value of the genelNotOrtalamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenelNotOrtalamasi() {
        return genelNotOrtalamasi;
    }

    /**
     * Sets the value of the genelNotOrtalamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenelNotOrtalamasi(String value) {
        this.genelNotOrtalamasi = value;
    }

}
