package com.example.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10);

        assertEquals(10, list.size());
    }

    @Test
    public void test_multipleReturns() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10).thenReturn(20);

        assertEquals(10, list.size());
        assertEquals(20, list.size());
    }

    @Test
    public void testGetSpeficParameter() {
        List list = mock(List.class);
        when(list.get(0)).thenReturn("SomeString");

        assertEquals("SomeString", list.get(0));
        assertEquals(null, list.get(1));
    }

    @Test
    public void testGetGenericParameter() {
        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn("SomeString");

        assertEquals("SomeString", list.get(0));
        assertEquals("SomeString", list.get(1));
    }
}
