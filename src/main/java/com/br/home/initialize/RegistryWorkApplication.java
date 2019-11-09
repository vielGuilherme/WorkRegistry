package com.br.home.initialize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages={"com.br.home.controller"})
public class RegistryWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryWorkApplication.class, args);
	}

}
