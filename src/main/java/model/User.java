package model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Collection;

@Entity(name="users")
public class User implements UserDetails {

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Size(min = 3, max = 30)
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Size(min = 3, max = 30)
	@Column(name = "last_name")
	private String lastName;

	@NotNull
	@Digits(integer = 5, fraction = 4)
	@Id
	@Column(name = "username")
	private String username;

	@NotNull
	@Column(name ="password")
	private String password;




	public User(){}
		
	public User(int id,String firstName, String lastName, String username, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id" + id +"firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + "]";
	}


}

