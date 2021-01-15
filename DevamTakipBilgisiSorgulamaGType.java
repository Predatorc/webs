
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for devamTakipBilgisiSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="devamTakipBilgisiSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="ogrenciNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devamTakipBilgisiSorgulamaGType", propOrder = {
    "ogrenciNo",
    "programKodu"
})
public class DevamTakipBilgisiSorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String ogrenciNo;
    @XmlElement(required = true)
    protected String programKodu;

    /**
     * Gets the value of the ogrenciNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrenciNo() {
        return ogrenciNo;
    }

    /**
     * Sets the value of the ogrenciNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrenciNo(String value) {
        this.ogrenciNo = value;
    }

    /**
     * Gets the value of the programKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramKodu() {
        return programKodu;
    }

    /**
     * Sets the value of the programKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramKodu(String value) {
        this.programKodu = value;
    }

}
