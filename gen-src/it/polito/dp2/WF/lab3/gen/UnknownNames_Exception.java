
package it.polito.dp2.WF.lab3.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownNames", targetNamespace = "http://pad.polito.it/WorkflowInfo")
public class UnknownNames_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownNames faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnknownNames_Exception(String message, UnknownNames faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnknownNames_Exception(String message, UnknownNames faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.WF.lab3.gen.UnknownNames
     */
    public UnknownNames getFaultInfo() {
        return faultInfo;
    }

}
