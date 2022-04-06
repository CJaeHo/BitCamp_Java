package day0406;

import java.util.Scanner;

public class Ex8Exception {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int su1, su2, sum;
		System.out.println("숫자 1 입력");
		try {
			su1=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("첫번째 숫자를 잘못 입력했으므로 0으로 초기화 함");
			su1=0;
		}
		System.out.println("숫자 2 입력");
		try {
			su2=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("두번째 숫자를 잘못 입력했으므로 0으로 초기화 함");
			su2=0;
		}
		

		sum=su1+su2;
		System.out.println(su1+"+"+su2+"= "+sum);
		System.out.println("*** 정 상 종 료 됨 ***");
	}
}
