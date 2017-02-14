
/**
 * MainIOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

package fr.uvsq;

public class MainIOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1487092470006L;
    
    private fr.uvsq.MainStub.MainIOException faultMessage;

    
        public MainIOExceptionException() {
            super("MainIOExceptionException");
        }

        public MainIOExceptionException(java.lang.String s) {
           super(s);
        }

        public MainIOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MainIOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.uvsq.MainStub.MainIOException msg){
       faultMessage = msg;
    }
    
    public fr.uvsq.MainStub.MainIOException getFaultMessage(){
       return faultMessage;
    }
}
    