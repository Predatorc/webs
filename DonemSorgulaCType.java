
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for donemSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="donemSorgulaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="donemSorgulaListesi" type="{http://standart.turkiye.gov.tr/universite/v3}arrayOfDonemSorgulaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "donemSorgulaCType", propOrder = {
    "donemSorgulaListesi"
})
public class DonemSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfDonemSorgulaType donemSorgulaListesi;

    /**
     * Gets the value of the donemSorgulaListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDonemSorgulaType }
     *     
     */
    public ArrayOfDonemSorgulaType getDonemSorgulaListesi() {
        return donemSorgulaListesi;
    }

    /**
     * Sets the value of the donemSorgulaListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDonemSorgulaType }
     *     
     */
    public void setDonemSorgulaListesi(ArrayOfDonemSorgulaType value) {
        this.donemSorgulaListesi = value;
    }

}
