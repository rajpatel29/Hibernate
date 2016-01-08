package Many_To_Many;

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
		
	    Many_To_Many.UserClass user1 = new Many_To_Many.UserClass();
	    user1.setUserId(1);
	    user1.setUserName("Harsh");
	    
	    Many_To_Many.UserClass user2 = new Many_To_Many.UserClass();
	    user2.setUserId(2);
	    user2.setUserName("Rutvik");
	    
	    
	    Many_To_Many.Vehicle vehicle1 = new Many_To_Many.Vehicle();
	    vehicle1.setVehicleId(1);
	    vehicle1.setVehicleName("car");
	    
	    Many_To_Many.Vehicle vehicle2 = new Many_To_Many.Vehicle();
	    vehicle2.setVehicleId(2);
	    vehicle2.setVehicleName("Jeep");
	 
	    
	    
	    
	    vehicle1.getUserList().add(user2);
	    vehicle2.getUserList().add(user2);
	    
	    vehicle1.getUserList().add(user1);
	    vehicle2.getUserList().add(user1);
	    
	    
	    Session session =sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user1);
	    session.save(vehicle1);
	    session.save(vehicle2);
	    session.getTransaction().commit();
	    session.close();
	}

}
