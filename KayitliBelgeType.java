
package tr.gov.turkiye.standart.universite.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kayitliBelgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliBelgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standart.turkiye.gov.tr/universite/v3}ogrencilikBilgisiType">
 *       &lt;sequence>
 *         &lt;element name="barkodNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="olusturulmaTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliBelgeType", propOrder = {
    "barkodNo",
    "olusturulmaTarihi"
})
public class KayitliBelgeType
    extends OgrencilikBilgisiType
{

    @XmlElement(required = true)
    protected String barkodNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar olusturulmaTarihi;

    /**
     * Gets the value of the barkodNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarkodNo() {
        return barkodNo;
    }

    /**
     * Sets the value of the barkodNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarkodNo(String value) {
        this.barkodNo = value;
    }

    /**
     * Gets the value of the olusturulmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    /**
     * Sets the value of the olusturulmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOlusturulmaTarihi(XMLGregorianCalendar value) {
        this.olusturulmaTarihi = value;
    }

}
