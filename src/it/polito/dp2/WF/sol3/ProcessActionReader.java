package it.polito.dp2.WF.sol3;

import it.polito.dp2.WF.lab3.gen.*;


public class ProcessActionReader extends ActionReader {

	private Workflow workflow;
	
	public ProcessActionReader(Action act, Workflow wf) {
		super(act, wf);
		workflow = wf;
	}

	public WorkflowReader getActionWorkflow() {
		return (new WorkflowReader(workflow));
	}

}
