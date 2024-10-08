package com.Receptor.back_Receptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BackReceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackReceptorApplication.class, args);
	}

}
