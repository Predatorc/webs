
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfDersSinavSonucListesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfDersSinavSonucListesi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dersSinavSonucu" type="{http://standart.turkiye.gov.tr/universite/v3}dersSinavSonucType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfDersSinavSonucListesi", propOrder = {
    "dersSinavSonucu"
})
public class ArrayOfDersSinavSonucListesi {

    protected List<DersSinavSonucType> dersSinavSonucu;

    /**
     * Gets the value of the dersSinavSonucu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dersSinavSonucu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDersSinavSonucu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DersSinavSonucType }
     * 
     * 
     */
    public List<DersSinavSonucType> getDersSinavSonucu() {
        if (dersSinavSonucu == null) {
            dersSinavSonucu = new ArrayList<DersSinavSonucType>();
        }
        return this.dersSinavSonucu;
    }

}
