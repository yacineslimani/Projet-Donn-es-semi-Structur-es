
/**
 * MainTransformerExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

package fr.uvsq;

public class MainTransformerExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1487092469734L;
    
    private fr.uvsq.MainStub.MainTransformerException faultMessage;

    
        public MainTransformerExceptionException() {
            super("MainTransformerExceptionException");
        }

        public MainTransformerExceptionException(java.lang.String s) {
           super(s);
        }

        public MainTransformerExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MainTransformerExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.uvsq.MainStub.MainTransformerException msg){
       faultMessage = msg;
    }
    
    public fr.uvsq.MainStub.MainTransformerException getFaultMessage(){
       return faultMessage;
    }
}
    