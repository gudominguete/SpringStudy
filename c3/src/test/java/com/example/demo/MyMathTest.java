package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    @AfterAll
    public void after(){
        System.out.println("After");
    }


    @Test
    public void sumWith3numbers(){
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1,2,3});
        System.out.println(result);
        assertEquals(6, result);
    }

    @Test
    public void sumWith1numbers(){
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        System.out.println(result);
        assertEquals(3, result);
    }
}
