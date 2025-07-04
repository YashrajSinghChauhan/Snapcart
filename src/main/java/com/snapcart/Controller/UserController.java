package com.snapcart.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snapcart.Entity.User;
import com.snapcart.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	 private final UserService userService;
	public UserController(UserService userService) {
		// TODO Auto-generated constructor stub
		this.userService = userService;
	}
	@GetMapping("/get")
	public String getUser()
	{
		return "Hi , This is Yash. Project is Up and Running.";
	}

	  @GetMapping("/get/all")
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }
	  
	  @GetMapping("/load/all")
	    public List<User> loadAllUser() {
	        return userService.loadAllUsersfromJSON();
	    }
	 
}
