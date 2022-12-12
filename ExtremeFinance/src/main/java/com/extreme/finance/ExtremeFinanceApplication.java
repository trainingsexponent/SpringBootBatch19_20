package com.extreme.finance;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExtremeFinanceApplication {

	private static final Logger LOGGER = Logger.getLogger(ExtremeFinanceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ExtremeFinanceApplication.class, args);
		
		LOGGER.debug("This Is Debug");
		LOGGER.info("This Is Info");
		LOGGER.error("This Is Error");
		LOGGER.fatal("This Is Fatal");
		System.out.println("--------------------");
		
	}

}
