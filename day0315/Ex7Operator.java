package day0315;

import java.util.Scanner;

public class Ex7Operator {

	public static void main(String[] args) {


		// 산술연산자 : +, -, *, /, %
		// 급여를 입력 후 만원, 천원, 백원, 십원, 일원의 갯수를 구분하여 출력하시오.
		
		int money;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여를 입력하세요 : ");
		money = sc.nextInt();
		
		System.out.println("나의 월급여 : "+money+"원");
		//123 4 5 6 7
			
		System.out.println("만원의 갯수 : " + money/10000 + "장");
		System.out.println("천원의 갯수 : " + (money%10000)/1000 + "장");
		System.out.println("백원의 갯수 : " + (money%1000)/100 + "개");
		System.out.println("십원의 갯수 : " + (money%100)/10 + "개");
		System.out.println("일원의 갯수 : " + (money%10)/1 + "개");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
