package com.juegodedados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.juegodedados.model")

public class JuegodedadosApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JuegodedadosApplication.class, args);
	}

}
