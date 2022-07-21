package com.example.demo.cdi;

import org.springframework.stereotype.Component;

@Component
public class SomeCDIDAO {

    public int[] getData(){
        return new int[] {5, 89, 100};
    }
}
