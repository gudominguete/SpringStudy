package com.example.database.databasedemo.jdbc;

import com.example.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll(){
        return jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper(Person.class));
    }

    public Person findById(int id){
        return (Person) jdbcTemplate.queryForObject("SELECT * FROM person where id=?", new Object[]{id},
                new BeanPropertyRowMapper(Person.class));
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete FROM person where id=?", new Object[]{id});
    }
}
