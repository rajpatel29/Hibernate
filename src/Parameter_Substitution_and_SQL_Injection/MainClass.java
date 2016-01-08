package Parameter_Substitution_and_SQL_Injection;


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
	        	UserClass user = new UserClass();
	            user.setUserId(i);
	            user.setUserName("User " + i);
	            session.save(user);
			}
		
    	
    	String first = "5";
    	String second = "user 8";
    	
    	Query query = session.createQuery("from UserClass where userId > :userid and userName = :username");
    	query.setInteger("userid" , Integer.parseInt(first) );
    	query.setString("username", second);
    	
    	List<UserClass> users = query.list();
    	
    	session.getTransaction().commit();
    	session.close();
    	
    	for(UserClass user : users)
    	{
    		System.out.println(user.getUserName());
    	}
    }
}
