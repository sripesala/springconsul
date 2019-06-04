package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SchoolserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolserviceApplication.class, args);
	}

}
