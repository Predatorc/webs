
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for donemSorgulaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="donemSorgulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="donemTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="donemAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ogrencilikDurumu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "donemSorgulaType", propOrder = {
    "donemTarihi",
    "donemAdi",
    "program",
    "programKodu",
    "ogrencilikDurumu"
})
public class DonemSorgulaType {

    @XmlElement(required = true)
    protected String donemTarihi;
    @XmlElement(required = true)
    protected String donemAdi;
    @XmlElement(required = true)
    protected String program;
    @XmlElement(required = true)
    protected String programKodu;
    @XmlElementRef(name = "ogrencilikDurumu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ogrencilikDurumu;

    /**
     * Gets the value of the donemTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonemTarihi() {
        return donemTarihi;
    }

    /**
     * Sets the value of the donemTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonemTarihi(String value) {
        this.donemTarihi = value;
    }

    /**
     * Gets the value of the donemAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonemAdi() {
        return donemAdi;
    }

    /**
     * Sets the value of the donemAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonemAdi(String value) {
        this.donemAdi = value;
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
     * Gets the value of the ogrencilikDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOgrencilikDurumu() {
        return ogrencilikDurumu;
    }

    /**
     * Sets the value of the ogrencilikDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOgrencilikDurumu(JAXBElement<String> value) {
        this.ogrencilikDurumu = value;
    }

}
