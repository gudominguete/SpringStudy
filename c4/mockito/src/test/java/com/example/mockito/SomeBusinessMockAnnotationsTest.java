package com.example.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatestFromAllData(){

        when(dataService.retriveAllData()).thenReturn(new int[]{ 24,15,3});

        int result = someBusiness.findGreatestFromAllData();
        assertEquals(result, 24);
    }

    @Test
    public void testFindTheGreatestOneData(){

        when(dataService.retriveAllData()).thenReturn(new int[]{ 24});

        int result = someBusiness.findGreatestFromAllData();
        assertEquals(result, 24);
    }
}