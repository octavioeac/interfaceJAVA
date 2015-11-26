package www.frida.com.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import www.frida.com.consulta.Centrales;
import www.frida.com.consulta.Errores;
import www.frida.com.consulta.ObjectSc;
import www.frida.com.consulta.ObjetoSaidRequest;
import www.frida.com.consulta.ObjetoSaidResponse;
import www.frida.com.consulta.Regiones;
import www.frida.com.consulta.SolicitudPCAI;
import www.frida.com.consulta.Colonia.ObjetoSaidColoniaRequest;
import www.frida.com.consulta.Colonia.ObjetoSaidColoniaResponse;
import www.frida.com.consultaTelefono.ConsulTelRequest;
import www.frida.com.consultaTelefono.ConsulTelResponse;
import www.frida.com.consultaTelefono.ObjetoSaidTelefonoRequest;
import www.frida.com.consultaTelefono.ObjetoSaidTelefonoResponse;
import www.frida.modelo.Snippet;
import www.frida.prueba.pruebaContratacionConsulta;
import www.frida.prueba.pruebaInsert;


@Endpoint
public class endpoitSaidService {
	
	@PayloadRoot(localPart = "objetoSaidRequest", namespace="http://www.frida.com/Said")
	@ResponsePayload
	public ObjetoSaidResponse getConsultaSaid(@RequestPayload  ObjetoSaidRequest request){
		
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
		ok.setIdRegion("objetoRegionPrueba");
		ok.setPc1Central("pc1CentralPrueba");
		ok.setPc1Siglas("pc1SiglasPrueba");
		ok.setPc2Central("pc2CentralPrueba");
		ok.setPc2Siglas("pc2SiglasPrueba");
		
		
		Regiones ok2=new Regiones();
		ok2.setCentral(j1);
		ok2.setIdRegion("objetoRegionPrueba");
		ok2.setPc1Central("pc1CentralPrueba");
		ok2.setPc1Siglas("pc1SiglasPrueba");
		ok2.setPc2Central("pc2CentralPrueba");
		ok2.setPc2Siglas("pc2SiglasPrueba");
		
		List<Regiones> k=new ArrayList<Regiones>();
		k.add(ok);
		k.add(ok2);
		
		ObjectSc p=new ObjectSc();
		
		p.setRegion(k);
		p.setClaveOperador(obj.getClaveOperador());
		p.setFolioSC(obj.getFolioSC());
		p.setTipoConcentracion(obj.getTipoConcentracion());
		
		
		reponse.setObjSc(p);
		
		
		pruebaInsert popop=new pruebaInsert();
		popop.inserta(obj.getTipoConcentracion(), obj.getTipoContrato(), obj.getFolioSC(), obj.getClaveOperador());

		Snippet julio=new Snippet();
		julio.pruebaStore();
		
		System.out.println("Hola Hibernate");
		
		return reponse;
		
		
		
	}
	
	/*
	@PayloadRoot(localPart = "objetoSaidTelefonoRequest", namespace="http://www.frida.com/Said")
	@ResponsePayload
	public ObjetoSaidTelefonoResponse getConsultaTelefono(@RequestPayload  ObjetoSaidTelefonoRequest request){
		

		ObjetoSaidTelefonoResponse reponse=new ObjetoSaidTelefonoResponse();
		
		System.out.println("HOLA METODO JULIO 2");


		ObjetoSaidTelefonoRequest nuevoObjeto=request;
		ConsulTelRequest obj=nuevoObjeto.getTelefonoRequest();
		
		System.out.println(obj.getClaveOperador());;
		System.out.println(obj.getFolioSC());
		System.out.println(obj.getTipoConcentracion());
		System.out.println(obj.getTipoContrato());
		 

		List<String> listilla=new ArrayList<String>();
		
		    
		 
		
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
		ok.setIdRegion("objetoRegionPrueba");
		ok.setPc1Central("pc1CentralPrueba");
		ok.setPc1Siglas("pc1SiglasPrueba");
		ok.setPc2Central("pc2CentralPrueba");
		ok.setPc2Siglas("pc2SiglasPrueba");
		
		
		Regiones ok2=new Regiones();
		ok2.setCentral(j1);
		ok2.setIdRegion("objetoRegionPrueba");
		ok2.setPc1Central("pc1CentralPrueba");
		ok2.setPc1Siglas("pc1SiglasPrueba");
		ok2.setPc2Central("pc2CentralPrueba");
		ok2.setPc2Siglas("pc2SiglasPrueba");
		
		List<Regiones> k=new ArrayList<Regiones>();
		k.add(ok);
		k.add(ok2);
		
		ConsulTelResponse p=new ConsulTelResponse();
		
		p.setRegion(k);
		p.setClaveOperador(obj.getClaveOperador());
		p.setFolioSC(obj.getFolioSC());
		p.setTipoConcentracion(obj.getTipoConcentracion());
		
		
		reponse.setTelefonoResponse(p);
		return reponse;
		

	}
	*/

	
	@PayloadRoot(localPart = "objetoSaidColoniaRequest", namespace="http://www.frida.com/Said")
	@ResponsePayload
	public ObjetoSaidColoniaResponse getConsultaContratacion(@RequestPayload  ObjetoSaidColoniaRequest request){
		
		pruebaContratacionConsulta k=new pruebaContratacionConsulta();
		
		ObjetoSaidColoniaResponse reponse=new ObjetoSaidColoniaResponse();
		reponse.setConsulContratacion(k.getConsulta());
		return reponse;
		

	}

	
}
