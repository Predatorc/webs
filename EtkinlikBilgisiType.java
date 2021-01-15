
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for etkinlikBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etkinlikBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etkinlikBaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="etkinlikBitisTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="etkinlikTuru" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikDuzenleyen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikAdres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikBaslangicSaati" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikBitisSaati" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikTahminiSure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikMekan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikKatilimSarti" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etkinlikKoordinat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enlem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="boylam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "etkinlikBilgisiType", propOrder = {
    "etkinlikBaslangicTarihi",
    "etkinlikBitisTarihi",
    "etkinlikTuru",
    "etkinlikDuzenleyen",
    "etkinlikAdi",
    "etkinlikAdres",
    "etkinlikAciklama",
    "etkinlikBaslangicSaati",
    "etkinlikBitisSaati",
    "etkinlikTahminiSure",
    "etkinlikMekan",
    "etkinlikKatilimSarti",
    "etkinlikURL",
    "etkinlikKoordinat",
    "detayListesi"
})
public class EtkinlikBilgisiType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar etkinlikBaslangicTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar etkinlikBitisTarihi;
    @XmlElement(required = true)
    protected String etkinlikTuru;
    @XmlElement(required = true)
    protected String etkinlikDuzenleyen;
    @XmlElement(required = true)
    protected String etkinlikAdi;
    @XmlElement(required = true)
    protected String etkinlikAdres;
    @XmlElement(required = true)
    protected String etkinlikAciklama;
    @XmlElement(required = true)
    protected String etkinlikBaslangicSaati;
    @XmlElement(required = true)
    protected String etkinlikBitisSaati;
    @XmlElement(required = true)
    protected String etkinlikTahminiSure;
    @XmlElement(required = true)
    protected String etkinlikMekan;
    @XmlElement(required = true)
    protected String etkinlikKatilimSarti;
    @XmlElement(required = true)
    protected String etkinlikURL;
    @XmlElement(required = true, nillable = true)
    protected EtkinlikBilgisiType.EtkinlikKoordinat etkinlikKoordinat;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the etkinlikBaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEtkinlikBaslangicTarihi() {
        return etkinlikBaslangicTarihi;
    }

    /**
     * Sets the value of the etkinlikBaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEtkinlikBaslangicTarihi(XMLGregorianCalendar value) {
        this.etkinlikBaslangicTarihi = value;
    }

    /**
     * Gets the value of the etkinlikBitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEtkinlikBitisTarihi() {
        return etkinlikBitisTarihi;
    }

    /**
     * Sets the value of the etkinlikBitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEtkinlikBitisTarihi(XMLGregorianCalendar value) {
        this.etkinlikBitisTarihi = value;
    }

    /**
     * Gets the value of the etkinlikTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikTuru() {
        return etkinlikTuru;
    }

    /**
     * Sets the value of the etkinlikTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikTuru(String value) {
        this.etkinlikTuru = value;
    }

    /**
     * Gets the value of the etkinlikDuzenleyen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikDuzenleyen() {
        return etkinlikDuzenleyen;
    }

    /**
     * Sets the value of the etkinlikDuzenleyen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikDuzenleyen(String value) {
        this.etkinlikDuzenleyen = value;
    }

    /**
     * Gets the value of the etkinlikAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikAdi() {
        return etkinlikAdi;
    }

    /**
     * Sets the value of the etkinlikAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikAdi(String value) {
        this.etkinlikAdi = value;
    }

    /**
     * Gets the value of the etkinlikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikAdres() {
        return etkinlikAdres;
    }

    /**
     * Sets the value of the etkinlikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikAdres(String value) {
        this.etkinlikAdres = value;
    }

    /**
     * Gets the value of the etkinlikAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikAciklama() {
        return etkinlikAciklama;
    }

    /**
     * Sets the value of the etkinlikAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikAciklama(String value) {
        this.etkinlikAciklama = value;
    }

    /**
     * Gets the value of the etkinlikBaslangicSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikBaslangicSaati() {
        return etkinlikBaslangicSaati;
    }

    /**
     * Sets the value of the etkinlikBaslangicSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikBaslangicSaati(String value) {
        this.etkinlikBaslangicSaati = value;
    }

    /**
     * Gets the value of the etkinlikBitisSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikBitisSaati() {
        return etkinlikBitisSaati;
    }

    /**
     * Sets the value of the etkinlikBitisSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikBitisSaati(String value) {
        this.etkinlikBitisSaati = value;
    }

    /**
     * Gets the value of the etkinlikTahminiSure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikTahminiSure() {
        return etkinlikTahminiSure;
    }

    /**
     * Sets the value of the etkinlikTahminiSure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikTahminiSure(String value) {
        this.etkinlikTahminiSure = value;
    }

    /**
     * Gets the value of the etkinlikMekan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikMekan() {
        return etkinlikMekan;
    }

    /**
     * Sets the value of the etkinlikMekan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikMekan(String value) {
        this.etkinlikMekan = value;
    }

    /**
     * Gets the value of the etkinlikKatilimSarti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikKatilimSarti() {
        return etkinlikKatilimSarti;
    }

    /**
     * Sets the value of the etkinlikKatilimSarti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikKatilimSarti(String value) {
        this.etkinlikKatilimSarti = value;
    }

    /**
     * Gets the value of the etkinlikURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtkinlikURL() {
        return etkinlikURL;
    }

    /**
     * Sets the value of the etkinlikURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtkinlikURL(String value) {
        this.etkinlikURL = value;
    }

    /**
     * Gets the value of the etkinlikKoordinat property.
     * 
     * @return
     *     possible object is
     *     {@link EtkinlikBilgisiType.EtkinlikKoordinat }
     *     
     */
    public EtkinlikBilgisiType.EtkinlikKoordinat getEtkinlikKoordinat() {
        return etkinlikKoordinat;
    }

    /**
     * Sets the value of the etkinlikKoordinat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtkinlikBilgisiType.EtkinlikKoordinat }
     *     
     */
    public void setEtkinlikKoordinat(EtkinlikBilgisiType.EtkinlikKoordinat value) {
        this.etkinlikKoordinat = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="enlem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="boylam" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enlem",
        "boylam"
    })
    public static class EtkinlikKoordinat {

        @XmlElement(required = true)
        protected String enlem;
        @XmlElement(required = true)
        protected String boylam;

        /**
         * Gets the value of the enlem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnlem() {
            return enlem;
        }

        /**
         * Sets the value of the enlem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnlem(String value) {
            this.enlem = value;
        }

        /**
         * Gets the value of the boylam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoylam() {
            return boylam;
        }

        /**
         * Sets the value of the boylam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoylam(String value) {
            this.boylam = value;
        }

    }

}
