
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfDilType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfDilType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dil" type="{http://standart.turkiye.gov.tr/universite/v3}dilSorgula" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfDilType", propOrder = {
    "dil"
})
public class ArrayOfDilType {

    protected List<DilSorgula> dil;

    /**
     * Gets the value of the dil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DilSorgula }
     * 
     * 
     */
    public List<DilSorgula> getDil() {
        if (dil == null) {
            dil = new ArrayList<DilSorgula>();
        }
        return this.dil;
    }

}
