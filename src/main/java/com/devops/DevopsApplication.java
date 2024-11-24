package com.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DevopsApplication {
	
	private static final Logger loggerr = LoggerFactory.getLogger(DevopsApplication.class);

	
	@PostConstruct
	public void init() {
		loggerr.info("Before Application Context Initializing");
	}

	public static void main(String[] args) {
		loggerr.info("Application Context Loading...");
		SpringApplication.run(DevopsApplication.class, args);
	}
}
