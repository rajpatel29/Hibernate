import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import AttributeOverrides_and_Embedded_Object_Keys.Name;
import Inheritance_Single_Table.TwoWheeler;
import One_To_One_Mapping.Vehicle;
import Simple_Hibernate_Example.UserDetails;
import Value_Type_and_Embedding_Object.Address;
import Value_Type_and_Embedding_Object.UserClass;

public class MainClass 
{
	public static void main(String[] args) 
	{
		//one sessionfactory per application
	    SessionFactory sessionFactory  = new Configuration().configure().buildSessionFactory();

	    
/*
		Simple_Hibernate_Example.UserDetails user = new Simple_Hibernate_Example.UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    
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
	   

/*	    
	    //retrieving object
	    //you need to uncomment mapping tag for this class in hibernate.cfg.xml
	    
	    More_Annotation.UserDetails user= null; 
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    //1 is primary key
	    user = (More_Annotation.UserDetails) session.get(More_Annotation.UserDetails.class,  1);
	    System.out.println("UserNmae is "  + user.getUserName());
*/	    
	    
	    
	    
/*	    
	    Primary_Keys.UserDeta user = new Primary_Keys.UserDeta();
	    user.setUserName("First User");
	    
	    Primary_Keys.UserDeta user2 = new Primary_Keys.UserDeta();
	    user2.setUserName("Second User");
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.save(user2);
	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    
	    
	    
/*	    
	    Address address = new Address();
	    address.setCity("city 1");
	    address.setState("state 1");
	    address.setStreet("street 1");
	    
	    UserClass userClass = new UserClass();
	    userClass.setId(1);
	    userClass.setUserName("first user");
	    userClass.setAddress(address);
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(userClass);
	    session.getTransaction().commit();
	    session.close();
*/
	    
	   
/*	    
	    Name name1 = new Name();
	    name1.setFirstName("Rutvik");
	    name1.setLastName("Patel");
	   
	    
	    AttributeOverrides_and_Embedded_Object_Keys.Address address1 = new AttributeOverrides_and_Embedded_Object_Keys.Address();
	    address1.setCity("city 1");
	    address1.setState("state 1");
	    address1.setStreet("street 1");

	    AttributeOverrides_and_Embedded_Object_Keys.Address address2 = new AttributeOverrides_and_Embedded_Object_Keys.Address();
	    address2.setCity("city 2");
	    address2.setState("state 2");
	    address2.setStreet("street 2");
	    
	    
	    AttributeOverrides_and_Embedded_Object_Keys.UserClass user1 = new AttributeOverrides_and_Embedded_Object_Keys.UserClass();
	    user1.setName(name1);
	    user1.setHomeAddress(address1);
	    user1.setOfficeAddress(address2);
	    
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user1);
	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    
/*	    
	    Saving_Collection.Address address1 = new Saving_Collection.Address();
	    address1.setCity("city 1");
	    address1.setState("state 1");
	    address1.setStreet("street 1");

	    Saving_Collection.Address address2 = new Saving_Collection.Address();
	    address2.setCity("city 2");
	    address2.setState("state 2");
	    address2.setStreet("street 2");
	    
	    
	    Saving_Collection.UserClass user = new Saving_Collection.UserClass();
	    user.setId(1);
	    user.setName("RUTVIK");
	    user.getListOfAddress().add(address1);
	    user.getListOfAddress().add(address2);
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    

/*	    
	    //if some user has 100 address in database and you are interested then there is no need to take all the address.
	    //lazy initialization :- it use proxy class
	    //eager initialization
	    //you can specify fetch type in Saving_Collection.UserClass class
	    
	    Saving_Collection.UserClass userObj= null;
	    Session session = sessionFactory.openSession();
	    userObj = (Saving_Collection.UserClass) session.get(Saving_Collection.UserClass.class, 1);
	    session.close();
	    
	    //change fetch type to lazy to see the difference between lazy and eager
	    System.out.println(userObj.getListOfAddress().size());
*/	    

/*	    
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
*/	    
	    
	    
	    
	    
/*	    
	    One_To_Many.UserClass user1 = new One_To_Many.UserClass();
	    user1.setUserId(1);
	    user1.setUserName("Harsh");
	    
	    One_To_Many.Vehicle vehicle1 = new One_To_Many.Vehicle();
	    vehicle1.setVehicleId(1);
	    vehicle1.setVehicleName("car");
	    
	    One_To_Many.Vehicle vehicle2 = new One_To_Many.Vehicle();
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
*/	    
	    

/*	    
	    One_To_Many_No_Extra_Table.UserClass user1 = new One_To_Many_No_Extra_Table.UserClass();
	    user1.setUserId(1);
	    user1.setUserName("Harsh");
	    
	    One_To_Many_No_Extra_Table.Vehicle vehicle1 = new One_To_Many_No_Extra_Table.Vehicle();
	    vehicle1.setVehicleId(11);
	    vehicle1.setVehicleName("car");
	    
	    One_To_Many_No_Extra_Table.Vehicle vehicle2 = new One_To_Many_No_Extra_Table.Vehicle();
	    vehicle2.setVehicleId(12);
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
*/
	    
	    
	    
	    
	    
/*	    
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
*/	    
	    
	    
	    
/*	    
	    Cascade_Types.UserClass user1 = new Cascade_Types.UserClass();
	    user1.setUserId(1);
	    user1.setUserName("Harsh");
	    
	    Cascade_Types.Vehicle vehicle1 = new Cascade_Types.Vehicle();
	    vehicle1.setVehicleId(11);
	    vehicle1.setVehicleName("car");
	    
	    Cascade_Types.Vehicle vehicle2 = new Cascade_Types.Vehicle();
	    vehicle2.setVehicleId(12);
	    vehicle2.setVehicleName("Jeep");
	    
	    user1.getVehicles().add(vehicle1);
	    user1.getVehicles().add(vehicle2);
	    
	    
	    //lets save a user has 100 vehicle. So you have to save 100 vehicles
	    //instead of doing that you can use cascade it will automatically save all the vehicles
	    
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user1);

	    session.getTransaction().commit();
	    session.close();
*/	    
	    
	    
/*	    
	    Inheritance_Single_Table.Vehicle vehicle1 = new Inheritance_Single_Table.Vehicle();
	    vehicle1.setVehicleId(11);
	    vehicle1.setVehicleName("Vehicle");
	    
	    Inheritance_Single_Table.TwoWheeler twoObj = new Inheritance_Single_Table.TwoWheeler();
	    twoObj.setVehicleId(12);
	    twoObj.setVehicleName("bike");
	    twoObj.setSteeringHandle("Bike Steering Handle");
	    
	    Inheritance_Single_Table.FourWheeler fourObj = new Inheritance_Single_Table.FourWheeler();
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
*/	    
	    
/*	    
	    Inheritance_Table_Per_Class.Vehicle vehicle1 = new Inheritance_Table_Per_Class.Vehicle();
	    vehicle1.setVehicleId(11);
	    vehicle1.setVehicleName("Vehicle");
	    
	    Inheritance_Table_Per_Class.TwoWheeler twoObj = new Inheritance_Table_Per_Class.TwoWheeler();
	    twoObj.setVehicleId(12);
	    twoObj.setVehicleName("bike");
	    twoObj.setSteeringHandle("Bike Steering Handle");
	    
	    Inheritance_Table_Per_Class.FourWheeler fourObj = new Inheritance_Table_Per_Class.FourWheeler();
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
*/	    
	
/*	    
	    Inheritance_with_Joined_Strategy.Vehicle vehicle1 = new Inheritance_with_Joined_Strategy.Vehicle();
	    vehicle1.setVehicleId(11);
	    vehicle1.setVehicleName("Vehicle");
	    
	    Inheritance_with_Joined_Strategy.TwoWheeler twoObj = new Inheritance_with_Joined_Strategy.TwoWheeler();
	    twoObj.setVehicleId(12);
	    twoObj.setVehicleName("bike");
	    twoObj.setSteeringHandle("Bike Steering Handle");
	    
	    Inheritance_with_Joined_Strategy.FourWheeler fourObj = new Inheritance_with_Joined_Strategy.FourWheeler();
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
*/
	    
	    
	    
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
	    */
	    
	    
	    CRUD.UserClass user = (CRUD.UserClass) session.get(CRUD.UserClass.class , 5 );
	    
	    //delete
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
