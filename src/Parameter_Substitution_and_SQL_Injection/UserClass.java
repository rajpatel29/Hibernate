package Parameter_Substitution_and_SQL_Injection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserClass 
{
	@Id
	private int userId;
	private String userName;
	
	
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
