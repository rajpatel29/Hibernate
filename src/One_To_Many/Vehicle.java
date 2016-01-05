package One_To_Many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Vehicle 
{
	@Id
	private int vehicleId;
	private String vehicleName;
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	//n need to to do this if you don't want bidirectional
	@ManyToOne
	//this is because let's say some vehicles does not have a user and if you get it from database
	//then it will create exception. So if you want to ignore that exception
	@NotFound(action = NotFoundAction.IGNORE )
	private UserClass user;


	public UserClass getUser() {
		return user;
	}
	public void setUser(UserClass user) {
		this.user = user;
	}
	
	
	
	
	
}
