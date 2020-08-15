package com.komegunov.checkcrnvirus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CheckCrnvirusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckCrnvirusApplication.class, args);
	}

}
