package Many_To_Many;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Vehicle 
{
	@Id
	private int vehicleId;
	private String vehicleName;
	
	@ManyToMany
	private Collection<UserClass> userList = new ArrayList<>();
	
	
	
	public Collection<UserClass> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserClass> userList) {
		this.userList = userList;
	}
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
	
	
}

