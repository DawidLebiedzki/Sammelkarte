package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String first_name;
	private String last_name;
	@Column(unique = true)
	private String login;
	private String password;
	private boolean admin_rights;
	
	
	public User(){}
		
	public User(int id, String first_name, String last_name, String login, String password, boolean admin_rights) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.login = login;
		this.password = password;
		this.admin_rights = admin_rights;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin_rights() {
		return admin_rights;
	}
	public void setAdmin_rights(boolean admin_rights) {
		this.admin_rights = admin_rights;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", login=" + login
				+ ", password=" + password + ", admin_rights=" + admin_rights + "]";
	}
	
}