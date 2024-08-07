package com.nivesha.tutoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nivesha.tutoring")
public class TutoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoringApplication.class, args);
	}

}
