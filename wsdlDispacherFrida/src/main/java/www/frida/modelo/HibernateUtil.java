package www.frida.modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry registry;
	
	public static SessionFactory getSessionFactory() {
		registry = new StandardServiceRegistryBuilder().configure().build();
		try{
			sessionFactory = new MetadataSources(registry).buildMetadata()
					.buildSessionFactory();
		}
		catch(Exception e){
			StandardServiceRegistryBuilder.destroy(registry);
		}
		return sessionFactory;
	}
	
	public static StandardServiceRegistry getStandardServiceRegistry(){
		return registry;
	}
	
	public static void close(){
		try{
			if(registry!= null) {
		        StandardServiceRegistryBuilder.destroy(registry);
		    }
		}catch(Exception e){
			System.out.println(e);
		}
	}
}