package www.frida.prueba;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import www.frida.modelo.HibernateUtil;
import www.frida.modelo.SaibConsultaRequest;

public class pruebaInsert {
	
	public void inserta(String concentracion,String tipoContrato,String folioSC,String claveOperador){
		java.util.Date date = new java.util.Date();
		java.sql.Date datesql = new java.sql.Date(date.getTime());
		System.out.println(datesql);
		
		
       try{
       

  		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  		 Session newSession = sessionFactory.openSession();
  		 newSession.beginTransaction();   
   		SaibConsultaRequest scr = new SaibConsultaRequest();
   		scr.setTipoConcentracion(concentracion);
   		scr.setTipoContrato(tipoContrato);
   		scr.setMovimiento("jkjkj");
   		scr.setFolioSC(folioSC);
   		scr.setClaveOperador(claveOperador);
   		scr.setSiglasCentral("PQR");
   		scr.setError("error");
   		scr.setErrorMensaje("fallo");
   		scr.setFechaRequest(datesql);
   		newSession.save(scr);
          System.out.println("SALVADO");
          newSession.getTransaction().commit();    	 
    	   newSession.close();
    	  
             
       
       }
       catch(HibernateException e){
    	   System.out.println(e);
       }
		
		
	}
	

	public static void main(String[] args) {
		pruebaInsert obj=new pruebaInsert();
		obj.inserta("abc", "sdkjskdj", "skkdjskdj", "mno");

	}

}
