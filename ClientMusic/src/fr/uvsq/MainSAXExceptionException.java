
/**
 * MainSAXExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

package fr.uvsq;

public class MainSAXExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1487092469923L;
    
    private fr.uvsq.MainStub.MainSAXException faultMessage;

    
        public MainSAXExceptionException() {
            super("MainSAXExceptionException");
        }

        public MainSAXExceptionException(java.lang.String s) {
           super(s);
        }

        public MainSAXExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MainSAXExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.uvsq.MainStub.MainSAXException msg){
       faultMessage = msg;
    }
    
    public fr.uvsq.MainStub.MainSAXException getFaultMessage(){
       return faultMessage;
    }
}
    