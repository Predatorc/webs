
/**
 * SertifikaDogrulamaSorguServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package tr.gov.turkiye.standart.universite.v3.new2;

    /**
     *  SertifikaDogrulamaSorguServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SertifikaDogrulamaSorguServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SertifikaDogrulamaSorguServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SertifikaDogrulamaSorguServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sertifikaIndir method
            * override this method for handling normal response from sertifikaIndir operation
            */
           public void receiveResultsertifikaIndir(
                    tr.gov.turkiye.standart.universite.v3.new2.SertifikaDogrulamaSorguServiceStub.SertifikaIndirResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sertifikaIndir operation
           */
            public void receiveErrorsertifikaIndir(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for main method
            * override this method for handling normal response from main operation
            */
           public void receiveResultmain(
                    tr.gov.turkiye.standart.universite.v3.new2.SertifikaDogrulamaSorguServiceStub.MainResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from main operation
           */
            public void receiveErrormain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sertifikaDogrula method
            * override this method for handling normal response from sertifikaDogrula operation
            */
           public void receiveResultsertifikaDogrula(
                    tr.gov.turkiye.standart.universite.v3.new2.SertifikaDogrulamaSorguServiceStub.SertifikaDogrulaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sertifikaDogrula operation
           */
            public void receiveErrorsertifikaDogrula(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sertifikaSorgula method
            * override this method for handling normal response from sertifikaSorgula operation
            */
           public void receiveResultsertifikaSorgula(
                    tr.gov.turkiye.standart.universite.v3.new2.SertifikaDogrulamaSorguServiceStub.SertifikaSorgulaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sertifikaSorgula operation
           */
            public void receiveErrorsertifikaSorgula(java.lang.Exception e) {
            }
                


    }
    