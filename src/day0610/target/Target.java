package day0610.target;

import org.springframework.stereotype.Component;

@Component
public class Target {
	
	public void method() {
		System.out.println("��ȯ��, �Ű����� ���� ����ó�� method");
	}
	
	public void method(String temp) {
		System.out.println("��ȯ�� ����, �Ű����� String�� ����ó�� method");
	}
	
	public String method2() {
		System.out.println("��ȯ�� �ְ�, �Ű����� ���� ����ó�� method");
		
		return "";
	}
	
	public String method2(String temp) {
		System.out.println("��ȯ�� �ְ�, �Ű����� �ִ� ����ó�� method");
		
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
