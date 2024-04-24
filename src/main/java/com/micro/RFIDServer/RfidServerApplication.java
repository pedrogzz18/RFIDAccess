package com.micro.RFIDServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RfidServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RfidServerApplication.class, args);
	}

}
