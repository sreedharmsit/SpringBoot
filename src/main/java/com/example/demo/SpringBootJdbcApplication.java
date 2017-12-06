package com.example.demo;



import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate; 




@SpringBootApplication  
public class SpringBootJdbcApplication { 
	
	
	
	
	public static void main(String[] args) {  
		SpringApplication.run(SpringBootJdbcApplication.class, args);  
	}  
}  
