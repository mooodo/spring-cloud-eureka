/*
 * Created by 2020-05-03 19:30:02 
 */
package com.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fangang
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
