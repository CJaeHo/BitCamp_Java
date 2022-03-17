package day0316;
import java.util.Scanner;

public class Ex8ForGugu {

	public static void main(String[] args) {


		// 구구단 숫자를 입력받아 해당단을 출력하시오(반복)
//		단 0 입력 시 종료
//		while문 안에 for문을 이용해서 구구단 출력하기
		
		
		
		Scanner sc = new Scanner(System.in);
		int dan;
		while(true) {
			
			System.out.println("정수를 입력하세요");
			dan=sc.nextInt();
			
			if(dan == 0) {
				System.out.print("구구단을 종료합니다");
				break;
			}
			
			System.out.printf("%d의 구구단 시작!\n",dan);
			
			for(int a=1;a<=9;a++) {
				int mul = dan * a;
				System.out.printf("%d * %d = %d\n",dan,a,mul);			
				
			}
			System.out.println();
		}
		//---------------------------------------------------------------------
		
		while(true) {
			System.out.println("구구단 입력");
			dan=sc.nextInt();
			// 0일 경우 break
			if(dan == 0)
				break;
			// 2~9가 아닐경우 다시 입력(continue)
			if(dan >=2 || dan <= 9)
				continue;
			if(!(dan>=2&&dan<=9)) {
				System.out.println("***다시 입력해 주세요 ***");
				continue;
			}
			// 단 제목 출력
			System.out.println("**"+dan+"단**");
			// for문을 이용해서 구구단 출력
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"x"+i+"="+dan*i);
			}
			System.out.println();
		
		}

	}

}
