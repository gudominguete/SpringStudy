package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommentJointPointConfig {
    @Pointcut("execution(* com.example.springaop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.example.springaop.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("execution(* com.example.springaop.aspect.CommentJointPointConfig.*())")
    public void allLayerExecution(){}

    @Pointcut("bean(*data*)")
    public void beanContainsWithData(){};

    @Pointcut("within(com.example.springaop.data.*.*)")
    public void dataLayerExecutionWithWithin(){};

    @Pointcut("@annotation(com.example.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){};
}
