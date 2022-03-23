package day0318;

import java.util.Scanner;

public class Ex5Arraylotto {

	public static void main(String[] args) {


		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		int money;
		
//		문제 :
//		금액을 입력하면 금액에 해당하는 횟수만큼 로또 숫자 출력
//		1~45 사이의 중복되지 않은 난수를 배열에 저장 후
//		오름차순으로 출력하시오
//				
//		난수 발생(중복처리) - 다중 for문
//		
//		오름차순 정렬 - 다중 for문
//		
//		출력 - 단일 for문
		
		
		
		System.out.print("얼마치 드릴까요?");
		money=sc.nextInt();
		if(money<1000) {
			System.out.println("금액이 부족합니다.");
			return;	// 현재 main이 void이므로 돌려주는 값 없이 메인 함수를 종료한다.
		}
		
		for(int m=1; m<=money/1000 ;m++) {
			System.out.print(m+"회 : ");
			for(int i=0; i<lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0; j<i; j++) {		// i 전까지만 비교하면 됨. 초기화를 하지 않은 상태이기 떄문에 length로 돌리면 에러남.
					if(lotto[i] == lotto[j]) {
						i--;
						break;					// 안쪽 for을 나가서 바깥쪽 for문 증감식으로 이동. continue는 안쪽 증감식으로 이동.
					}
				}
			}

			for(int i=0; i<lotto.length-1; i++) {
				for(int j=i+1; j<lotto.length; j++) {	// j=0이 아닌 j=i+1로 해야하는게 이미 해놓은거는 건드릴 필요가 없음.
					if(lotto[i] > lotto[j]) {
						int temp;
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
				
			}

			for(int n:lotto) {
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}

}
