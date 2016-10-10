package com.company.DemoSpringData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PersonApplication {
	private static final Logger log = LoggerFactory.getLogger(PersonApplication.class);

	@Bean
	public CommandLineRunner demo(PersonRepositary repository) {
		Person p = new Person();
		p.setName("Samir mitra");
		p.setCountry("America");
		p.setGender("male");
		repository.save(p);
		log.info("Person created" + p);
		return null;
	}

	public static void main(String[] args) {
		//https://dzone.com/articles/spring-data-series-spring-data-in-nutshell?edition=220225
		SpringApplication.run(PersonApplication.class, args);
	}
}