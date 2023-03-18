package com.ee4216.lab3;

import com.ee4216.lab3.dao.MovieDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Lab3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);
	}

	@Bean
	public MovieDao movieDao(JdbcTemplate jdbcTemplate) {
		return new MovieDao(jdbcTemplate);
	}

}
