package com.springboot.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
*/

@SpringBootApplication(scanBasePackages = {"com.springboot"})
public class SpringBootRestApplication {
       public static void main(String[] args) {
              SpringApplication.run(SpringBootRestApplication.class, args);
       }
}