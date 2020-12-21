package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Issues;
import com.example.demo.repository.BugTrackerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private BugTrackerRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Issues(101,"Issue with imports","Unused Imports causing Errors","Trip-Data-Service","Low","Minor","Pranjal"));
				repo.save(new Issues(102,"Issue with Post Method","Post Method not implemented properly","Blood-Donors-Service","Medium","Major","Arjun"));
				repo.save(new Issues(103,"Connection Issue","Connection to DataBase Check","Cab-Driver-Rest-API","High","Critical","Rahul"));
				repo.save(new Issues(104,"Exception not handled","Unhandled Exceptions, add appropriate code to handle it","InvocieService-JAX-RS","Medium","Major","Radhay"));
				repo.save(new Issues(105,"Configuration Server Issue","Check if the configuration Server is running","Trip-Data-Service-Client","High","Critical","Sundar"));

				
			}
			
		};
	}
	
	
}
