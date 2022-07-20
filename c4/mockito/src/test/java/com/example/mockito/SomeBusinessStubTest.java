package com.example.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessStubTest {


    @Test
    public void testFindTheGreatestFromAllData(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStup());
        int result = someBusiness.findGreatestFromAllData();
        assertEquals(result, 24);
    }
}

class DataServiceStup implements DataService {

    @Override
    public int[] retriveAllData() {
        return new int[] { 6 , 24, 12};
    }
}