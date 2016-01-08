package More_Annotation;

import java.util.Date;

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
		serviceRegistry  = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
/*		
	    More_Annotation.UserDetails user = new More_Annotation.UserDetails();
	    More_Annotation.UserDetails user2 = new More_Annotation.UserDetails();
	    user.setUserId(1);
	    user2.setUserId(2);
		user.setUserName("First User");
		user2.setUserName("Second User");
		user.setAddress("Address 1");
		user.setDiscription("something");
		user.setDate(new Date());
		
		
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
	    session.save(user2);
		session.getTransaction().commit();
		session.close();
*/		
		
		 //normally you put session.close in finally block
		
		
		   //retrieving object
	    //you need to uncomment mapping tag for this class in hibernate.cfg.xml
	    
	    More_Annotation.UserDetails user= null; 
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    //1 is primary key
	    user = (More_Annotation.UserDetails) session.get(More_Annotation.UserDetails.class,  1);
	    System.out.println("UserNmae is "  + user.getUserName());
	}
}
