package AttributeOverrides_and_Embedded_Object_Keys;

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
		
		
		Name name1 = new Name();
	    name1.setFirstName("Rutvik");
	    name1.setLastName("Patel");
	   
	    
	    Address address1 = new Address();
	    address1.setCity("city 1");
	    address1.setState("state 1");
	    address1.setStreet("street 1");

	    Address address2 = new Address();
	    address2.setCity("city 2");
	    address2.setState("state 2");
	    address2.setStreet("street 2");
	    
	    
	    UserClass user1 = new UserClass();
	    user1.setName(name1);
	    user1.setHomeAddress(address1);
	    user1.setOfficeAddress(address2);
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user1);
	    session.getTransaction().commit();
	    session.close();
		
	}

}
