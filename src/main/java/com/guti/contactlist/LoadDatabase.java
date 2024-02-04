package com.guti.contactlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(ContactRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Contact("Batman", "ciudadgotica@gmail.com")));
			log.info("Preloading " + repository.save(new Contact("Joker", "cuidadoconmigo@hotmail.com")));
		};
	}
}