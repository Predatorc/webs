
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dilSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dilSorgulaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="dilListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfDilType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dilSorgulaCType", propOrder = {
    "dilListesi"
})
public class DilSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfDilType dilListesi;

    /**
     * Gets the value of the dilListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDilType }
     *     
     */
    public ArrayOfDilType getDilListesi() {
        return dilListesi;
    }

    /**
     * Sets the value of the dilListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDilType }
     *     
     */
    public void setDilListesi(ArrayOfDilType value) {
        this.dilListesi = value;
    }

}
