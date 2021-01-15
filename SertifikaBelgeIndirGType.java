
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sertifikaBelgeIndirGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sertifikaBelgeIndirGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="sertifikaID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dilKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sertifikaBelgeIndirGType", propOrder = {
    "sertifikaID",
    "dilKey"
})
public class SertifikaBelgeIndirGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String sertifikaID;
    @XmlElement(required = true)
    protected String dilKey;

    /**
     * Gets the value of the sertifikaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertifikaID() {
        return sertifikaID;
    }

    /**
     * Sets the value of the sertifikaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertifikaID(String value) {
        this.sertifikaID = value;
    }

    /**
     * Gets the value of the dilKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDilKey() {
        return dilKey;
    }

    /**
     * Sets the value of the dilKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDilKey(String value) {
        this.dilKey = value;
    }

}
