package com.prod.event.springbootpoc;

import com.prod.event.api.EventController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = EventController.class)
public class SpringBootPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPocApplication.class, args);
	}

}
