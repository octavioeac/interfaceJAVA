package www.frida.com.endpoint;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
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
import www.frida.com.consulta.Colonia.ObjetoSaidConsultaContratacionColoniaRequest;
import www.frida.com.consulta.Colonia.ObjetoSaidConsultaContratacionColoniaResponse;
import www.frida.com.consulta.ContratacionColonia.ObjetoContratacionConsultaRequest;
import www.frida.com.consulta.ContratacionColonia.ObjetoContratacionConsultaResponse;
import www.frida.com.consulta.DAO.criterConsultaDAO;
import www.frida.com.consulta.DAO.storeProcedureConsulta;
import www.frida.com.consultaTelefono.ConsulTelRequest;
import www.frida.com.in.dep.IssueMensageConsultaImple;
import www.frida.com.in.dep.objectFactoryDependecy;
import www.frida.modelo.Snippet;
import www.frida.prueba.pruebaCOntraCOnsultCOlonia;
import www.frida.prueba.pruebaContratacionConsulta;
import www.frida.prueba.pruebaInsert;
import www.frida.prueba.pruebaMetodo1;



@Endpoint
public class endpoitSaidService {
	
	@PayloadRoot(localPart = "objetoSaidRequest", namespace="http://www.frida.com/Said")
	@ResponsePayload
	public ObjetoSaidResponse getConsultaSaid(@RequestPayload  ObjetoSaidRequest request){
		ObjetoSaidResponse reponse=new ObjetoSaidResponse();;
		
		
		SolicitudPCAI objeto=request.getPcai();
        		
		ObjectSc  respuestaObjeto=new ObjectSc();
		
		
		int i=0;
		ConsulTelRequest gs=new ConsulTelRequest();
		List<String> bandera=new ArrayList<String>();
		objectFactoryDependecy k=new objectFactoryDependecy(new IssueMensageConsultaImple(objeto));
		Hashtable<Boolean, Errores> tablita=new Hashtable<Boolean, Errores>();
		
	    Errores j=k.getErrorObj();
	    respuestaObjeto.setClaveOperador(objeto.getClaveOperador());
	    respuestaObjeto.setFolioSC(objeto.getFolioSC());
	    respuestaObjeto.setTipoConcentracion(objeto.getTipoConcentracion());
	    respuestaObjeto.setErr(j);
	    
	    reponse.setObjSc(respuestaObjeto);
	    
	    if(j.getCodigoError()==""){
	    	
	    	//Codigos del los otros tag están limpios entra a al validación de las siglas
	    objeto.setSiglaCentral(objeto.getSiglaCentral());
	    
	    //MANDA LLAMAR AL METODO QUE REGRESA UN HASHMAP
	    IssueMensageConsultaImple l=new IssueMensageConsultaImple(objeto);
	    tablita=l.analizaTotalSiglas(objeto.getSiglaCentral());
	    Iterator<Boolean> keySetIterator = tablita.keySet().iterator();
	    	    
		 while(keySetIterator.hasNext()){
	  	 Boolean key = keySetIterator.next();
	  	   
	  //  System.out.println("key: " + key + " value: " + tablita.get(key));
	    if(key==false){
	    j=tablita.get(key);
	    respuestaObjeto.setErr(j);
	    reponse.setObjSc(respuestaObjeto);
	    }
	    if(key==true){
	      bandera.add("HOLA");
	    }
	    
	    i++;
	    
	    }

	// System.out.println(j.getDescripError());

	if(bandera.size()==tablita.size()){
           		
		/*pruebaMetodo1 metodoReponse=new pruebaMetodo1();
		 reponse.setObjSc(metodoReponse.getObje(request));*/
		 System.out.println("HOLA STORE PROCEDURE");
		
		 storeProcedureConsulta storeObjec=new storeProcedureConsulta();
		 List<String> eje=objeto.getSiglaCentral();
		 for(String exebucle:eje){
			 /*System.out.println(exebucle);
			 System.out.println(objeto.getTipoConcentracion());
			 System.out.println( objeto.getTipoContrato());
			 System.out.println( objeto.getMovimiento());
			 System.out.println(objeto.getFolioSC());
			 System.out.println( objeto.getClaveOperador());*/
			 
			 storeObjec.ejecutaStoreConsulta(exebucle, 
					 objeto.getTipoConcentracion(),
					 objeto.getTipoContrato(),
					 objeto.getMovimiento(),
					 objeto.getFolioSC(),
					 objeto.getClaveOperador(),
					 objeto.getSiglaCentral().size());
			 System.out.println(exebucle);
		 }
		 criterConsultaDAO ejecuc=new criterConsultaDAO();
		 reponse.setObjSc(ejecuc.getObjectSc(objeto));
		 
	}
	 

	    
	     }
	      else{
	    	  objeto.setSiglaCentral(objeto.getSiglaCentral());
	    	  IssueMensageConsultaImple l=new IssueMensageConsultaImple(objeto);
	    	  l.regresaError(j);
	    	  respuestaObjeto.setErr(j);
	    	  reponse.setObjSc(respuestaObjeto);
	    	  System.out.println(j.getDescripError());
	           	  
	    	  
	      }
	   
	     
/*		pruebaInsert popop=new pruebaInsert();
		popop.inserta(obj.getTipoConcentracion(), obj.getTipoContrato(), obj.getFolioSC(), obj.getClaveOperador());
*/
		//Snippet julio=new Snippet();
		//julio.pruebaStore();
		
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

	
	@PayloadRoot(localPart = "objetoSaidConsultaContratacionColoniaRequest", namespace="http://www.frida.com/Said")
	@ResponsePayload
	public ObjetoSaidConsultaContratacionColoniaResponse getConsultaContratacion(@RequestPayload  ObjetoSaidConsultaContratacionColoniaRequest request){
		
		System.out.println("HOLA METODO CONSULTA");
		pruebaContratacionConsulta k=new pruebaContratacionConsulta();
		System.out.println(request.getConsulContrata().getSiglaCentral().size());
		ObjetoSaidConsultaContratacionColoniaResponse reponse=new ObjetoSaidConsultaContratacionColoniaResponse();
		reponse.setConsulContratacion(k.getConsulta());
		return reponse;
		

	}


	@PayloadRoot(localPart = "objetoContratacionConsultaRequest", namespace="http://www.frida.com/Said")
	@ResponsePayload
	public ObjetoContratacionConsultaResponse getContratacionColonia(@RequestPayload  ObjetoContratacionConsultaRequest request){
		
		System.out.println("HOLA METODO CONTRATACION CONSULTA");
		pruebaCOntraCOnsultCOlonia res= new pruebaCOntraCOnsultCOlonia();
		ObjetoContratacionConsultaResponse response=new ObjetoContratacionConsultaResponse();
		response.setContratacionContultaResponse(res.getObjetoContratacionContulta());
		System.out.println("EXITO");
		return response;
		

	}

	
	
}
