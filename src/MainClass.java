import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import AttributeOverrides_and_Embedded_Object_Keys.Name;
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
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
