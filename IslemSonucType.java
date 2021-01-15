
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for islemSonucType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="islemSonucType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kurumKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sonucKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sonucAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "islemSonucType", propOrder = {
    "kurumKodu",
    "sonucKodu",
    "sonucAciklamasi"
})
@XmlSeeAlso({
    AyarOkuCType.class,
    DilSorgulaCType.class,
    SertifikaBelgeIndirCType.class,
    DevamTakipBilgisiSorgulamaCType.class,
    AkademikTakvimCType.class,
    UniversiteBelgeOlusturCType.class,
    EtkinlikBilgisiSorgulaCType.class,
    DonemSorgulaCType.class,
    BarkodluBelgeDogrulaCType.class,
    DonemNotOrtalamasiCType.class,
    OgrenciBilgisiListesiSorgulamaCType.class,
    SinavSonucuCType.class,
    DanismanBilgisiSorgulamaCType.class,
    AyarOkuListeCType.class,
    SertifikaSorgulaCType.class,
    KayitliBelgeSorgulaCType.class
})
public class IslemSonucType {

    @XmlElement(required = true)
    protected String kurumKodu;
    @XmlElement(required = true)
    protected String sonucKodu;
    @XmlElement(required = true)
    protected String sonucAciklamasi;

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
     * Gets the value of the sonucKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucKodu() {
        return sonucKodu;
    }

    /**
     * Sets the value of the sonucKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucKodu(String value) {
        this.sonucKodu = value;
    }

    /**
     * Gets the value of the sonucAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucAciklamasi() {
        return sonucAciklamasi;
    }

    /**
     * Sets the value of the sonucAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucAciklamasi(String value) {
        this.sonucAciklamasi = value;
    }

}
