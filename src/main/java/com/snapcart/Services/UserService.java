package com.snapcart.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.snapcart.Entity.User;
import com.snapcart.Repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	  public List<User> getAllUsers() {
	        return this.userRepo.findAll();
	    }

}
