package com.extreme.finance;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExtremeFinanceApplication {

	private static final Logger LOGGER = Logger.getLogger(ExtremeFinanceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ExtremeFinanceApplication.class, args);
		LOGGER.debug("This is Debug");
		LOGGER.info("This is Info");
		LOGGER.error("This is Error");
		LOGGER.fatal("This is Fatal");
		System.out.println("----------------------------------------");
	}
}
