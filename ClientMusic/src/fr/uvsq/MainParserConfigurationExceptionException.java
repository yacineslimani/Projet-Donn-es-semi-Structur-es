
/**
 * MainParserConfigurationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

package fr.uvsq;

public class MainParserConfigurationExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1487092469792L;
    
    private fr.uvsq.MainStub.MainParserConfigurationException faultMessage;

    
        public MainParserConfigurationExceptionException() {
            super("MainParserConfigurationExceptionException");
        }

        public MainParserConfigurationExceptionException(java.lang.String s) {
           super(s);
        }

        public MainParserConfigurationExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MainParserConfigurationExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.uvsq.MainStub.MainParserConfigurationException msg){
       faultMessage = msg;
    }
    
    public fr.uvsq.MainStub.MainParserConfigurationException getFaultMessage(){
       return faultMessage;
    }
}
    