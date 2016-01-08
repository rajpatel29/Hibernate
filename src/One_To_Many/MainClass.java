package One_To_Many;

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
		
		
	    UserClass user1 = new UserClass();
	    user1.setUserId(1);
	    user1.setUserName("Harsh");
	    
	    Vehicle vehicle1 = new Vehicle();
	    vehicle1.setVehicleId(1);
	    vehicle1.setVehicleName("car");
	    
	    Vehicle vehicle2 = new Vehicle();
	    vehicle2.setVehicleId(2);
	    vehicle2.setVehicleName("Jeep");
	 
	    user1.getVehicles().add(vehicle1);
	    user1.getVehicles().add(vehicle2);
	    
	    
	    //if you don't want bidirectional then there is no need to change in Vehicle class
	    vehicle1.setUser(user1);
	    vehicle2.setUser(user1);
	    
	    
	    
	    
	    
	    Session session =sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user1);
	    session.save(vehicle1);
	    session.save(vehicle2);
	    session.getTransaction().commit();
	    session.close();
		
	}
}
