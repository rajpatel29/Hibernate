package Primary_Keys;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainClass 
{
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration().configure();
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	   UserDeta user = new UserDeta();
	   user.setUserId(1);
	    user.setUserName("First User");
	    
	    UserDeta user2 = new UserDeta();
	    user.setUserId(2);
	    user2.setUserName("Second User");
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.save(user2);
	    session.getTransaction().commit();
	    session.close();
	}

}
