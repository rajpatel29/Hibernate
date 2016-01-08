package Named_Queries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainClass 
{
	private static  StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration().configure();
		serviceRegistry =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/*
			for (int i = 0; i < 10; i++) 
			{
				UserClass user = new UserClass();
				user.setUserId(i);
				user.setUserName("User " + i);
				session.save(user);
			}
		*/
		
		Query query = session.getNamedQuery("UserClass.byId");
		query.setInteger(0, 5);
		
		List<UserClass> users = query.list();

		
		Query query1 = session.getNamedQuery("UserClass.byName");
		query1.setString(0, "User 6");
		List<UserClass> user6 = query1.list();
		
		session.getTransaction().commit();
		session.close();
		
		for(UserClass user : users)
		{
			System.out.println(user.getUserName());
		}
		System.out.println("---------------------");
		
		for(UserClass user : user6)
		{
			System.out.println(user.getUserName());
		}
	}
	
}
