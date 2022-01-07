package com.travelbooking.travelbookingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.travelbookingsystem.travelbookingsystem.services.CostumerService")
public class TravelbookingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelbookingsystemApplication.class, args);
	}

}
