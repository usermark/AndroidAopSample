package com.github.usermark.aopsample;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by usermark on 5/11/2017.
 */
@Aspect
public class BaseAspect {

    @Pointcut("execution(* com.github.usermark.aopsample.MainActivity.on*(..))")
    public void logForActivity() {};

    @Before("logForActivity()")
    public void log(JoinPoint joinPoint) {
        Log.d("Aspect", joinPoint.toShortString()
                + " [line " + joinPoint.getSourceLocation().getLine() + "]");
    }
}
