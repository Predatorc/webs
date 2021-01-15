
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for donemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="donemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="donemAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ogretimYili" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="donemNotOrtalamasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genelNotOrtalamasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alinanDersListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfAlinanDersListesi"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "donemType", propOrder = {
    "donemAdi",
    "ogretimYili",
    "donemNotOrtalamasi",
    "genelNotOrtalamasi",
    "alinanDersListesi"
})
public class DonemType {

    @XmlElement(required = true)
    protected String donemAdi;
    @XmlElement(required = true)
    protected String ogretimYili;
    @XmlElement(required = true)
    protected String donemNotOrtalamasi;
    @XmlElement(required = true)
    protected String genelNotOrtalamasi;
    @XmlElement(required = true)
    protected ArrayOfAlinanDersListesi alinanDersListesi;

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
     * Gets the value of the ogretimYili property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgretimYili() {
        return ogretimYili;
    }

    /**
     * Sets the value of the ogretimYili property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgretimYili(String value) {
        this.ogretimYili = value;
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

    /**
     * Gets the value of the alinanDersListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlinanDersListesi }
     *     
     */
    public ArrayOfAlinanDersListesi getAlinanDersListesi() {
        return alinanDersListesi;
    }

    /**
     * Sets the value of the alinanDersListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlinanDersListesi }
     *     
     */
    public void setAlinanDersListesi(ArrayOfAlinanDersListesi value) {
        this.alinanDersListesi = value;
    }

}
