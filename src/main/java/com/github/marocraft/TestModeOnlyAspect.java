package com.github.marocraft;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author alexec (alex.e.c@gmail.com)
 */
@Aspect
public class TestModeOnlyAspect {
	@Pointcut("@annotation(testModeOnly)")
	public void testModeOnlyMethods(TestModeOnly testModeOnly) {
	}

	@Around("testModeOnlyMethods(testModeOnly)")
	public Object testModeOnly(ProceedingJoinPoint joinPoint,TestModeOnly testModeOnly) throws Throwable {
		System.out.println("class name: "+joinPoint.getClass().getName());
		System.out.println("methodeName: "+joinPoint.getSignature().getName());
		return joinPoint.proceed();
	}
}
