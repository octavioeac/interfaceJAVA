package www.frida.com.consulta.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import www.frida.com.consulta.Regiones;
import www.frida.com.consulta.Colonia.Region;
import www.frida.modelo.HibernateUtil;
import www.frida.modelo.StoreProcedureSAIB;

public class storeProcedureConsulta {

	
	public void ejecutaStoreConsulta(
			String siglasABuscar,
			String tipo_concentracion,
			String tipo_Contrato,
			String movimiento,
			String folioSC,
			String clave_operedor,
			int pos
			
			){
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx =session.getTransaction();
		session.beginTransaction();
		System.out.println(siglasABuscar);
		System.out.println(folioSC);
		
		Query query = session.createSQLQuery("CALL saib_consulta1(:siglas_a_buscar,:tipoConcentracion,:tipoContrato,:movimiento,:folioSC,:claveOperador,:num)")
				.addEntity(StoreProcedureSAIB.class)
				.setParameter("siglas_a_buscar",siglasABuscar)
				.setParameter("tipoConcentracion", tipo_concentracion)
				.setParameter("tipoContrato", tipo_Contrato)
				.setParameter("movimiento", movimiento)
				.setParameter("folioSC", folioSC)
				.setParameter("claveOperador", clave_operedor)
				.setParameter("num", pos);
		
    
		System.out.println(query.getQueryString());
	 query.executeUpdate();
	 tx.commit();
		
try{
	session.close();
			HibernateUtil.close();
}
catch(HibernateException e){
	
	System.out.println(e.getCause());
}
		 
	
  
   
   
 


	

	}

	
}
