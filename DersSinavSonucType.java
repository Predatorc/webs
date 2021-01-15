
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dersSinavSonucType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dersSinavSonucType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sinavAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sinavSonucu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dersSinavSonucType", propOrder = {
    "sinavAdi",
    "sinavSonucu"
})
public class DersSinavSonucType {

    @XmlElement(required = true)
    protected String sinavAdi;
    @XmlElement(required = true)
    protected String sinavSonucu;

    /**
     * Gets the value of the sinavAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinavAdi() {
        return sinavAdi;
    }

    /**
     * Sets the value of the sinavAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinavAdi(String value) {
        this.sinavAdi = value;
    }

    /**
     * Gets the value of the sinavSonucu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinavSonucu() {
        return sinavSonucu;
    }

    /**
     * Sets the value of the sinavSonucu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinavSonucu(String value) {
        this.sinavSonucu = value;
    }

}
