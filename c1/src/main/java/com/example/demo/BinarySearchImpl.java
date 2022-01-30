package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlg sortAlg;

    public BinarySearchImpl(SortAlg sortAlg){
        super();
        this.sortAlg = sortAlg;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = sortAlg.sort(numbers);
        System.out.println(sortAlg);
        //Search the array
        return 1;
    }

}
