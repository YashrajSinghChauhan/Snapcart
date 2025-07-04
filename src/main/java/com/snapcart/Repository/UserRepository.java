package com.snapcart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.snapcart.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

	

}
