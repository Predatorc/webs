
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ogrencilikBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ogrencilikBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogrenciNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kayitTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ogrencilikDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ogrencilikBilgisiType", propOrder = {
    "ogrenciNo",
    "program",
    "programKodu",
    "kayitTarihi",
    "ogrencilikDurumu"
})
@XmlSeeAlso({
    KayitliBelgeType.class
})
public class OgrencilikBilgisiType {

    @XmlElement(required = true)
    protected String ogrenciNo;
    @XmlElement(required = true)
    protected String program;
    @XmlElement(required = true)
    protected String programKodu;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kayitTarihi;
    @XmlElement(required = true)
    protected String ogrencilikDurumu;

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
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
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
     * Gets the value of the kayitTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKayitTarihi() {
        return kayitTarihi;
    }

    /**
     * Sets the value of the kayitTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKayitTarihi(XMLGregorianCalendar value) {
        this.kayitTarihi = value;
    }

    /**
     * Gets the value of the ogrencilikDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrencilikDurumu() {
        return ogrencilikDurumu;
    }

    /**
     * Sets the value of the ogrencilikDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrencilikDurumu(String value) {
        this.ogrencilikDurumu = value;
    }

}
