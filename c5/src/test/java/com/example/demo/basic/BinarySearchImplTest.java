package com.example.demo.basic;

import com.example.demo.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=BasicApplication.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(5, result);
    }
}
