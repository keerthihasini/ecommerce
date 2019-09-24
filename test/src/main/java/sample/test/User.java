package sample.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String email;
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	private String userName;
	private String password;
    private int Userid;
    private String User_role;
   
   
	public String getUser_role() {
		return User_role;
	}
	public void setUser_role(String user_role) {
		User_role = user_role;
	}
public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
