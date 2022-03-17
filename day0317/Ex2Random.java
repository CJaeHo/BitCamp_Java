package day0317;

import java.util.Scanner;

public class Ex2Random {

	public static void main(String[] args) {
		
		
//		1번 문제에 추가하기 : 계속 이어서 다른 숫자 맞추기
		
		Scanner sc = new Scanner(System.in);
		
		int rnd,cnt,num;
		char ans;
		
		Exit:
		while(true) {

			System.out.println("** 게임을 시작합니다 **");
			cnt=0;
			rnd=(int)(Math.random()*100)+1;

			while(true) {
				
				System.out.println(++cnt+":");
				num=Integer.parseInt(sc.nextLine());	
				// Int로 받지 않은 이유는 밑에 문자를 입력받을 떄 생기는 오류를 제거하기 위함
				
				if(num > rnd)
					System.out.println("\t"+num+"보다 작습니다");
				
				else if(num < rnd)
					System.out.println("\t"+num+"보다 큽니다");
				
				else {
					System.out.println("***정답입니다. 정답은 "+rnd+" 입니다 ***");
					System.out.println("** 계속하려면 y, 그만하려면 n을 눌러주세요 **");
					ans=sc.nextLine().charAt(0);	// 문자열로 받은 후에 맨앞에 한글자만 받기
					if(ans == 'y' || ans == 'Y') {
						System.out.println("** 새로운 난수를 발생합니다 **");
						continue Exit;	// 바깥 while문의 처음으로 이동하기
					}
					else if(ans == 'n' || ans == 'N'){
						System.out.println("** 프로그램을 종료합니다 **");
						break Exit;	// 바깥 while을 빠져나가서 종료하기
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
