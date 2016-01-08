package CRUD;

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
		
		
		
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

	    /*
		    for (int j = 0; j < 10; j++) 
		    {
		    	CRUD.UserClass user = new CRUD.UserClass();
		    	user.setUserId(j);
		    	user.setUserName("User " + j);
		    	session.save(user);
			}
		    session.getTransaction().commit();
		    session.close();
		  */
	    
	    
	    CRUD.UserClass user = (CRUD.UserClass) session.get(CRUD.UserClass.class , 5 );
	    
	    //delete
	    //when you delete an object then it becomes a transient object
	    CRUD.UserClass user1 = (CRUD.UserClass) session.get(CRUD.UserClass.class , 6 );
	    session.delete(user1);
	    
	    //update
	    CRUD.UserClass user2 = (CRUD.UserClass) session.get(CRUD.UserClass.class , 7 );
	    user2.setUserName("Updated User");
	    session.update(user2);

	    session.getTransaction().commit();
	    session.close();
	    
	    //since userName is not a collection there is no eager or lazy initialization. It is by default eager
	    System.out.println("User Name is: " + user.getUserName());
	}

}
