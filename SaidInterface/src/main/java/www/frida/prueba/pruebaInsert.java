package www.frida.prueba;


import org.hibernate.Session;

import www.frida.modelo.HibernateUtil;
import www.frida.modelo.SaibConsultaRequest;

public class pruebaInsert {
	
	public void inserta(String concentracion,String tipoContrato,String folioSC,String claveOperador){
		java.util.Date date = new java.util.Date();
		java.sql.Date datesql = new java.sql.Date(date.getTime());
		System.out.println(datesql);
		
		
		
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
	   
       
		//Query query = session.getNamedQuery("SP_pruebaJava");
		
//		Query query = session.createSQLQuery("CALL prueba_java_procedure(?,?,?,?,?,?)").addEntity(StoreProcedureSAIB.class);
//    
//		System.out.println(query.getQueryString());
//		
//		StoreProcedureSAIB ejemplo=(StoreProcedureSAIB) query.uniqueResult();
//   System.out.println(ejemplo.getFolioSc());
//   System.out.println(ejemplo.getIdRegion());
//   System.out.println(ejemplo.getNcaiCentral());
		
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
		session.save(scr);
       System.out.println("SALVADO");
       session.getTransaction().commit();
   
   
		
		
	}
	

	/*public static void main(String[] args) {
		pruebaInsert obj=new pruebaInsert();
		obj.inserta("abc", "sdkjskdj", "skkdjskdj", "mno");

	}*/

}
