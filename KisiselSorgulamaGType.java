
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kisiselSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kisiselSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}sorguParametreType">
 *       &lt;sequence>
 *         &lt;element name="tcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kisiselSorgulamaGType", propOrder = {
    "tcKimlikNo"
})
@XmlSeeAlso({
    OgrencilikBilgisiSorgulamaGType.class,
    SertifikaBelgeIndirGType.class,
    DevamTakipBilgisiSorgulamaGType.class,
    UniversiteBelgeOlusturGType.class,
    DonemNotOrtalamasiGType.class,
    DonemSorgulaGType.class,
    KayitliBelgeSorgulaGType.class,
    SinavSonucuGType.class,
    DanismanBilgisiSorgulamaGType.class
})
public class KisiselSorgulamaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String tcKimlikNo;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikNo(String value) {
        this.tcKimlikNo = value;
    }

}
