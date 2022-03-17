package day0317;

import java.util.Scanner;

public class Ex1MunJe2 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int rnd, num;
		char stop;
		// 1 ~ 100사이의 난수 발생
		rnd=(int)(Math.random()*100)+1;
		
		Exit:
		while(true) {
			
			
			System.out.print(++cnt+":");
			num=Integer.parseInt(sc.nextLine());
			
			if(num > rnd) {
				System.out.println("\t"+num+"보다 작습니다");
			}
			else if (num < rnd) {
				System.out.println("\t"+num+"보다 큽니다");
			}
			else {
				System.out.println("맞았어요!!! 정답은 "+rnd+"입니다");
				System.out.println("계속하시려면 y를, 그만하시려면 n을 눌러주세요");
				System.out.println(" y or n ");
				stop=sc.nextLine().charAt(0);
				if(stop == 'y' || stop == 'Y') {
					System.out.println("새로운 숫자를 정했습니다.");
					cnt=0;
					continue Exit;
				}
				else if(stop == 'n' || stop == 'N') {
					System.out.println("프로그램을 종료합니다.");
					break Exit;
				}
				
			}
			if(cnt>=10) {
				System.out.println("\t== 시간초과!!! 종료합니다 ==");
				break ;	// while문만 나가는 명령어. 아예 끝내는 명령어가 따로 있음.
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
