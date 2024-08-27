package io.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hi");
		System.out.println("hello");
		for(int i=0;i<5;i++){
			System.out.println("testing");
		}
		for(int i=0;i<5;i++){
			System.out.println("test");
		}
		System.out.println("Hi");
		System.out.println("testing");
		System.out.println("Hi");
		System.out.println("testing");
	}

}
