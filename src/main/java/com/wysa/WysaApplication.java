package com.wysa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.wysa.controller.WysaController;

@SpringBootApplication
@ComponentScan(basePackages="com.wysa")
public class WysaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WysaApplication.class, args);
	}

}
