package www.frida.com.in.dep;

import www.frida.com.consulta.Errores;
import www.frida.com.consultaTelefono.ConsulTelRequest;
import www.frida.com.consultaTelefono.ConsulTelResponse;

public class IssueMensageTeleImple implements IssueMessage {

	private ConsulTelRequest obj;
	private Errores ok;
	

	public IssueMensageTeleImple(ConsulTelRequest obj) {
		super();
		this.obj = obj;
	}


	@Override
	public Errores getErrores() {
		// TODO Auto-generated method stub
		return null;
	}

}
