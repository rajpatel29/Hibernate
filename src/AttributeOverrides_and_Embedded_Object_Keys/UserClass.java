package AttributeOverrides_and_Embedded_Object_Keys;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserClass 
{
	@EmbeddedId
	private Name  name;
	
	
	@AttributeOverrides({
		@AttributeOverride(name = "street" ,  column = @Column(name = "home_street")) ,
		@AttributeOverride(name = "city" ,  column = @Column(name = "home_city")) ,
		@AttributeOverride(name = "state" ,  column = @Column(name = "home_state"))
	})
	private Address homeAddress;
	private Address officeAddress;
	
	
	

	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
	
	
}
