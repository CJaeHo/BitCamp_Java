package day0315;

import java.util.Scanner;

public class Ex8Operator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int kor;	// 국어 점수 변수
		String msg;	// 결과 메세지 변수
		
		// 국어 점수를 입력 후 90 이상이면 "Excellent!"라고 msg에 저장하기.
		// 80 이상이면 "Good!!" 저장
		// 80 미만이면 "Try!!!"라고 저장하기
		
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		// if 문으로 해보기
		
		if (kor >= 90)
			msg = "Excellent!";
		else if ( kor >= 80)
			msg = "Good!!";
		else
			msg = "Try!!!";
		System.out.println(kor+ "점" + " => " + msg);
		
		// 조건 연산자로 해보기
		msg = kor >= 90?"Excellent!":kor >= 80?"Good!!":"Try!!!";
		System.out.println(kor+ "점" + " => " + msg);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
