package com.example.demo.courses.controller;

import com.example.demo.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1L," Learn MicroServices", "In28minutes"),
                new Course(2L," Learn Full Stack with Angular", "In28minutes"));
    }

    @GetMapping("/courses/1")
    public Course getCourse(){
        return new Course(2L," Learn MicroServices teste", "In28minutes");
    }
}
