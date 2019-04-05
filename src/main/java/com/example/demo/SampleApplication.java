package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
@EnableAutoConfiguration
public class SampleApplication implements CommandLineRunner{
	
	@Autowired
	DataSource dataSource;
	
//	@Autowired
//	AuthenticationProvider authenticationProvider;
	
	 @Bean 
	 JdbcUserDetailsManager jdbcUserDetailsManager() {
		 JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		 
		 return jdbcUserDetailsManager;
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(""+authenticationProvider.getClass().getName());
		System.out.println("**********");
		
		
	}
	

}
