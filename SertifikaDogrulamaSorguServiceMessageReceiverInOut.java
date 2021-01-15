
/**
 * SertifikaDogrulamaSorguServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package tr.gov.turkiye.standart.universite.v3;

        /**
        *  SertifikaDogrulamaSorguServiceMessageReceiverInOut message receiver
        */

        public class SertifikaDogrulamaSorguServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SertifikaDogrulamaSorguServiceSkeleton skel = (SertifikaDogrulamaSorguServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("sertifikaIndir".equals(methodName)){
                
                tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse sertifikaIndirResponse17 = null;
	                        tr.gov.turkiye.standart.universite.v3.SertifikaIndir wrappedParam =
                                                             (tr.gov.turkiye.standart.universite.v3.SertifikaIndir)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.gov.turkiye.standart.universite.v3.SertifikaIndir.class);
                                                
                                               sertifikaIndirResponse17 =
                                                   
                                                   
                                                         skel.sertifikaIndir(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sertifikaIndirResponse17, false,
                                                    new javax.xml.namespace.QName("http://v3.universite.standart.turkiye.gov.tr", "sertifikaIndirResponse"));
                                    } else 

            if("main".equals(methodName)){
                
                tr.gov.turkiye.standart.universite.v3.MainResponse mainResponse19 = null;
	                        tr.gov.turkiye.standart.universite.v3.Main wrappedParam =
                                                             (tr.gov.turkiye.standart.universite.v3.Main)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.gov.turkiye.standart.universite.v3.Main.class);
                                                
                                               mainResponse19 =
                                                   
                                                   
                                                         skel.main(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), mainResponse19, false,
                                                    new javax.xml.namespace.QName("http://v3.universite.standart.turkiye.gov.tr", "mainResponse"));
                                    } else 

            if("sertifikaDogrula".equals(methodName)){
                
                tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse sertifikaDogrulaResponse21 = null;
	                        tr.gov.turkiye.standart.universite.v3.SertifikaDogrula wrappedParam =
                                                             (tr.gov.turkiye.standart.universite.v3.SertifikaDogrula)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.gov.turkiye.standart.universite.v3.SertifikaDogrula.class);
                                                
                                               sertifikaDogrulaResponse21 =
                                                   
                                                   
                                                         skel.sertifikaDogrula(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sertifikaDogrulaResponse21, false,
                                                    new javax.xml.namespace.QName("http://v3.universite.standart.turkiye.gov.tr", "sertifikaDogrulaResponse"));
                                    } else 

            if("sertifikaSorgula".equals(methodName)){
                
                tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse sertifikaSorgulaResponse23 = null;
	                        tr.gov.turkiye.standart.universite.v3.SertifikaSorgula wrappedParam =
                                                             (tr.gov.turkiye.standart.universite.v3.SertifikaSorgula)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.gov.turkiye.standart.universite.v3.SertifikaSorgula.class);
                                                
                                               sertifikaSorgulaResponse23 =
                                                   
                                                   
                                                         skel.sertifikaSorgula(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sertifikaSorgulaResponse23, false,
                                                    new javax.xml.namespace.QName("http://v3.universite.standart.turkiye.gov.tr", "sertifikaSorgulaResponse"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.SertifikaIndir param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaIndir.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.Main param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.Main.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.MainResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.MainResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.SertifikaDogrula param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaDogrula.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.SertifikaSorgula param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaSorgula.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse wrapsertifikaIndir(){
                                tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse wrappedElement = new tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.gov.turkiye.standart.universite.v3.MainResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.gov.turkiye.standart.universite.v3.MainResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.gov.turkiye.standart.universite.v3.MainResponse wrapmain(){
                                tr.gov.turkiye.standart.universite.v3.MainResponse wrappedElement = new tr.gov.turkiye.standart.universite.v3.MainResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse wrapsertifikaDogrula(){
                                tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse wrappedElement = new tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse wrapsertifikaSorgula(){
                                tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse wrappedElement = new tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (tr.gov.turkiye.standart.universite.v3.Main.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.Main.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.MainResponse.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.MainResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.SertifikaDogrula.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.SertifikaDogrula.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.SertifikaDogrulaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.SertifikaIndir.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.SertifikaIndir.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.SertifikaIndirResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.SertifikaSorgula.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.SertifikaSorgula.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse.class.equals(type)){
                
                        return tr.gov.turkiye.standart.universite.v3.SertifikaSorgulaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    