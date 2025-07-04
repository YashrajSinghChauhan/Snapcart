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
		  http
          .authorizeHttpRequests(auth -> auth
              .requestMatchers("/h2-console/**").permitAll()
              .anyRequest().authenticated()
          )
          .csrf(csrf -> csrf
              .ignoringRequestMatchers("/h2-console/**")
          )
          .headers(headers -> headers
              .frameOptions().sameOrigin() // 🔐 Allows iframe for H2 Console
          )
          .formLogin();

      return http.build();
		//return http.build();

		
	} 

	

}
