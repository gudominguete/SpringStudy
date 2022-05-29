package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlg quickSortAlg;


    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = quickSortAlg.sort(numbers);
        System.out.println(quickSortAlg);
        //Search the array
        return 1;
    }

}
