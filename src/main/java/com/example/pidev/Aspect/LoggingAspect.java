package com.example.pidev.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Aspect
@Component
@Slf4j

public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.pidev.controllers.OffreController.addOffre(..))")
    public void logAddOffreMethodCall(JoinPoint joinPoint) {
        logger.info("Calling addOffre method");
        Object[] args = joinPoint.getArgs();
        if (args.length > 0) {
            logger.info("Arguments: " + Arrays.toString(args));
        }
    }

    @AfterReturning(pointcut = "execution(* com.example.pidev.controllers.OffreController.addOffre(..))",
            returning = "result")
    public void logAddOffreMethodReturn(JoinPoint joinPoint, Object result) {
        logger.info("addOffre method returned: " + result);
    }
}
