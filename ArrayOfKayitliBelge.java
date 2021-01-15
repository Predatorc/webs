
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfKayitliBelge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfKayitliBelge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kayitliBelge" type="{http://standart.turkiye.gov.tr/universite/v3}kayitliBelgeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfKayitliBelge", propOrder = {
    "kayitliBelge"
})
public class ArrayOfKayitliBelge {

    protected List<KayitliBelgeType> kayitliBelge;

    /**
     * Gets the value of the kayitliBelge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kayitliBelge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKayitliBelge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KayitliBelgeType }
     * 
     * 
     */
    public List<KayitliBelgeType> getKayitliBelge() {
        if (kayitliBelge == null) {
            kayitliBelge = new ArrayList<KayitliBelgeType>();
        }
        return this.kayitliBelge;
    }

}
