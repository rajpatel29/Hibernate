package More_Annotation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//this class needs to save it in database
@Entity
@Table(name = "User_Det") //this will only change the name of the table not the entity
public class UserDetails
{
	//for primary key
	@Id
	private int userId;
	private String userName;
	
	@Transient
	private String address;

	//default is var char(255). If there is huge amount of text then it wont work
	//two types of lob
	//clob -character lob
	//blob -byte stream lob
	//if you don't specify type then it automatically choose clob
//	@Lob
	private String discription;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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

