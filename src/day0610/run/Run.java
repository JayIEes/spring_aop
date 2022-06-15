package day0610.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0610.target.BusinessLogic;

public class Run {

	public static void main(String[] args) {
		
		//1. Spring Container 생성
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0610/run/applicationContext.xml");
		
		//2. bean 
		BusinessLogic bl=ac.getBean(BusinessLogic.class);
		
		//3. bean에서 제공하는 업무로직을 사용
		bl.mail();
		
		//4.Spring container닫기
		if(ac!=null) {
			((ClassPathXmlApplicationContext)ac).close();
		}
		
	}

}
