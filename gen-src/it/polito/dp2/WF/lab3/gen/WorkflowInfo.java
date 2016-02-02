
package it.polito.dp2.WF.lab3.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WorkflowInfo", targetNamespace = "http://pad.polito.it/WorkflowInfo")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkflowInfo {


    /**
     * Returns the list of names of the workflows provided by the service
     * 
     * @param name
     * @param lastModTime
     */
    @WebMethod
    @RequestWrapper(localName = "getWorkflowNames", targetNamespace = "http://pad.polito.it/WorkflowInfo", className = "it.polito.dp2.WF.lab3.gen.GetWorkflowNames")
    @ResponseWrapper(localName = "getWorkflowNamesResponse", targetNamespace = "http://pad.polito.it/WorkflowInfo", className = "it.polito.dp2.WF.lab3.gen.GetWorkflowNamesResponse")
    public void getWorkflowNames(
        @WebParam(name = "lastModTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<XMLGregorianCalendar> lastModTime,
        @WebParam(name = "name", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<String>> name);

    /**
     * Returns the details of the workflows whose names are passed as argument
     * 
     * @param wfname
     * @param lastModTime
     * @param workflow
     * @throws UnknownNames_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getWorkflows", targetNamespace = "http://pad.polito.it/WorkflowInfo", className = "it.polito.dp2.WF.lab3.gen.GetWorkflows")
    @ResponseWrapper(localName = "getWorkflowsResponse", targetNamespace = "http://pad.polito.it/WorkflowInfo", className = "it.polito.dp2.WF.lab3.gen.GetWorkflowsResponse")
    public void getWorkflows(
        @WebParam(name = "wfname", targetNamespace = "")
        List<String> wfname,
        @WebParam(name = "lastModTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<XMLGregorianCalendar> lastModTime,
        @WebParam(name = "workflow", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Workflow>> workflow)
        throws UnknownNames_Exception
    ;

}
