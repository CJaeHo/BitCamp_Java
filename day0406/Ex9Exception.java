package day0406;

import java.util.Date;

public class Ex9Exception {

	public static void main(String[] args) {
		
		Date date=null;
		
		int year=0;
		try {
			year=date.getYear()+1900;			
		}catch(NullPointerException e) {
			System.out.println("객체가 생성이 안됨:"+e.getMessage());
			date=new Date();
			year=date.getYear()+1900;
		}finally {
			System.out.println("*** 여기는 무조건 실행되는 영역 finally임 ***");
			System.out.println("지금은 "+year+"년도 입니다");	// initialized = 초기화
		}
		
		System.out.println("*** 정 상 종 료 됨 ***");

	}

}
