
/**
 * MainCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package fr.uvsq;

    /**
     *  MainCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MainCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MainCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MainCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAlbumsByAuthor method
            * override this method for handling normal response from getAlbumsByAuthor operation
            */
           public void receiveResultgetAlbumsByAuthor(
                    fr.uvsq.MainStub.GetAlbumsByAuthorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAlbumsByAuthor operation
           */
            public void receiveErrorgetAlbumsByAuthor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for main method
            * override this method for handling normal response from main operation
            */
           public void receiveResultmain(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from main operation
           */
            public void receiveErrormain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSongsByAuthor method
            * override this method for handling normal response from getSongsByAuthor operation
            */
           public void receiveResultgetSongsByAuthor(
                    fr.uvsq.MainStub.GetSongsByAuthorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSongsByAuthor operation
           */
            public void receiveErrorgetSongsByAuthor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getInfoForSongTitle method
            * override this method for handling normal response from getInfoForSongTitle operation
            */
           public void receiveResultgetInfoForSongTitle(
                    fr.uvsq.MainStub.GetInfoForSongTitleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getInfoForSongTitle operation
           */
            public void receiveErrorgetInfoForSongTitle(java.lang.Exception e) {
            }
                


    }
    