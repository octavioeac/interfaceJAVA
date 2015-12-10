package www.frida.com.consulta.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import www.frida.modelo.HibernateUtil;
import www.frida.modelo.SaibConsultaRequest;









public class insertaConsultaDAO {

	public void insertaConsulta(
			 String tpContrato,
			 String  tpconcentracion,
			 String tpMovimiento,
			 String tpFolioSc,
			 String tpclaveOperador,
			 String tpSiglasCentral,
			 String tpErro,
			 String tpErrorMensaje
			){
		
		java.util.Date date = new java.util.Date();
		java.sql.Date datesql = new java.sql.Date(date.getTime());
		System.out.println(datesql);
		
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		 newSession.beginTransaction();
		 SaibConsultaRequest scr = new SaibConsultaRequest();
			scr.setTipoConcentracion(tpconcentracion);
			scr.setTipoContrato(tpContrato);
			scr.setMovimiento(tpMovimiento);
			scr.setFolioSC(tpFolioSc);
			scr.setClaveOperador(tpclaveOperador);
			scr.setSiglasCentral(tpSiglasCentral);
			scr.setError(tpErro);
			scr.setErrorMensaje(tpErrorMensaje);
			scr.setFechaRequest(datesql);
			newSession.save(scr);
			newSession.getTransaction().commit();
		
try{
			newSession.close();
			HibernateUtil.close();
			System.out.println("CERRANDO INSERTA DAO");
}
catch(HibernateException e){
	
	System.out.println(e.getCause());
}
		 
	}
	
}
