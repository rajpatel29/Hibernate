package One_To_One_Mapping;

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
		
		
	    One_To_One_Mapping.UserClass user1 = new One_To_One_Mapping.UserClass();
	    user1.setId(1);
	    user1.setUserName("Harsh");
	    
	    One_To_One_Mapping.Vehicle vehicle1 = new One_To_One_Mapping.Vehicle();
	    vehicle1.setVehicleId(1);
	    vehicle1.setVehicleName("car");
	    
	    user1.setVehicle(vehicle1);
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user1);
	    session.save(vehicle1);
	    session.getTransaction().commit();
	    session.close();
	}

}
