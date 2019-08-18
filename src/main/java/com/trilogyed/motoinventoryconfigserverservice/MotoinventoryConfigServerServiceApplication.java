package com.trilogyed.motoinventoryconfigserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MotoinventoryConfigServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoinventoryConfigServerServiceApplication.class, args);
	}

}
