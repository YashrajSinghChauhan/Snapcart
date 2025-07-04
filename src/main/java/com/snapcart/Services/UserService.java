package com.snapcart.Services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.snapcart.Entity.User;
import com.snapcart.Repository.UserRepository;
import com.snapcart.utils.UserJsonLoadUtility;

@Service
public class UserService implements UserDetailsService {
	private final UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public List<User> getAllUsers() {
		return this.userRepo.findAll();
	}

	public List<User> loadAllUsersfromJSON() {
		List<User> list = UserJsonLoadUtility.getInstance().loaduser();
		return list;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
