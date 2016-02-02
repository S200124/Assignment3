package it.polito.dp2.WF.sol3;

import java.net.*;
import java.util.*;
import javax.xml.ws.*;
import javax.xml.datatype.XMLGregorianCalendar;

import it.polito.dp2.WF.lab3.gen.*;


public class Client {

	public static void main(String[] args) {

		URL url;
		try {
			url = new URL("http://localhost:8181/WorkflowInfoService?wsdl");
		} catch (MalformedURLException e) {
			url = null;
		}
		
		if(url != null)
		{
			WorkflowInfoService service = new WorkflowInfoService(url);
			WorkflowInfo proxy = service.getWorkflowInfoPort();
			
			Holder<XMLGregorianCalendar> hx = new Holder<XMLGregorianCalendar>();
			List<String> ls = new ArrayList<String>();
			Holder<List<Workflow>> hlw = new Holder<List<Workflow>>();
			Holder<List<String>> hls = new Holder<List<String>>();
			
			System.out.println("Ready to invoke remote operation 1...");
			proxy.getWorkflowNames(hx, hls);
			for(String name:hls.value)
				ls.add(name);
			
			System.out.println("Ready to invoke remote operation 2...");
			try {
				proxy.getWorkflows(ls, hx, hlw);
				for(Workflow wf:hlw.value)
					System.out.println(wf.getName());
			} catch (UnknownNames_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
