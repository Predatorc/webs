/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.turkiye.standart.universite.v3;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding.*;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author cagri
 */
@WebService(serviceName = "SertifikaDogrulamaSorgu",targetNamespace = "http://standart.turkiye.gov.tr/universite/v3")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
//@XmlRootElement(name = "SertifikaDogrulamaSorgu");
@XmlAccessorType(XmlAccessType.FIELD)
public class SertifikaDogrulamaSorgu {
    public SertifikaDogrulamaSorgu(){}
    @WebMethod(operationName = "sertifikaSorgula")
    public SertifikaSorgulaCType sertifikaSorgula(@WebParam(name = "sorgu") SertifikaSorgulaG sorgu)
    {
        SertifikaSorgulaCType a = new SertifikaSorgulaCType();
        return a;
    }
    
    @WebMethod(operationName = "sertifikaIndir")
    public SertifikaBelgeIndirCType sertifikaIndir(@WebParam(name = "sbelge") SertifikaBelgeIndirGType sbelge)
    {
        SertifikaBelgeIndirCType a = new SertifikaBelgeIndirCType();
        return a;
    }
    
    @WebMethod(operationName = "sertifikaDogrula")
    public BarkodluBelgeDogrulaCType sertifikaDogrula(@WebParam(name = "sdogru") BarkodluBelgeDogrulaGType sdogru)
    {
        BarkodluBelgeDogrulaCType a = new BarkodluBelgeDogrulaCType();
        return a;
    }
    public static void main(String[] args) throws JAXBException {

    JAXBContext jaxbContext = JAXBContext.newInstance("tr.gov.turkiye.standart.universite.v3");
    SertifikaDogrulamaSorgu test = new SertifikaDogrulamaSorgu();
    Marshaller mar = jaxbContext.createMarshaller();
    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    mar.marshal(test, System.out);
    
    }
}
