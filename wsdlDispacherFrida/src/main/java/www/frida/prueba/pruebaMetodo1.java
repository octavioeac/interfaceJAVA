package www.frida.prueba;

import java.util.ArrayList;
import java.util.List;

import www.frida.com.consulta.Centrales;
import www.frida.com.consulta.Errores;
import www.frida.com.consulta.ObjectSc;
import www.frida.com.consulta.ObjetoSaidRequest;
import www.frida.com.consulta.ObjetoSaidResponse;
import www.frida.com.consulta.Regiones;
import www.frida.com.consulta.SolicitudPCAI;

public class pruebaMetodo1 {

	
	public ObjectSc getObje(ObjetoSaidRequest request){
		

		
		ObjetoSaidResponse reponse=new ObjetoSaidResponse();
		
		System.out.println("HOLA METODO JULIO");
		ObjetoSaidRequest nuevoObjeto=request;
		SolicitudPCAI obj=nuevoObjeto.getPcai();
		
		System.out.println(obj.getClaveOperador());;
		System.out.println(obj.getFolioSC());
		System.out.println(obj.getTipoConcentracion());
		System.out.println(obj.getTipoContrato());
		 

		List<String> listilla=new ArrayList<String>();
		
		listilla=obj.getSiglaCentral();
		System.out.println(listilla.size());
		for(String lo:listilla ){
			System.out.println(lo);
			
		}    
		 
		
		Errores erro=new Errores();
		erro.setCodigoError("8989898");
		erro.setDescripError("ERROR EN EL TAG<>");
		
		Centrales cent=new Centrales();
		cent.setNcaiCentral("prueba1");
		cent.setNcaiId("pureba 1");
		cent.setNcaiSiglas("NANA");
		
		Centrales cent2=new Centrales();
		cent2.setNcaiCentral("prueba2");
		cent2.setNcaiId("pureba 2");
		cent2.setNcaiSiglas("NANA2");
		
		
		Centrales cent3=new Centrales();
		cent3.setNcaiCentral("prueba3");
		cent3.setNcaiId("pureba 3");
		cent3.setNcaiSiglas("NANAKKAL");
		
		
		List<Centrales> j1=new ArrayList<Centrales>();
		j1.add(cent);
		j1.add(cent2);
		j1.add(cent3);
		Regiones ok=new Regiones();
		ok.setCentral(j1);
		
		
		Regiones ok2=new Regiones();
		ok2.setCentral(j1);
		ok2.setIdRegion("objetoRegionPrueba");
		List<Regiones> k=new ArrayList<Regiones>();
		k.add(ok);
		k.add(ok2);
		
		ObjectSc p=new ObjectSc();
		
		p.setRegion(k);
		p.setClaveOperador(obj.getClaveOperador());
		p.setFolioSC(obj.getFolioSC());
		p.setTipoConcentracion(obj.getTipoConcentracion());
		return p;
		
	}
	
}
