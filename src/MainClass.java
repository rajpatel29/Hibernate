import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Simple_Hibernate_Example.UserDetails;

public class MainClass 
{
	public static void main(String[] args) 
	{
		//one sessionfactory per application
	    SessionFactory sessionFactory  = new Configuration().configure().buildSessionFactory();

	    
/*
		Simple_Hibernate_Example.UserDetails user = new Simple_Hibernate_Example.UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    
/*	    
	    More_Annotation.UserDetails user = new More_Annotation.UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		user.setAddress("Address 1");
		user.setDiscription("something");
		user.setDate(new Date());
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    //normally you put session.close in finally block
	   

/*	    
	    //retrieving object
	    //you need to uncomment mapping tag for this class in hibernate.cfg.xml
	    
	    More_Annotation.UserDetails user= null; 
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    //1 is primary key
	    user = (More_Annotation.UserDetails) session.get(More_Annotation.UserDetails.class,  1);
	    System.out.println("UserNmae is "  + user.getUserName());
*/	    
	    
	    
	}
}
