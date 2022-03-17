package day0317;

import java.util.Scanner;

public class Ex1MunJe {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int rnd, num;
		
		// 1 ~ 100사이의 난수 발생
		rnd=(int)(Math.random()*100)+1;
		

		while(true) {
			
			
			System.out.print(++cnt+":");
			num=sc.nextInt();
			
			if(num > rnd) {
				System.out.println("\t"+num+"보다 작습니다");
			}
			else if (num < rnd) {
				System.out.println("\t"+num+"보다 큽니다");
			}
			else {
				System.out.println("맞았어요!!! 정답은 "+rnd+"입니다");
				System.out.println("프로그램을 종료합니다");
				break;
			}
			if(cnt>=10) {
				System.out.println("\t== 시간초과!!! 종료합니다 ==");
				break;	// while문만 나가는 명령어. 아예 끝내는 명령어가 따로 있음.
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
