package day0610.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0610.target.BusinessLogic;

public class Run {

	public static void main(String[] args) {
		
		//1. Spring Container ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("day0610/run/applicationContext.xml");
		
		//2. bean 
		BusinessLogic bl=ac.getBean(BusinessLogic.class);
		
		//3. bean���� �����ϴ� ���������� ���
		bl.mail();
		
		//4.Spring container�ݱ�
		if(ac!=null) {
			((ClassPathXmlApplicationContext)ac).close();
		}
		
	}

}
