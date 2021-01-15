
package tr.gov.turkiye.standart.universite.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfSertifikaListesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfSertifikaListesi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sertifika" type="{http://standart.turkiye.gov.tr/universite/v3}sertifikaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSertifikaListesi", propOrder = {
    "sertifika"
})
public class ArrayOfSertifikaListesi {

    protected List<SertifikaType> sertifika;

    /**
     * Gets the value of the sertifika property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sertifika property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSertifika().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SertifikaType }
     * 
     * 
     */
    public List<SertifikaType> getSertifika() {
        if (sertifika == null) {
            sertifika = new ArrayList<SertifikaType>();
        }
        return this.sertifika;
    }

}
