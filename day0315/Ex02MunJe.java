package day0315;

import java.util.Scanner;

public class Ex02MunJe {

	public static void main(String[] args) {


//		[문제 2] Ex2Munje
//		3개의 숫자 a,b,c 를 입력받아 가장 큰수를 출력하시오(조건 연산자 이용)

		
		Scanner sc = new Scanner(System.in);
		
		
		int a, b, c;
		int numA, numB, numC;
		int bigNum;
		
//		System.out.println("값이 다른 정수 3개를 입력하시오.");
//		a=sc.nextInt();
//		b=sc.nextInt();
//		c=sc.nextInt();
//		
//		numA = a > b && a > c?a:b;
//		numB = b > a && b > c?b:c;
//		numC = c > a && c > b?c:a;
//			
//		bigNum = a > b && a > c?numA:b > a && b > c?numB:numC;
//		System.out.printf("%d, %d, %d중 가장 큰수는 %d",numA, numB, numC, bigNum);
		
		
		// 같은 정수도 커버 가능
		System.out.println("정수 3개를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
//		bigNum = a >= b && a >= c?a:b >= c?b:c;
		bigNum = (a >= b ? a : b) >= c ? (a >= b ? a : b) : c;
		
		System.out.printf("%d, %d, %d중 가장 큰수는 %d",a, b, c, bigNum);
		
		
		
		// 해설
//		bigNum = (a >= b ? a : b) >= c ? (a >= b ? a : b) : c;
//					   a or b     >= c ?       (a or b) : c;
//					   
//					     a    >=    c ?    a   : c; ==== a
//					     b    >=    c ?    b   : c; ==== b
//					   a or b >=    c ?  a or b: c; ==== c
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
