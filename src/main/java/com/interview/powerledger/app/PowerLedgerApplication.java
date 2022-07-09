package com.interview.powerledger.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.interview.powerledger")
public class PowerLedgerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerLedgerApplication.class, args);
	}

}
