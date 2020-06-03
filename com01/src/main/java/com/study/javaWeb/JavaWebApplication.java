package com.study.javaWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JavaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebApplication.class, args);
	}

}
