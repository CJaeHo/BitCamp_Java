package day0315;

import java.util.Scanner;

public class Ex01MunJe {

	public static void main(String[] args) {


//		[문제1] Ex1Munje
//		   상품명과 갯수,금액을 입력받아 계산해야할 
//		   총 금액을 출력하는데
//		  만약 5개 이상일경우 총금액의 10프로를 디씨한 금액으로 출력하시오(if문)

		
		Scanner sc = new Scanner(System.in);
		
		String food;
		int price, num;
		int sum;
		double won;
		
		System.out.println("음식의 상품명을 적으시오");
		food = sc.nextLine();
		
		System.out.println("갯수를 적으시오");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("상품의 가격을 적으시오");
		price = Integer.parseInt(sc.nextLine());
		
		
		sum = price * num;
		won = sum - (sum / 10.0);
		
		if (num >= 5) {
			System.out.printf("금액은 %d원 입니다.\n", (int)(won-(won%10)));
		}
		else 
			System.out.println("금액은 "+sum+"원 입니다.");
		
		
		
	}

}
