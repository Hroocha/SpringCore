package com.example.springlearning;

import com.example.springlearning.lesson13.AppConfig;
import com.example.springlearning.lesson13.Cart;
import com.example.springlearning.lesson13.OrderService;
import com.example.springlearning.lesson13.ProductService;
import com.example.springlearning.lesson13.service.TestSpringCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class SpringLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);

		TestSpringCore testSpringCore = new TestSpringCore();
		testSpringCore.do_something();

	}



}
