package Inheritance_with_Joined_Strategy;

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
		
		Vehicle vehicle1 = new Vehicle();
	    vehicle1.setVehicleId(11);
	    vehicle1.setVehicleName("Vehicle");
	    
	    TwoWheeler twoObj = new TwoWheeler();
	    twoObj.setVehicleId(12);
	    twoObj.setVehicleName("bike");
	    twoObj.setSteeringHandle("Bike Steering Handle");
	    
	    FourWheeler fourObj = new FourWheeler();
	    fourObj.setVehicleId(13);
	    fourObj.setVehicleName("porsche");
	    fourObj.setSteeringWheel("Porsche Steering Wheel");
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(vehicle1);
	    session.save(twoObj);
	    session.save(fourObj);
	    session.getTransaction().commit();
	    session.close();
	}

}
