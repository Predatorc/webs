
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ogrencilikBilgisiSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ogrencilikBilgisiSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="hizmetTuru" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ogrencilikBilgisiSorgulamaGType", propOrder = {
    "hizmetTuru"
})
public class OgrencilikBilgisiSorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String hizmetTuru;

    /**
     * Gets the value of the hizmetTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetTuru() {
        return hizmetTuru;
    }

    /**
     * Sets the value of the hizmetTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetTuru(String value) {
        this.hizmetTuru = value;
    }

}
