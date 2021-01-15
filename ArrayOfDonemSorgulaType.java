
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfDonemSorgulaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfDonemSorgulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="donemSorgula" type="{http://standart.turkiye.gov.tr/universite/v3}donemSorgulaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfDonemSorgulaType", propOrder = {
    "donemSorgula"
})
public class ArrayOfDonemSorgulaType {

    protected List<DonemSorgulaType> donemSorgula;

    /**
     * Gets the value of the donemSorgula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the donemSorgula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDonemSorgula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DonemSorgulaType }
     * 
     * 
     */
    public List<DonemSorgulaType> getDonemSorgula() {
        if (donemSorgula == null) {
            donemSorgula = new ArrayList<DonemSorgulaType>();
        }
        return this.donemSorgula;
    }

}
