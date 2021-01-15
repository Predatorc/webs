
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sorguParametreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sorguParametreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kurumKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kullaniciAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sifre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAdresi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sorguParametreType", propOrder = {
    "kurumKodu",
    "kullaniciAdi",
    "sifre",
    "ipAdresi"
})
@XmlSeeAlso({
    AyarOkuGType.class,
    DilSorgulaGType.class,
    BarkodluBelgeDogrulaGType.class,
    KisiselSorgulamaGType.class
})
public class SorguParametreType {

    @XmlElement(required = true)
    protected String kurumKodu;
    @XmlElement(required = true)
    protected String kullaniciAdi;
    @XmlElement(required = true)
    protected String sifre;
    @XmlElement(required = true)
    protected String ipAdresi;

    /**
     * Gets the value of the kurumKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumKodu() {
        return kurumKodu;
    }

    /**
     * Sets the value of the kurumKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumKodu(String value) {
        this.kurumKodu = value;
    }

    /**
     * Gets the value of the kullaniciAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * Sets the value of the kullaniciAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullaniciAdi(String value) {
        this.kullaniciAdi = value;
    }

    /**
     * Gets the value of the sifre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * Sets the value of the sifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifre(String value) {
        this.sifre = value;
    }

    /**
     * Gets the value of the ipAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAdresi() {
        return ipAdresi;
    }

    /**
     * Sets the value of the ipAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAdresi(String value) {
        this.ipAdresi = value;
    }

}
