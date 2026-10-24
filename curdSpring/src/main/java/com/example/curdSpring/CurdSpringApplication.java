package com.example.curdSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguratiion.class})



public class CurdSpringApplication {

	public static void main(String[] args) {

        SpringApplication.run(CurdSpringApplication.class, args);

        System.out.println("Radhe Radhe");
	}

}
