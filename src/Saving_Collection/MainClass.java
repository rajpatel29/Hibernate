package Saving_Collection;

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
		
		/*
		    Address address1 = new Address();
		    address1.setCity("city 1");
		    address1.setState("state 1");
		    address1.setStreet("street 1");
		
		    Address address2 = new Address();
		    address2.setCity("city 2");
		    address2.setState("state 2");
		    address2.setStreet("street 2");
		    
		    
		    UserClass user = new UserClass();
		    user.setId(1);
		    user.setName("RUTVIK");
		    user.getListOfAddress().add(address1);
		    user.getListOfAddress().add(address2);
		    
		    Session session = sessionFactory.openSession();
		    session.beginTransaction();
		    session.save(user);
		    session.getTransaction().commit();
		    session.close();
	    */
	    
	    
	    
	    //if some user has 100 address in database and you are interested then there is no need to take all the address.
	    //lazy initialization :- it use proxy class
	    //eager initialization
	    //you can specify fetch type in Saving_Collection.UserClass class
	    
	    Saving_Collection.UserClass userObj= null;
	    Session session = sessionFactory.openSession();
	    userObj = (Saving_Collection.UserClass) session.get(Saving_Collection.UserClass.class, 1);
	    session.close();
	    
	    //change fetch type to lazy to see the difference between lazy and eager
	    System.out.println(userObj.getListOfAddress().size());
		
	}

}
