
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alinanDersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alinanDersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dersKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dersAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="krediAkts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basariNotu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="akademikPersonel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="harfNotu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dersSinavSonucListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfDersSinavSonucListesi"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alinanDersType", propOrder = {
    "dersKodu",
    "dersAdi",
    "krediAkts",
    "basariNotu",
    "akademikPersonel",
    "harfNotu",
    "dersSinavSonucListesi"
})
public class AlinanDersType {

    @XmlElement(required = true)
    protected String dersKodu;
    @XmlElement(required = true)
    protected String dersAdi;
    @XmlElement(required = true)
    protected String krediAkts;
    @XmlElement(required = true)
    protected String basariNotu;
    @XmlElement(required = true)
    protected String akademikPersonel;
    @XmlElement(required = true)
    protected String harfNotu;
    @XmlElement(required = true)
    protected ArrayOfDersSinavSonucListesi dersSinavSonucListesi;

    /**
     * Gets the value of the dersKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDersKodu() {
        return dersKodu;
    }

    /**
     * Sets the value of the dersKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDersKodu(String value) {
        this.dersKodu = value;
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
     * Gets the value of the krediAkts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrediAkts() {
        return krediAkts;
    }

    /**
     * Sets the value of the krediAkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrediAkts(String value) {
        this.krediAkts = value;
    }

    /**
     * Gets the value of the basariNotu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasariNotu() {
        return basariNotu;
    }

    /**
     * Sets the value of the basariNotu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasariNotu(String value) {
        this.basariNotu = value;
    }

    /**
     * Gets the value of the akademikPersonel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkademikPersonel() {
        return akademikPersonel;
    }

    /**
     * Sets the value of the akademikPersonel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkademikPersonel(String value) {
        this.akademikPersonel = value;
    }

    /**
     * Gets the value of the harfNotu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarfNotu() {
        return harfNotu;
    }

    /**
     * Sets the value of the harfNotu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarfNotu(String value) {
        this.harfNotu = value;
    }

    /**
     * Gets the value of the dersSinavSonucListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDersSinavSonucListesi }
     *     
     */
    public ArrayOfDersSinavSonucListesi getDersSinavSonucListesi() {
        return dersSinavSonucListesi;
    }

    /**
     * Sets the value of the dersSinavSonucListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDersSinavSonucListesi }
     *     
     */
    public void setDersSinavSonucListesi(ArrayOfDersSinavSonucListesi value) {
        this.dersSinavSonucListesi = value;
    }

}
