
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for akademikTakvimCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akademikTakvimCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="genelAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="belge" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
@XmlType(name = "akademikTakvimCType", propOrder = {
    "genelAciklama",
    "belge",
    "detayListesi"
})
public class AkademikTakvimCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected String genelAciklama;
    @XmlElement(required = true)
    protected byte[] belge;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the genelAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenelAciklama() {
        return genelAciklama;
    }

    /**
     * Sets the value of the genelAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenelAciklama(String value) {
        this.genelAciklama = value;
    }

    /**
     * Gets the value of the belge property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBelge() {
        return belge;
    }

    /**
     * Sets the value of the belge property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBelge(byte[] value) {
        this.belge = value;
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
