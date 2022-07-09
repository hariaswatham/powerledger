package com.interview.powerledger.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.interview.powerledger")
@EnableJpaRepositories(basePackages = "com.interview.powerledger.repository")
@EntityScan("com.interview.powerledger.model")
public class PowerLedgerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PowerLedgerApplication.class, args);
	}
}
