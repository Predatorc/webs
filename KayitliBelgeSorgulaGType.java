
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kayitliBelgeSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliBelgeSorgulaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="belgeTur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliBelgeSorgulaGType", propOrder = {
    "belgeTur"
})
public class KayitliBelgeSorgulaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String belgeTur;

    /**
     * Gets the value of the belgeTur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeTur() {
        return belgeTur;
    }

    /**
     * Sets the value of the belgeTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeTur(String value) {
        this.belgeTur = value;
    }

}
