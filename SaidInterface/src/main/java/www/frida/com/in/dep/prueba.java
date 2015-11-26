package www.frida.com.in.dep;

import www.frida.com.consulta.Errores;
import www.frida.com.consulta.SolicitudPCAI;
import www.frida.com.consultaTelefono.ConsulTelRequest;

public class prueba {

	public prueba() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		SolicitudPCAI objeto=new SolicitudPCAI();
		objeto.setMovimiento("CONSULTAS");
		objeto.setTipoConcentracion("LOCAL");
		objeto.setTipoContrato("COLONIA");
		ConsulTelRequest gs=new ConsulTelRequest();	
		
		
	objectFactoryDependecy k=new objectFactoryDependecy(new IssueMensageConsultaImple(objeto));
	
	objectFactoryDependecy k2=new objectFactoryDependecy(new IssueMensageTeleImple(gs));
	
	
	
     Errores j=k.getErrorObj();

      if(j.getCodigoError()==""){
    	  
    	  System.out.println("EXITO");
      }
      else{
    	  System.out.println(j.getDescripError());
      }
    
      
      
      
      
	}
}
      
      


