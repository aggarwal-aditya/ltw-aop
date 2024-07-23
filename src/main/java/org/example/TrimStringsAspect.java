package org.example;

import org.example.TrimStrings;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrimStringsAspect {

    @Around("@annotation(trimStrings)")
    public Object trimStringParameters(ProceedingJoinPoint joinPoint, TrimStrings trimStrings) throws Throwable {
        System.out.println("oho");
        Object[] args = joinPoint.getArgs();

        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof String) {
                args[i] = ((String) args[i]).trim();
            }
        }

        return joinPoint.proceed(args);
    }
}
