package com.example.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {


    @Test
    public void testFindTheGreatestFromAllData(){
        DataService mockService = mock(DataService.class);

        when(mockService.retriveAllData()).thenReturn(new int[]{ 24,15,3});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(mockService);
        int result = someBusiness.findGreatestFromAllData();
        assertEquals(result, 24);
    }

    @Test
    public void testFindTheGreatestOneData(){
        DataService mockService = mock(DataService.class);

        when(mockService.retriveAllData()).thenReturn(new int[]{ 24});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(mockService);
        int result = someBusiness.findGreatestFromAllData();
        assertEquals(result, 24);
    }
}