package Cascade_Types;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class UserClass 
{
	@Id
	private int userId;
	private String userName;
	
	//save update delete = ALL
	@OneToMany(cascade = CascadeType.ALL )
	@JoinTable(name = "User_Vehi"  , joinColumns = @JoinColumn(name = "User_Id"), inverseJoinColumns =@JoinColumn(name = "Vehicle_Id"))
	private Collection<Vehicle> vehicles = new ArrayList<>();
	
	
	
	
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
