package com.example.demo.cdi;

import com.example.demo.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes=BasicApplication.class)
public class SomeCDIBusinessTest {

    @InjectMocks
    SomeCDIBusiness someCDIBusiness;

    @Mock
    SomeCDIDAO daoMock;

    @Test
    public void testBasicScenario(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        int result = someCDIBusiness.findGreatest();
        assertEquals(4, result);
    }
    @Test
    public void testBasicScenario2(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        int result = someCDIBusiness.findGreatest();
        assertEquals(Integer.MIN_VALUE, result);
    }
}
