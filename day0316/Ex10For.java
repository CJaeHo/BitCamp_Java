package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		
		
		
//		1. 지수승 구하기
//		2. 숫자 n까지의 합계 구하기
//		3. 숫자 n까지의 팩토리알 구하기
//		4. 종료
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		while(true) {
			
			System.out.println("1. 지수승 구하기");
			System.out.println("2. 숫자 n까지의 합계 구하기");
			System.out.println("3. 숫자 n까지의 팩토리알 구하기");
			System.out.println("4. 종료");
			
			menu=sc.nextInt();
			// 4일 경우 종료
			if(menu ==4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			switch(menu){
			case 1:{
				int x,y,r=1;
				System.out.println("지수승을 구할 x,y 두 숫자를 입력하세요");
				x=sc.nextInt();
				y=sc.nextInt();
				for(int i=1;i<=y;i++) {
					r*=x;
				}
				System.out.println(x+"의 "+y+"승은 "+r+"입니다");
			}
				break;
			case 2:{
				int x,y,r=0;
				System.out.println("숫자들 사이의 합을 구할 x,y 두 숫자를 입력하세요");
				x=sc.nextInt();
				y=sc.nextInt();
				if (x >= y) {
					for(int i=y;i<=x;i++) {
						r+=i;
					}	
				}
				else
					for(int i=x;i<=y;i++) {
						r+=i;
					}
				System.out.println(x+"와 "+y+"사이 숫자들의 합은 "+r+"입니다");
			}
				break;
			case 3:{
				int x,r=1;
				System.out.println("팩토리알을 구할 숫자를 적어주세요");
				x=sc.nextInt();
				for(int i=x;i>=1;i--) {
					r*=i;
				}
				System.out.println(x+"의 팩토리알 값은 "+r+"입니다");
			}
				break;
			default:
				System.out.println("\n잘못 입력하셨습니다\n메뉴를 다시 선택해주세요\n");
			}
		}
	}

}
