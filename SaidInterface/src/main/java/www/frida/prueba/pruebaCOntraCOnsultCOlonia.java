package www.frida.prueba;

import java.util.ArrayList;
import java.util.List;

import www.frida.com.consulta.Errores;
import www.frida.com.consulta.Colonia.Ncai;
import www.frida.com.consulta.Colonia.Pcai;
import www.frida.com.consulta.ContratacionColonia.ObjetoContratacionContulta;
import www.frida.com.consulta.ContratacionColonia.Pc1;
import www.frida.com.consulta.ContratacionColonia.RegionesConsultaColonia;

public class pruebaCOntraCOnsultCOlonia {

	
	
	public ObjetoContratacionContulta getObjetoContratacionContulta(){
		pruebaCOntraCOnsultCOlonia objeto=new pruebaCOntraCOnsultCOlonia();
		ObjetoContratacionContulta ob=new ObjetoContratacionContulta();
		ob.setClaveOperador("CLAVE");
		ob.setFolioSC("FOLIO");
		ob.setRegion(objeto.getRegion());
		ob.setTipoConcentracion("CONCENTRA");
		ob.setErr(getError());
		return ob;
		
	}

	
	
	public List<RegionesConsultaColonia> getRegion(){
		
		pruebaCOntraCOnsultCOlonia objeto=new pruebaCOntraCOnsultCOlonia();
		RegionesConsultaColonia respuesta =new RegionesConsultaColonia();
		
		respuesta.setPcai(objeto.getPcai());
		respuesta.setPc1(getPc1());
		respuesta.setPc2(getPc2());
		
        RegionesConsultaColonia respuesta2 =new RegionesConsultaColonia();
		
		respuesta2.setPcai(objeto.getPcai());
		respuesta2.setPc1(getPc1());
		respuesta2.setPc2(getPc2());
		
		
		 List<RegionesConsultaColonia> lista=new ArrayList<>();
		 lista.add(respuesta);
		 lista.add(respuesta2);
		return lista;
		
		
		
		
	}
	
	
	
	
	public Pc1 getPc1(){
		Pc1 k1=new Pc1();
		k1.setCodigoConfirmacion("2005 ");
		k1.setSiglas("RO_");
		return k1;
		
	}

	
	public Pc1 getPc2(){
		Pc1 k1=new Pc1();
		k1.setCodigoConfirmacion("2006 ");
		k1.setSiglas("PP_");
		return k1;
		
	}
	
	
	public List<Pcai> getPcai(){
		pruebaCOntraCOnsultCOlonia objeto=new pruebaCOntraCOnsultCOlonia();
		
		Pcai obj1=new Pcai();
		obj1.setCodigoConfirmacion("2008");
		obj1.setFolioPcai("100-TP_-150213-2 ");
		obj1.setNcai(objeto.getNcai());
		
		
		Pcai obj2=new Pcai();
		obj2.setCodigoConfirmacion("2008");
		obj2.setFolioPcai("100-TP_-150213-3 ");
		obj2.setNcai(objeto.getNcai());
		
		Pcai obj3=new Pcai();
		obj3.setCodigoConfirmacion("2008");
		obj3.setFolioPcai("100-TP_-150213-1");
		obj3.setNcai(objeto.getNcai());
		
		List<Pcai> lista=new ArrayList<>();
		lista.add(obj1);
		lista.add(obj2);
		lista.add(obj3);
		
		
		return lista;
		
		
	}
	
	
	
	
	
	
	
	
	
	public List<Ncai> getNcai(){
		Ncai ob1=new Ncai();
		ob1.setFolioNcai("100-TP_-150213-4");
		ob1.setCodigoConfirmacion("2004 ");
		
		
		Ncai ob2=new Ncai();
		ob2.setFolioNcai("100-TP_-150213-4 ");
		ob2.setCodigoConfirmacion("2000 ");
		
		
		Ncai ob3=new Ncai();
		ob3.setFolioNcai("100-TP_-150213-4");
		ob3.setCodigoConfirmacion("2004 ");
		
		
		Ncai ob4=new Ncai();
		ob4.setFolioNcai("100-TP_-150213-4 ");
		ob4.setCodigoConfirmacion("20504 ");
		
		List<Ncai> lista=new ArrayList<>();
		lista.add(ob1);
		lista.add(ob2);
		lista.add(ob3);
		lista.add(ob4);
		
		return lista;
		
		
	}
	
	
	public Errores getError(){
		Errores r=new Errores();
		r.setCodigoError("CODIGO ERROR");
		r.setDescripError("AQUÍ VIENE EL ERRRO");
		return r;
	}
	
}


