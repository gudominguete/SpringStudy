package com.example.database.databasedemo.entity;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String date;
    private Date birthDate;

    public Person() {
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public Person(int id, String name, String date, Date birthDate) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
