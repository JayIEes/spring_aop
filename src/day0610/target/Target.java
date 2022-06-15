package day0610.target;

import org.springframework.stereotype.Component;

@Component
public class Target {
	
	public void method() {
		System.out.println("반환형, 매개변수 없는 업무처리 method");
	}
	
	public void method(String temp) {
		System.out.println("반환형 없고, 매개변수 String인 업무처리 method");
	}
	
	public String method2() {
		System.out.println("반환형 있고, 매개변수 없는 업무처리 method");
		
		return "";
	}
	
	public String method2(String temp) {
		System.out.println("반환형 있고, 매개변수 있는 업무처리 method");
		
		return "";
	}
	
	public String getName() {
		System.out.println("getName method");
		return "";
	}
	
	public String getAge() {
		System.out.println("getAge method");
		return "";
	}
	
}
