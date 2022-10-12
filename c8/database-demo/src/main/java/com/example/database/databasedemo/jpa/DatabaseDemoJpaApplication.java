package com.example.database.databasedemo.jpa;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@SpringBootApplication
@EntityScan( basePackages = {"com.example.database.databasedemo.entity"} )
public class DatabaseDemoJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", repository.findById(10001));
//		logger.info("Delete id 10001 -> {}", dao.deleteById(10001));
//		logger.info("Inserting 10004", dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
//		logger.info("Updating 10003", dao.update(new Person(10003, "Tara", "Berlin", new Date())));
//		logger.info("All users -> {}", dao.findAll());
	}
}
