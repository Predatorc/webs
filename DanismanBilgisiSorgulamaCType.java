
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for danismanBilgisiSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="danismanBilgisiSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="danismanAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="danismanSoyadi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="danismanOfisi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="danismanTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="danismanEposta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detayListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "danismanBilgisiSorgulamaCType", propOrder = {
    "danismanAdi",
    "danismanSoyadi",
    "danismanOfisi",
    "danismanTelefon",
    "danismanEposta",
    "detayListesi"
})
public class DanismanBilgisiSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected String danismanAdi;
    @XmlElement(required = true)
    protected String danismanSoyadi;
    @XmlElement(required = true)
    protected String danismanOfisi;
    @XmlElement(required = true)
    protected String danismanTelefon;
    @XmlElement(required = true)
    protected String danismanEposta;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the danismanAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanismanAdi() {
        return danismanAdi;
    }

    /**
     * Sets the value of the danismanAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanismanAdi(String value) {
        this.danismanAdi = value;
    }

    /**
     * Gets the value of the danismanSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanismanSoyadi() {
        return danismanSoyadi;
    }

    /**
     * Sets the value of the danismanSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanismanSoyadi(String value) {
        this.danismanSoyadi = value;
    }

    /**
     * Gets the value of the danismanOfisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanismanOfisi() {
        return danismanOfisi;
    }

    /**
     * Sets the value of the danismanOfisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanismanOfisi(String value) {
        this.danismanOfisi = value;
    }

    /**
     * Gets the value of the danismanTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanismanTelefon() {
        return danismanTelefon;
    }

    /**
     * Sets the value of the danismanTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanismanTelefon(String value) {
        this.danismanTelefon = value;
    }

    /**
     * Gets the value of the danismanEposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanismanEposta() {
        return danismanEposta;
    }

    /**
     * Sets the value of the danismanEposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanismanEposta(String value) {
        this.danismanEposta = value;
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
