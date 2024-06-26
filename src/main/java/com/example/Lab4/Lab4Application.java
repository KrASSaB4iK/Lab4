package com.example.Lab4;

import model.Role;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.UserRepository;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories
public class Lab4Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}
//	@Bean
//	CommandLineRunner initDatabase(@Autowired UserRepository userRepository) {
//		return args -> {
//			userRepository.saveAll(Arrays.asList(
//					new User("Иван", "Иванов", Role.ADMIN),
//					new User("Петр", "Петров", Role.DEVELOPER),
//					new User("Сидор", "Сидоров", Role.TESTER),
//					new User("Николай", "Николаев", Role.SYSTEM_ANALYST),
//					new User("Анна", "Анохина", Role.TEAM_LEAD)
//			));
//		};
//	}

}
