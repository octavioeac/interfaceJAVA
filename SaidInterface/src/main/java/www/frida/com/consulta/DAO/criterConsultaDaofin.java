package www.frida.com.consulta.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import www.frida.com.consulta.Centrales;
import www.frida.com.consulta.ObjectSc;
import www.frida.com.consulta.Regiones;
import www.frida.com.consulta.SolicitudPCAI;
import www.frida.com.consulta.Colonia.Ncai;
import www.frida.modelo.HibernateUtil;
import www.frida.modelo.SaibConsultaResponse;

public class criterConsultaDaofin {

	public List<Centrales> getCentralesResult(
			String folio_sc,
			String clave_operador,
			String tipo_concentracion,
			String id_region){
		
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		 
		 newSession.beginTransaction();
		 
		 Criteria cr = newSession.createCriteria(SaibConsultaResponse.class);

		Criterion par1=Restrictions.and(
				Restrictions.eq("folioSc", folio_sc),
				Restrictions.eq("claveOperador", clave_operador));
		
		Criterion par2=Restrictions.and(
				Restrictions.eq("tipoConcentracion", tipo_concentracion),
				Restrictions.eq("idRegion", id_region));	
		
		cr.add(Restrictions.and(par1,par2));
		
		List<Centrales> response=new ArrayList<Centrales>();
			
		try{
		List<SaibConsultaResponse> result = cr.list();
		
		
		Ncai op=new Ncai();
	for(SaibConsultaResponse l:result){
		Centrales h=new Centrales();
		
		h.setNcaiCentral(l.getNcaiCentral());
		h.setNcaiId(l.getNcaiId());
		h.setNcaiSiglas(l.getNcaiSiglas());
		
		response.add(h);
		
		
			
	}
	newSession.getTransaction().commit();
	newSession.close();
	HibernateUtil.close();
	System.out.println("Cerrando CENTRALES");
		}
		catch(HibernateException e){
			
			System.out.println(e.getMessage()+e.getCause());
		}
		
		
		
				return response;
		
	}
	
	
	

	
	
	public List<Regiones> getCentrales(
			String foliosc,
			String claveoperador,
			String tipoconcentracion
			){
	
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		 
		 newSession.beginTransaction();
		 
		Criteria cr=newSession.createCriteria(SaibConsultaResponse.class);
	 Criterion enund1=Restrictions.and(Restrictions.eq("folioSc", foliosc),
			 Restrictions.eq("claveOperador", claveoperador));
	 Criterion enun2=Restrictions.eq("tipoConcentracion", tipoconcentracion);
	 
	 ProjectionList projectionList = Projections.projectionList(); 
	 projectionList.add((Projections.groupProperty("idRegion")));
	 
	 
	 
	  cr.setProjection(projectionList);
	 cr.add(Restrictions.and(enund1, enund1));
	 
	  List<Object[]> lista=(List<Object[]>) cr.list();	 
	
	
	 List<Regiones> reponse=new ArrayList<Regiones>();
	for(Object[] bari:lista){
		Regiones objeto=new Regiones();
		objeto.setIdRegion((String) bari[0]);
		objeto.setCentral(getCentralesResult(foliosc, claveoperador, tipoconcentracion, objeto.getIdRegion()));
		reponse.add(objeto);
		/*
		System.out.println("id_region:"+bari[0]);
		System.out.println("pc1_siglas:"+bari[1]);
		System.out.println("pc2_siglas"+bari[2]);
		System.out.println("pc2_central"+bari[3]);
		System.out.println("pc1_central"+bari[4]);*/
	}
	  
	 
	try{
		newSession.close();
				HibernateUtil.close();
				System.out.println("Cerrando Regiones");
	}
	catch(HibernateException e){
		
		System.out.println(e.getCause());
	}
	

	 
	 return reponse;
	 
	
	 
	}
	
   public ObjectSc getObjectSc(SolicitudPCAI obje){
	   
	   ObjectSc objeto=new ObjectSc();
	   System.out.println("HOLA OBJETO");
	   objeto.setFolioSC(obje.getFolioSC());
	   System.out.println(obje.getFolioSC());
	   	   objeto.setTipoConcentracion(obje.getTipoConcentracion());
	   	   
	   	System.out.println(obje.getTipoConcentracion());
	   objeto.setClaveOperador(obje.getClaveOperador());
	   System.out.println(obje.getClaveOperador());
	   objeto.setRegion(getCentrales(obje.getFolioSC(), obje.getClaveOperador(), obje.getTipoConcentracion()));
	   
	   return objeto;
	   
	   
   }	
	
	public static void main(String[] args) {
		SolicitudPCAI k=new SolicitudPCAI();
		k.setFolioSC("12351");
		k.setMovimiento("CONSULTA");
		k.setClaveOperador("12");
		k.setTipoConcentracion("LOCAL");
		
		 
		
		
		criterConsultaDAO m=new criterConsultaDAO();
		ObjectSc objeto=m.getObjectSc(k);
		

	}

}
