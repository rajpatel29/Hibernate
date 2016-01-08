package Criteria_API;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MainClass 
{
	private static StandardServiceRegistry serviceRegistery;
	private static SessionFactory sessionFactory;
	
	public static void main(String str[])
	{
		Configuration configuration = new Configuration().configure();
		serviceRegistery =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistery);
		
		
		
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
		
		
		//see all the methods in Restrictions class
		
		Criteria criteria = session.createCriteria(UserClass.class);
//		criteria.add(Restrictions.eq("userName", "User 3"))
//				.add(Restrictions.between("userId", 0, 5));
		
		criteria.add(Restrictions.or(Restrictions.between("userId", 0, 3) , Restrictions.between("userId", 6, 7)));
		
		
		List<UserClass> users = criteria.list();
		
		
		
		session.getTransaction().commit();
		session.close();
		
		for(UserClass user : users)
		{
			System.out.println(user.getUserName());
		}
		
		
		
	}
}
