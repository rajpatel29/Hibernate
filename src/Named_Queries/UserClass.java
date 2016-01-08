package Named_Queries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "UserClass.byId", query = "From UserClass where userId > ?")
@NamedNativeQuery(name = "UserClass.byName", query = "select * from USER_CLASS where User_Name = ? " , resultClass = UserClass.class )
@Table(name = "USER_CLASS")
public class UserClass 
{
	@Id
	private int userId;
	@Column(name = "User_Name")
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
