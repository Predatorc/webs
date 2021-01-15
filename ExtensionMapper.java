
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */

        
            package tr.gov.turkiye.standart.universite.v3;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "IslemSonucType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.IslemSonucType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "BarkodluBelgeDogrulaGType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.BarkodluBelgeDogrulaGType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "ArrayOf_xsd_anyType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.ArrayOf_xsd_anyType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "SertifikaSorgulaG".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaG.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "ArrayOfSertifikaListesi".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.ArrayOfSertifikaListesi.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "KisiselSorgulamaGType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.KisiselSorgulamaGType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "SertifikaBelgeIndirCType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.SertifikaBelgeIndirCType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "SertifikaSorgulaCType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaCType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "BarkodluBelgeDogrulaCType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.BarkodluBelgeDogrulaCType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "SertifikaBelgeIndirGType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.SertifikaBelgeIndirGType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://v3.universite.standart.turkiye.gov.tr".equals(namespaceURI) &&
                  "SorguParametreType".equals(typeName)){
                   
                            return  tr.gov.turkiye.standart.universite.v3.SorguParametreType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    