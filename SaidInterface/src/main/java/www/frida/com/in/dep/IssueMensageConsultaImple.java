package www.frida.com.in.dep;


import www.frida.com.consulta.Errores;
import www.frida.com.consulta.SolicitudPCAI;
import www.frida.com.consultaTelefono.ConsulTelRequest;

public class IssueMensageConsultaImple implements IssueMessage {

	
	private SolicitudPCAI obj;
	private Errores ok;
	
	
	
	public IssueMensageConsultaImple(SolicitudPCAI para) {
		super();
		this.obj = para;
			
	}

	
	@Override
	public Errores getErrores() {
		Errores k=new Errores();
		
		if(obj.getTipoContrato().isEmpty()){
			k.setCodigoError("601");
			k.setDescripError("El tag <tipoContrato> esta vacio");
			ok=k;
		
		}
		else{
			if(obj.getMovimiento().isEmpty()){
				k.setCodigoError("501");
				k.setDescripError("El tag <movimiento> esta vacio");
				ok=k;
			
			}
			else{
				if(obj.getMovimiento().equals("CONSULTA")){
					if(obj.getTipoConcentracion().isEmpty()){
						k.setCodigoError("501");
						k.setDescripError("El tag <tipoConcentracion> esta vacio");
						ok=k;
					
					}
					else{
						if(obj.getTipoConcentracion().equals("LOCAL")||obj.getTipoConcentracion().equals("REGIONAL")||obj.getTipoConcentracion().equals("NACIONAL")){
							k.setCodigoError("");
							k.setDescripError("");
							ok=k;
							//////////////////////////////////////////////////////////////
							////////////////////////////////////////////////////////////
							////////////////////////
						
						}
						else{
							k.setCodigoError("101");
							k.setDescripError("El tag <tipoConcentracion> tiene un dato invalido, se permite 'LOCAL','REGIONAL','NACIONAL'");
							ok=k;
						}
						
					}
				}
				else{
					k.setCodigoError("97");
					k.setDescripError("El tag <movimiento> tiene un dato invalido, se permite 'CONSULTA'");
					ok=k;
				}
				
			}


			
			
			
			
		}
				
		
	return ok;
	}

	

}
