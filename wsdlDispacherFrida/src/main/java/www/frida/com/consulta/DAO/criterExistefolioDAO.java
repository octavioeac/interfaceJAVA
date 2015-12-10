package www.frida.com.consulta.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import www.frida.com.consulta.Errores;
import www.frida.modelo.HibernateUtil;
import www.frida.modelo.SaibConsultaResponse;

public class criterExistefolioDAO {

	public String  getExistencia(String folio){
		
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		 
		 newSession.beginTransaction();
	
		String cadena="";
		
		List lista=null;
		 Criteria cr = newSession.createCriteria(SaibConsultaResponse.class);
		Criterion par1=Restrictions.and(Restrictions.eq("folioSc", folio));
		 ProjectionList projectionList = Projections.projectionList();
		 projectionList.add((Projections.groupProperty("folioSc")));
		 cr.setProjection(projectionList);
		 cr.add(par1);
		
		 lista=cr.list();
		if(lista.isEmpty()){
			cadena="";
		
		}
		else{
			cadena="si";
			
		}
		 System.out.println(lista);
	
		 
		newSession.close();
		HibernateUtil.close();
		System.out.println("Cerrando BUSQUEDA FOLIO 2");
		

		return cadena;
		
		
	}
	
	/*public static void main(String args[]){
		
		criterExistefolioDAO j=new criterExistefolioDAO();
		String h=j.getExistencia("12351");
		
		System.out.println(h);
		j.getExistencia("9999999999999");
	}*/
	
	
}
