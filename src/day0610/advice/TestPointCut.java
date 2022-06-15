package day0610.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestPointCut {
	
	//public void method()가 호출될 때만 advice 동작
	//@Before("execution(public void method())")
	//public void method(String)호출될 때만 advice 동작
	//@Before("execution(public void method(String))")
	//public String method2()호출될 때만 advice 동작
	//@Before("execution(public String method2())")
	//public String method2(String)호출될 때만 advice 동작
	//@Before("execution(public String method2(String))")
	//target 클래스의 매개변수가 String 있는 모든 method가 호출될 때 advice동작
	//@Before("execution(public * *(String))")
	//target 클래스의 반환형이 String인 모든 method가 호출될 때 advice동작
	//@Before("execution(String *(..))")
	//target 클래스의 모든 method가 호출될 때 advice동작
	//@Before("execution(* *(..))")
	//target 클래스의 etter method가 호출될 때 advice동작
	@Before("execution(* get*())")
	public void advice() {
		System.out.println("-------------advice");
	}
	
}
