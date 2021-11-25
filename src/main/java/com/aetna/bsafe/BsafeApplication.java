package com.aetna.bsafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BsafeApplication {


	int sum(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		SpringApplication.run(BsafeApplication.class, args);
	}

}
