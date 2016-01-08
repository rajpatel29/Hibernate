package Simple_Hibernate_Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainClass 
{
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	public static void main(String str[])
	{
		Configuration configuration = new Configuration().configure();
		serviceRegistry =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		
		UserDetails user = new UserDetails();
		user.setUserId(3);
		user.setUserName("First User");
		
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.close();
	}
}
