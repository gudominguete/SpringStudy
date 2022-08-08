package com.example.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* com.example.springaop.aspect.CommentJointPointConfig.dataLayerExecution())",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("Intercepted Method Calls after returning {}", joinPoint);
        logger.info("returning {}", result);
    }

    @AfterThrowing(
            value = "execution(* com.example.springaop.aspect.CommentJointPointConfig.dataLayerExecution())",
            throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("Intercepted Method Calls after  exception{}", joinPoint);
        logger.info("returning {}", exception);
    }

    @After(value = "execution(* com.example.springaop.aspect.CommentJointPointConfig.dataLayerExecution())")
    public void after(JoinPoint joinPoint){
        logger.info("Intercepted Method Calls after {}", joinPoint);
    }
}
