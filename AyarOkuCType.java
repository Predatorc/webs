
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ayarOkuCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ayarOkuCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="deger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ayarOkuCType", propOrder = {
    "deger"
})
public class AyarOkuCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected String deger;

    /**
     * Gets the value of the deger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeger() {
        return deger;
    }

    /**
     * Sets the value of the deger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeger(String value) {
        this.deger = value;
    }

}
