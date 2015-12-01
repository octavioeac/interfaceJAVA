package www.frida.com.in.dep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import www.frida.com.consulta.Errores;
import www.frida.com.consulta.SolicitudPCAI;
import www.frida.com.consultaTelefono.ConsulTelRequest;



public class prueba {

	public prueba() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		SolicitudPCAI objeto=new SolicitudPCAI();
		objeto.setMovimiento("CONSULTA");
		objeto.setTipoConcentracion("LOCAL");
		objeto.setTipoContrato("COLONIALS");
		objeto.setFolioSC("sdsds343443S");
		objeto.setClaveOperador("1234");
	
		List<String> siglaCentral=new ArrayList<String>();
  		siglaCentral.add("LF_");
  		siglaCentral.add("FR_");
  		siglaCentral.add("AF_");
  		siglaCentral.add("DF_");
  		siglaCentral.add("DF_");
  		siglaCentral.add("DF_");
  		siglaCentral.add("DF_");
  		siglaCentral.add("DF_");
  		
		
				
		
		int i=0;
	ConsulTelRequest gs=new ConsulTelRequest();
	List<String> bandera=new ArrayList<String>();
	objectFactoryDependecy k=new objectFactoryDependecy(new IssueMensageConsultaImple(objeto));
	Hashtable<Boolean, Errores> tablita=new Hashtable<Boolean, Errores>();
    Errores j=k.getErrorObj();
    
    if(j.getCodigoError()==""){
    	
    	//Codigos del los otros tag están limpios entra a al validación de las siglas
    objeto.setSiglaCentral(siglaCentral);
    //MANDA LLAMAR AL METODO QUE REGRESA UN HASHMAP
    IssueMensageConsultaImple l=new IssueMensageConsultaImple(objeto);
    tablita=l.analizaTotalSiglas(siglaCentral);
    Iterator<Boolean> keySetIterator = tablita.keySet().iterator();
    
    
	 while(keySetIterator.hasNext()){
  	 Boolean key = keySetIterator.next();
  	   
    System.out.println("key: " + key + " value: " + tablita.get(key));
    if(key==false){
    j=tablita.get(key);
    
    }
    if(key==true){
      bandera.add("HOLA");
    }
    
    i++;
    

    }

 System.out.println(j.getDescripError());

if(bandera.size()==tablita.size()){
	 
	 System.out.println("HOLA STORE PROCEDURE");
	 
	 
	 
}
 

    
     }
      else{
    	  objeto.setSiglaCentral(siglaCentral);
    	  IssueMensageConsultaImple l=new IssueMensageConsultaImple(objeto);
    	  l.regresaError(j);
    	  System.out.println(j.getDescripError());
    	  
    	  
      }
   
     
           
      
	}
}
      
      


