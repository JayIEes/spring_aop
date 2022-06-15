package day0610.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestPointCut {
	
	//public void method()�� ȣ��� ���� advice ����
	//@Before("execution(public void method())")
	//public void method(String)ȣ��� ���� advice ����
	//@Before("execution(public void method(String))")
	//public String method2()ȣ��� ���� advice ����
	//@Before("execution(public String method2())")
	//public String method2(String)ȣ��� ���� advice ����
	//@Before("execution(public String method2(String))")
	//target Ŭ������ �Ű������� String �ִ� ��� method�� ȣ��� �� advice����
	//@Before("execution(public * *(String))")
	//target Ŭ������ ��ȯ���� String�� ��� method�� ȣ��� �� advice����
	//@Before("execution(String *(..))")
	//target Ŭ������ ��� method�� ȣ��� �� advice����
	//@Before("execution(* *(..))")
	//target Ŭ������ etter method�� ȣ��� �� advice����
	@Before("execution(* get*())")
	public void advice() {
		System.out.println("-------------advice");
	}
	
}
