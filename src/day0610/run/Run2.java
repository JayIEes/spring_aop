package day0610.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0610.target.BusinessLogic;
import day0610.target.Target;

public class Run2 {

	public static void main(String[] args) {
			
			//1. Spring Container 생성
			ApplicationContext ac = new ClassPathXmlApplicationContext("day0610/run/applicationContext.xml");
			
			//2. bean 
			Target t=ac.getBean(Target.class);
			
			//3. bean에서 제공하는 업무로직을 사용
			t.method();
			t.method("포인트컷");
			t.method2();
			t.method2("pointcut");
			t.getName();
			t.getAge();
			
			//4.Spring container닫기
			if(ac!=null) {
				((ClassPathXmlApplicationContext)ac).close();
			}
	}

}
