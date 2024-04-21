package com.example.Cymru;

import com.example.Cymru.notes.CarClass;
import com.example.Cymru.notes.CarInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CymruApplication implements ApplicationRunner {
	///Dependency Injection Example
//	@Qualifier("carClass2")
//	@Autowired
	CarInterface car;

	public CymruApplication(@Qualifier("carClass") CarInterface car){
		this.car=car;
	}
	public static void main(String[] args) {
		SpringApplication.run(CymruApplication.class, args);
	}
	public void run(ApplicationArguments args){
		System.out.println("calling function");
		System.out.println(car.print("wordd"));
	}
}
