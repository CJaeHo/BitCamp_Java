package day0315;

import java.util.Scanner;

public class Ex10Operator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// 3과목의 점수를 입력받아 합계와 평균을 출력하고
		// 과락이 없고 평균이 60점 이상이면 "합격"
		// 그렇지 않으면 "불합격" 처리하시오.
		
		int java, html, oracle;
		int sum;
		double avg;
		String msg;
		
		System.out.println("java, html, oracle의 점수를 순서대로 입력하세요 : ");
		java=sc.nextInt();
		html=sc.nextInt();
		oracle=sc.nextInt();
		
		// 합계, 평균 구하기
		
		sum = java + html + oracle;
		avg = sum/3.0;	// 3.0으로 적은 이유 : 묵시적 형변환
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %6.2f\n",avg);
		
//		msg=java < 40 || html < 40 || oracle < 40? "불합격":avg >= 60? "합격":"불합격";
//		System.out.println(msg);	내가한거
		
		// 조건
		boolean a = java >=40 && html >= 40 && oracle >= 40 && avg>=60;
		
		// if문
		if(a)
			msg = "합격!!";
		else
			msg = "불합격ㅠㅠ";
		System.out.println(msg);

		
		// 조건연산자
		msg = a?"합격":"불합격";
		System.out.println(msg);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
