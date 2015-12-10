package www.frida.com.consulta.DAO;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println("HOLA METODO ejecutaStoreConsulta()");
		Session session = null;
    	Transaction tx = null;
		try{
		
		 session=HibernateUtil.getSessionFactory().openSession();
		 tx =session.getTransaction();
		 tx.setTimeout(5);
		session.beginTransaction();
		
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
		}catch(RuntimeException e){
    		try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			System.out.println("Couldn’t roll back transaction");
    		}
    		throw e;
    	}finally{
    		if(session!=null){
    			
    HibernateUtil.close();
    		}
    	}	
	
			//HibernateUtil.close();
			
			System.out.println("CERRANDO STORE PROCEDURE");

		 
	
  
   
   
 


	

	}


	/*public static void main(String args[]){
		storeProcedureConsulta obje=new storeProcedureConsulta();
		List<String> lista=new ArrayList<String>();
		lista.add("BOR");
		lista.add("MIR");
		
		for(String h:lista){
		obje.ejecutaStoreConsulta(h, "LOCAL", "COLONIA", "CONSULTA", "18789065", "12", 2);
		}
	}*/

	
	
}
