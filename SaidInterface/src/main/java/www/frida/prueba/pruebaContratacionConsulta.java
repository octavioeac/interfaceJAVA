package www.frida.prueba;

import java.util.ArrayList;
import java.util.List;

import www.frida.com.consulta.Errores;
import www.frida.com.consulta.Regiones;
import www.frida.com.consulta.Colonia.ConsultaColonia;
import www.frida.com.consulta.Colonia.Ncai;
import www.frida.com.consulta.Colonia.Pcai;
import www.frida.com.consulta.Colonia.Puertos10G;
import www.frida.com.consulta.Colonia.Puertos1G;
import www.frida.com.consulta.Colonia.Region;

public class pruebaContratacionConsulta {


	public ConsultaColonia getConsulta(){
		ConsultaColonia obj1=new ConsultaColonia();
		obj1.setClaveOperador("CLAVE OPERADOR");
		Errores error=new Errores();
		error.setCodigoError("");
		error.setDescripError("EXITO");
		obj1.setError(error);
		obj1.setFolioSC("FOLIO SC");
		obj1.setTipoConcentracion("TIPO CONCENTRACION");
		obj1.setTipoContrato("CONTRATO PRUEBA");
		obj1.setRegion(getRgiones());
		return obj1;
		
		
	}
	
	
	public List<Pcai> getPcai(){
		pruebaContratacionConsulta lista=new pruebaContratacionConsulta();
		Pcai objeto1=new Pcai();
		objeto1.setFolioPcai("PCAI 1");
		objeto1.setNcai(lista.getncai());
		
		Pcai objeto2=new Pcai();
		objeto1.setFolioPcai("PCAI 2");
		objeto1.setNcai(lista.getncai());
		
		
		List<Pcai> lsta=new ArrayList<Pcai>();
		lsta.add(objeto1);
		lsta.add(objeto2);
		return lsta;
		
		
	}
	
	
	public List<Ncai> getncai(){
		
		Ncai objeto1=new  Ncai();
		objeto1.setFolioNcai("FOLIO 1");
		objeto1.setNcaiCentral("CENTRAL 1");
		objeto1.setNcaiSiglas("SIGLA 1 ");
		objeto1.setEquipoAcceso("EQUIPO ACCESO 1");
		
		
		Ncai objeto2=new  Ncai();
		objeto2.setFolioNcai("FOLIO 2");
		objeto2.setNcaiCentral("CENTRAL 2");
		objeto2.setNcaiSiglas("SIGLA 2 ");
		objeto2.setEquipoAcceso("EQUIPO ACCESO 3");
		
		Ncai objeto3=new  Ncai();
		objeto3.setFolioNcai("FOLIO 3");
		objeto3.setNcaiCentral("CENTRAL 3");
		objeto3.setNcaiSiglas("SIGLA 3 ");
		objeto3.setEquipoAcceso("EQUIPO ACCESO 3");
		
		Ncai objeto4=new  Ncai();
		objeto4.setFolioNcai("FOLIO 4");
		objeto4.setNcaiCentral("CENTRAL 4");
		objeto4.setNcaiSiglas("SIGLA 4 ");
		objeto4.setEquipoAcceso("EQUIPO ACCESO 4");
		
		
		List<Ncai> k=new ArrayList<Ncai>();
		k.add(objeto1);
		k.add(objeto2);
		k.add(objeto3);
		k.add(objeto4);
		return k;
		
	}
	
	public List<Puertos10G> getpuerto10(){
		pruebaContratacionConsulta lista=new pruebaContratacionConsulta();
		Puertos10G ob1=new Puertos10G();
		ob1.setPcai(lista.getPcai());
		
		Puertos10G ob2=new Puertos10G();
		ob2.setPcai(lista.getPcai());
		
		
		List<Puertos10G> k=new ArrayList<Puertos10G>();
		k.add(ob1);
		k.add(ob2);
		return k;
		
		
	}
	
	
	public List<Puertos1G> getpuerto1(){
		pruebaContratacionConsulta lista=new pruebaContratacionConsulta();
		Puertos1G ob1=new Puertos1G();
		ob1.setPcai(lista.getPcai());
		
		
		Puertos1G ob2=new Puertos1G();
		ob2.setPcai(lista.getPcai());
		
		
		Puertos1G ob3=new Puertos1G();
		ob3.setPcai(lista.getPcai());
		
		
		List<Puertos1G> k=new ArrayList<Puertos1G>();
		k.add(ob1);
		k.add(ob2);
		k.add(ob3);
		return k;
		
		
	}
	
	
	public List<Region> getRgiones(){
		pruebaContratacionConsulta lista=new pruebaContratacionConsulta();
		Region obj1=new Region();
		obj1.setIdRegion("Regio 1");
		obj1.setPc1Central("pc1Central 1");
		obj1.setPc1Siglas("pc1Siglas 1");
		obj1.setPc2Central("pc2Central 1");
		obj1.setPc2Siglas("pc2Siglas  1");
		obj1.setPuertos10G(lista.getpuerto10());
		obj1.setPuertos1G(lista.getpuerto1());
		
		Region obj2=new Region();
		obj2.setIdRegion("Regio 2");
		obj2.setPc1Central("pc1Central 2");
		obj2.setPc1Siglas("pc1Siglas 2");
		obj2.setPc2Central("pc2Central 2");
		obj2.setPc2Siglas("pc2Siglas  2");
		obj2.setPuertos10G(lista.getpuerto10());
		obj2.setPuertos1G(lista.getpuerto1());
		
		Region obj3=new Region();
		obj3.setIdRegion("Regio 3");
		obj3.setPc1Central("pc1Central 3");
		obj3.setPc1Siglas("pc1Siglas 3");
		obj3.setPc2Central("pc2Central 3");
		obj3.setPc2Siglas("pc2Siglas  3");
		obj3.setPuertos10G(lista.getpuerto10());
		obj3.setPuertos1G(lista.getpuerto1());
		
		List<Region> k=new ArrayList<Region>();
		k.add(obj1);
		k.add(obj2);
		k.add(obj3);
		return k;
	
}

	
	
}
	