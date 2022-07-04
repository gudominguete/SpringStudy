package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSortAlg implements SortAlg {
    public int[] sort(int[] numbers){
        return numbers;
    }
}
