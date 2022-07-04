package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlg implements SortAlg {
    public int[] sort(int[] numbers){
        return numbers;
    }
}
