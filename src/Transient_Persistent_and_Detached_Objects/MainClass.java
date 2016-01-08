package Transient_Persistent_and_Detached_Objects;

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
		
	
		  //if we do not save any object then it is called as transient object
	    Transient_Persistent_and_Detached_Objects.UserClass user = new Transient_Persistent_and_Detached_Objects.UserClass();
	    user.setUserId(1);
	    user.setUserName("User 1");
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    
	    
	    //if we save an object then it is called as persistent object
	    session.save(user);
	    user.setUserName("Updated user Name");
	    
	    
	   session.getTransaction().commit();
	   session.close();
	    
	    
	   //if we have already saved an object and if we close the session then that object is called as ditched object
	   user.setUserName("this is not gonna update");
		
	}

}
