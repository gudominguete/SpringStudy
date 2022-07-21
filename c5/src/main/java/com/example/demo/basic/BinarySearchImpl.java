package com.example.demo.basic;

import com.example.demo.ScopeApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {


    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlg sortAlg;


    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = sortAlg.sort(numbers);
        //Search the array
        return 5;
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("preDestroy");
    }

}
