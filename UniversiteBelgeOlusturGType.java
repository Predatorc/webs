
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for universiteBelgeOlusturGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="universiteBelgeOlusturGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="ogrenciNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="belgeTur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="donem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "universiteBelgeOlusturGType", propOrder = {
    "ogrenciNo",
    "programKodu",
    "belgeTur",
    "donem",
    "dilKey"
})
public class UniversiteBelgeOlusturGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String ogrenciNo;
    @XmlElement(required = true)
    protected String programKodu;
    @XmlElement(required = true)
    protected String belgeTur;
    @XmlElementRef(name = "donem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> donem;
    @XmlElement(required = true)
    protected String dilKey;

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

    /**
     * Gets the value of the belgeTur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeTur() {
        return belgeTur;
    }

    /**
     * Sets the value of the belgeTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeTur(String value) {
        this.belgeTur = value;
    }

    /**
     * Gets the value of the donem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDonem() {
        return donem;
    }

    /**
     * Sets the value of the donem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDonem(JAXBElement<String> value) {
        this.donem = value;
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
