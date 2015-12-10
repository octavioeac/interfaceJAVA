package www.frida.com.in.dep;

import www.frida.com.consulta.Errores;

public class objectFactoryDependecy {

	private IssueMessage issue;
	
	
	
	public objectFactoryDependecy(IssueMessage error) {
	this.issue=error;
	}

	
	
	public Errores getErrorObj(){
		
	return	issue.getErrores();
	}
	
	
 
		
	
}
