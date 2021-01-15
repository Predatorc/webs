
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ogrenciBilgisiListesiSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ogrenciBilgisiListesiSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="ogrenciBilgisiListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfOgrencilikBilgisiType"/>
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
@XmlType(name = "ogrenciBilgisiListesiSorgulamaCType", propOrder = {
    "ogrenciBilgisiListesi",
    "detayListesi"
})
public class OgrenciBilgisiListesiSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfOgrencilikBilgisiType ogrenciBilgisiListesi;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the ogrenciBilgisiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOgrencilikBilgisiType }
     *     
     */
    public ArrayOfOgrencilikBilgisiType getOgrenciBilgisiListesi() {
        return ogrenciBilgisiListesi;
    }

    /**
     * Sets the value of the ogrenciBilgisiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOgrencilikBilgisiType }
     *     
     */
    public void setOgrenciBilgisiListesi(ArrayOfOgrencilikBilgisiType value) {
        this.ogrenciBilgisiListesi = value;
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
