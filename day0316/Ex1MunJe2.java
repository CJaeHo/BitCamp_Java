package day0316;

import java.util.Scanner;

public class Ex1MunJe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=0, ran;
		int rnd;
		rnd = (int)(Math.random()*100)+1;
		System.out.println("1 ~ 100까지 숫자 중 임의의 숫자를 정했습니다.");
		System.out.println("'Up & Down' 게임을 시작합니다.");
		System.out.println("********************************");
		System.out.println("숫자를 입력해주세요.");
		
//		while(true) {
//			
//			ran = (int)(Math.random()*100)+1;
//					
//			cnt++;
//			
//			if(rnd == ran) {
//				System.out.println(cnt+"번째 : "+ran);
//				System.out.println("맞았어요!!! 정답은 "+rnd+"입니다" );
//				break;
//			}else if(rnd <= ran) {
//				System.out.println(cnt+"번째 : "+ran);
//				System.out.println(ran+"보다 작습니다");
//				if(cnt == 10) {
//					System.out.println("시간초과!!");
//					break;
//				}
//				continue;
//			}else {
//				System.out.println(cnt+"번째 : "+ran);
//				System.out.println(ran+"보다 큽니다");
//				if(cnt == 10) {
//					System.out.println("시간초과!!");
//					break;
//				}
//				continue;
//			}
//			
//		}
//		System.out.println("프로그램을 종료합니다");
		
		
		while(true) {
			
			System.out.println("");
			ran=sc.nextInt();
			
			cnt++;

			if(rnd == ran) {
				System.out.println(cnt+"번째 : "+ran);
				System.out.println("맞았어요!!! 정답은 "+rnd+"입니다" );
				break;
			}else if(rnd <= ran) {
				System.out.println(cnt+"번째 : "+ran);
				System.out.println(ran+"보다 작습니다");
				if(cnt == 10) {
					System.out.println("시간초과!!");
					break;
				}
				continue;
			}else {
				System.out.println(cnt+"번째 : "+ran);
				System.out.println(ran+"보다 큽니다");
				if(cnt == 10) {
					System.out.println("시간초과!!");
					break;
				}
				continue;
			}

		}
		System.out.println("프로그램을 종료합니다");
	}

}
