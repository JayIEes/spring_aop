package day0610.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author user
 * ���� �������� ����
 */
@Aspect
@Component
public class Advice {

	@After("execution(public void mail())") //pointcut�� : advice�� �����ϴ� ���ǰ� target method
	public void commonLogic() {
		System.out.println("���� ���� ����");//advice ���� �ڵ�
	}
	
}
