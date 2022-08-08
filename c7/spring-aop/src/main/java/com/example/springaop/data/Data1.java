package com.example.springaop.data;

import com.example.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Data1 {

    @TrackTime
    public String retrieveSomething(){
        return "Data1";
    }
}
