
/**
 * MainSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

package fr.uvsq;

public class MainSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1487092469857L;
    
    private fr.uvsq.MainStub.MainSQLException faultMessage;

    
        public MainSQLExceptionException() {
            super("MainSQLExceptionException");
        }

        public MainSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public MainSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MainSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.uvsq.MainStub.MainSQLException msg){
       faultMessage = msg;
    }
    
    public fr.uvsq.MainStub.MainSQLException getFaultMessage(){
       return faultMessage;
    }
}
    