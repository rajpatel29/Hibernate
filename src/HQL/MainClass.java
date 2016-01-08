package HQL;

import java.util.List;

import org.hibernate.Query;
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
		    
		    
		    for (int i = 0; i < 10; i++) 
		    {
		        HQL.UserClass user = new HQL.UserClass();
			    user.setUserId(i);
			    user.setUserName("UserName " + i);
			    session.save(user);
			}
		    
//		    Query  query = session.createQuery("From UserClass");
		    Query  query = session.createQuery("From UserClass where userId > 5");
		    
		    List list = query.list();
		    
		    session.getTransaction().commit();
		    session.close();
		    System.out.println(list.size());
		
		    
		    
		    System.out.println("===================================================");
		    
		    
		    
		    Session session1 = sessionFactory.openSession();
		    session1.beginTransaction();
		    //If you are only interest  in userName then
		    //Query  query = session1.createQuery("Select userName From UserClass ");
		    //Query  query = session1.createQuery("Select max(userId) From UserClass ");
		    //Query  query = session1.createQuery("Select new map(userId , userName) From UserClass ");  //it returns map
		    
		    Query  query1 = session1.createQuery("From UserClass ");
		    //pagination
		    query1.setFirstResult(5);
		    query1.setMaxResults(2);
		    
		    
		    List<HQL.UserClass> users = query1.list();
		    session1.getTransaction().commit();
		    session1.close();
		    
		    
		    for (HQL.UserClass user : users) 
		    {
		    	System.out.println(user.getUserName());
			}

	}

}
