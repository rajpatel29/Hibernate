package Value_Type_and_Embedding_Object;

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
		
		
		Address address = new Address();
	    address.setCity("city 1");
	    address.setState("state 1");
	    address.setStreet("street 1");
	    
	    UserClass userClass = new UserClass();
	    userClass.setId(1);
	    userClass.setUserName("first user");
	    userClass.setAddress(address);
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(userClass);
	    session.getTransaction().commit();
	    session.close();
	
		
		
	}

}
