package com.snapcart.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

@Configuration
@EnableWebSecurity
public class SerucityConfig {

	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception
	{
//		http.authorizeHttpRequests(
//				(authorizeRequests) -> authorizeRequests
////				.requestMatchers("/").permitAll()
////				.requestMatchers("/products/all").permitAll()
////				.requestMatchers("/users/load/all").permitAll()
////				.requestMatchers("/users/get").permitAll(
////						).anyRequest().authenticated())
//	
//		.httpBasic(Customizer.withDefaults());

		return http.build();

		
	} 

	

}
