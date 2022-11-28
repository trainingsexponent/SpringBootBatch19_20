package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

	@Value(value = "${output.message}")
	private String msg;
	
	@Profile(value = "uat")
	@Bean
	public String getData() {
		System.out.println("UAT"+ msg);
		return msg+"Ust Check";
	}
	
	
	@Profile(value = "test")
	@Bean
	public String gettest() {
		System.out.println("TEST"+ msg);
		return msg+"Test Check";
	}
}
