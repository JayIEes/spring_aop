package day0610.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author user
 * 공통 업무로직 정의
 */
@Aspect
@Component
public class Advice {

	@After("execution(public void mail())") //pointcut식 : advice가 동작하는 조건과 target method
	public void commonLogic() {
		System.out.println("공통 업무 로직");//advice 공통 코드
	}
	
}
