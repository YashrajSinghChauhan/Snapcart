package com.snapcart.utils;
import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.snapcart.Entity.User;
public class UserJsonLoadUtility {
    private static UserJsonLoadUtility jsonLoad = null;
    private static final Logger  LOGGER =LoggerFactory.getLogger(UserJsonLoadUtility.class);
    private static List<User> users = null;
	private UserJsonLoadUtility() {
	}
	public static UserJsonLoadUtility getInstance() {
		if(null == jsonLoad)
		{
			return new UserJsonLoadUtility();
		}
		return jsonLoad;
	}
	
	public static List<User> loaduser()
	{
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			users  =objectMapper.readValue(new File("src/main/resources/users.json"), new TypeReference<List<User>>() {});
		    LOGGER.warn("Successfully loaded users : ",users!=null?users.size():0);
		    users.forEach(System.out::println);
		}catch(Exception e)
		{
			LOGGER.error("Error in loading users ",e);
		}
		return users;
	}
	
	

}
