
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfOgrencilikBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfOgrencilikBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogrencilikBilgisi" type="{http://standart.turkiye.gov.tr/universite/v3}ogrencilikBilgisiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfOgrencilikBilgisiType", propOrder = {
    "ogrencilikBilgisi"
})
public class ArrayOfOgrencilikBilgisiType {

    protected List<OgrencilikBilgisiType> ogrencilikBilgisi;

    /**
     * Gets the value of the ogrencilikBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ogrencilikBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOgrencilikBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OgrencilikBilgisiType }
     * 
     * 
     */
    public List<OgrencilikBilgisiType> getOgrencilikBilgisi() {
        if (ogrencilikBilgisi == null) {
            ogrencilikBilgisi = new ArrayList<OgrencilikBilgisiType>();
        }
        return this.ogrencilikBilgisi;
    }

}
