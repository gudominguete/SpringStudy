package com.example.springaop.business;

import com.example.springaop.data.Data1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Data1 data1;

    public String calculateSomething(){
        return data1.retrieveSomething();
    }
}
