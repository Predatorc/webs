
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfdevamTakipDersBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfdevamTakipDersBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devamTakipDers" type="{http://standart.turkiye.gov.tr/universite/v3}devamTakipDersListesiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfdevamTakipDersBilgisi", propOrder = {
    "devamTakipDers"
})
public class ArrayOfdevamTakipDersBilgisi {

    protected List<DevamTakipDersListesiType> devamTakipDers;

    /**
     * Gets the value of the devamTakipDers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devamTakipDers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevamTakipDers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevamTakipDersListesiType }
     * 
     * 
     */
    public List<DevamTakipDersListesiType> getDevamTakipDers() {
        if (devamTakipDers == null) {
            devamTakipDers = new ArrayList<DevamTakipDersListesiType>();
        }
        return this.devamTakipDers;
    }

}
