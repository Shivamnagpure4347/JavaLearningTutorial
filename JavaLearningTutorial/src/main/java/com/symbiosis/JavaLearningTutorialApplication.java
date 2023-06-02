package com.symbiosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.symbiosis","com.controller","com.service","com.dao","com.model"})
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")
public class JavaLearningTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLearningTutorialApplication.class, args);
	}

}
