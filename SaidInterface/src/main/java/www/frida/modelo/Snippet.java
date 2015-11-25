package www.frida.modelo;

import org.hibernate.Query;
import org.hibernate.Session;




public class Snippet {
	
	
	public void pruebaStore(){
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String siglasABuscar="SO_";
		String tipo_concentracion="LOCAL";
		String tipo_Contrato="COLONIA";
		String movimiento="CONTRATACION";
		String folioSC="1000000018";
		String clave_operedor="200";
		
		Query query = session.createSQLQuery("CALL saib_consulta(:siglas_a_buscar,:tipoConcentracion,:tipoContrato,:movimiento,:folioSC,:claveOperador)")
				.addEntity(StoreProcedureSAIB.class)
				.setParameter("siglas_a_buscar",siglasABuscar)
				.setParameter("tipoConcentracion", tipo_concentracion)
				.setParameter("tipoContrato", tipo_Contrato)
				.setParameter("movimiento", movimiento)
				.setParameter("folioSC", folioSC)
				.setParameter("claveOperador", clave_operedor);
;
		
    
		System.out.println(query.getQueryString());
		
		StoreProcedureSAIB ejemplo=(StoreProcedureSAIB) query.uniqueResult();
   System.out.println(ejemplo.getFolioSc());
   System.out.println(ejemplo.getIdRegion());
   System.out.println(ejemplo.getNcaiCentral());
       

	}
	
/*	public static void main(String[] args) {

		Snippet julio=new Snippet();
		julio.pruebaStore();

	

	}*/
	
	
}

