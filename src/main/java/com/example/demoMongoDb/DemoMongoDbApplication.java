package com.example.demoMongoDb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoMongoDbApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoMongoDbApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoMongoDbApplication.class, args);
		
			logger.info("this is a info message main------------");
			logger.warn("this is a warn message main------------");
			logger.error("this is a error message main------------");
		}

}
