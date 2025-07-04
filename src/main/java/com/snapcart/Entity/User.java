package com.snapcart.Entity;
import java.util.Collection;



import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String mobile;
	    private String password;
	    public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		// Getters & Setters
	    public Long getId() {
	    	return id; 
	    }
	    public void setId(Long id) { 
	    	this.id = id; 
	    }

	    public String getName() {
	    	return name; 
	    }
	    public void setName(String name) {
	    	this.name = name; 
	    }

	    public String getEmail() {
	    	return email; 
	    }
	    public void setEmail(String email)
	    { 
	    	this.email = email; 
	    }
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
	
	

}
