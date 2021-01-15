
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KayitliBelgeSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KayitliBelgeSorgulaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="kayitliBelgeListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfKayitliBelge"/>
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
@XmlType(name = "KayitliBelgeSorgulaCType", propOrder = {
    "kayitliBelgeListesi",
    "detayListesi"
})
public class KayitliBelgeSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKayitliBelge kayitliBelgeListesi;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the kayitliBelgeListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKayitliBelge }
     *     
     */
    public ArrayOfKayitliBelge getKayitliBelgeListesi() {
        return kayitliBelgeListesi;
    }

    /**
     * Sets the value of the kayitliBelgeListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKayitliBelge }
     *     
     */
    public void setKayitliBelgeListesi(ArrayOfKayitliBelge value) {
        this.kayitliBelgeListesi = value;
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
