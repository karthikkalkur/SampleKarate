package com.karthik.SampleKarate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleKarateApplication {

	public static void main(String[] args) {
		System.out.println("Inside main");
		SpringApplication.run(SampleKarateApplication.class, args);
	}

}
