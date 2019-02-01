package com.wordpress.babuwant2do.microservice.nameserver.nameservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NameServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameServerEurekaApplication.class, args);
	}

}

