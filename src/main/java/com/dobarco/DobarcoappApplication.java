package com.dobarco;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.dobarco.controllers"})
public class DobarcoappApplication {
	public static void main(String[] args) {
		SpringApplication.run(DobarcoappApplication.class, args);
	}
}
