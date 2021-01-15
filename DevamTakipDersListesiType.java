
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for devamTakipDersListesiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="devamTakipDersListesiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="donemTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="donemAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dersAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="devamTakipListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfDevamTakipListesi"/>
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
@XmlType(name = "devamTakipDersListesiType", propOrder = {
    "donemTarihi",
    "donemAdi",
    "dersAdi",
    "program",
    "devamTakipListesi",
    "detayListesi"
})
public class DevamTakipDersListesiType {

    @XmlElement(required = true)
    protected String donemTarihi;
    @XmlElement(required = true)
    protected String donemAdi;
    @XmlElement(required = true)
    protected String dersAdi;
    @XmlElement(required = true)
    protected String program;
    @XmlElement(required = true)
    protected ArrayOfDevamTakipListesi devamTakipListesi;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

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
     * Gets the value of the dersAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDersAdi() {
        return dersAdi;
    }

    /**
     * Sets the value of the dersAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDersAdi(String value) {
        this.dersAdi = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Gets the value of the devamTakipListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDevamTakipListesi }
     *     
     */
    public ArrayOfDevamTakipListesi getDevamTakipListesi() {
        return devamTakipListesi;
    }

    /**
     * Sets the value of the devamTakipListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDevamTakipListesi }
     *     
     */
    public void setDevamTakipListesi(ArrayOfDevamTakipListesi value) {
        this.devamTakipListesi = value;
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
