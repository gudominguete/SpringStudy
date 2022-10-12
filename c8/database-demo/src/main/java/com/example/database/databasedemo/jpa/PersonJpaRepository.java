package com.example.database.databasedemo.jpa;

import com.example.database.databasedemo.entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    // connect to database
    public Person findById(int id){
        return entityManager.find(Person.class, id);
    }
}
