package day0610.target;

import org.springframework.stereotype.Component;


/**
 * @author user
 * 공통 로직이 제거된 업무로직만을 정의하는 클래스
 */
@Component
public class BusinessLogic {
	
	
	public void mail() {
		System.out.println("메일을 확인하는 업무");
	}
	
	
}
