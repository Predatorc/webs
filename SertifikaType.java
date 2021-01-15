
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sertifikaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sertifikaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sertifikaID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sertifikaNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sertifikaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alindigiYer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sertifikaGecerlilikTarih" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sertifikaDetayListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfSertifikaDetayListesi"/>
 *         &lt;element name="detayListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sertifikaType", propOrder = {
    "sertifikaID",
    "sertifikaNumarasi",
    "tur",
    "sertifikaAdi",
    "alindigiYer",
    "sertifikaGecerlilikTarih",
    "sertifikaDetayListesi",
    "detayListesi"
})
public class SertifikaType {

    @XmlElement(required = true)
    protected String sertifikaID;
    @XmlElement(required = true)
    protected String sertifikaNumarasi;
    @XmlElement(required = true)
    protected String tur;
    @XmlElement(required = true)
    protected String sertifikaAdi;
    @XmlElement(required = true)
    protected String alindigiYer;
    @XmlElement(required = true)
    protected String sertifikaGecerlilikTarih;
    @XmlElement(required = true)
    protected ArrayOfSertifikaDetayListesi sertifikaDetayListesi;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the sertifikaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertifikaID() {
        return sertifikaID;
    }

    /**
     * Sets the value of the sertifikaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertifikaID(String value) {
        this.sertifikaID = value;
    }

    /**
     * Gets the value of the sertifikaNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertifikaNumarasi() {
        return sertifikaNumarasi;
    }

    /**
     * Sets the value of the sertifikaNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertifikaNumarasi(String value) {
        this.sertifikaNumarasi = value;
    }

    /**
     * Gets the value of the tur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTur() {
        return tur;
    }

    /**
     * Sets the value of the tur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTur(String value) {
        this.tur = value;
    }

    /**
     * Gets the value of the sertifikaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertifikaAdi() {
        return sertifikaAdi;
    }

    /**
     * Sets the value of the sertifikaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertifikaAdi(String value) {
        this.sertifikaAdi = value;
    }

    /**
     * Gets the value of the alindigiYer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlindigiYer() {
        return alindigiYer;
    }

    /**
     * Sets the value of the alindigiYer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlindigiYer(String value) {
        this.alindigiYer = value;
    }

    /**
     * Gets the value of the sertifikaGecerlilikTarih property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertifikaGecerlilikTarih() {
        return sertifikaGecerlilikTarih;
    }

    /**
     * Sets the value of the sertifikaGecerlilikTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertifikaGecerlilikTarih(String value) {
        this.sertifikaGecerlilikTarih = value;
    }

    /**
     * Gets the value of the sertifikaDetayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSertifikaDetayListesi }
     *     
     */
    public ArrayOfSertifikaDetayListesi getSertifikaDetayListesi() {
        return sertifikaDetayListesi;
    }

    /**
     * Sets the value of the sertifikaDetayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSertifikaDetayListesi }
     *     
     */
    public void setSertifikaDetayListesi(ArrayOfSertifikaDetayListesi value) {
        this.sertifikaDetayListesi = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetailType> getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public void setDetayListesi(JAXBElement<ArrayOfDetailType> value) {
        this.detayListesi = value;
    }

}
