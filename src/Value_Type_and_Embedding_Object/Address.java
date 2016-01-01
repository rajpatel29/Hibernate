package Value_Type_and_Embedding_Object;

import javax.persistence.Embeddable;

//this class is value type because address does not have independent identity
//there has to be a user for an address 

@Embeddable
public class Address 
{
	private String street;
	private String city;
	private String state;
	
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
}
