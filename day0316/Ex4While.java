package day0316;

import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		
		
//		점수를 입력받아 총점과 평균과 입력받은 갯수를 구하시오
//		단, 점수가 1 ~ 100이 아닐 경우 다시 입력(갯수에서 빠짐)
//		점수가 0일 경우 반복문 종료 후 출력
		
		
		Scanner sc = new Scanner(System.in);
		int score, tot, cnt;
		double avg;
		
		tot=cnt=0;	// 초기값 지정
		while(true) {
			System.out.println("점수 입력하기");
			score=sc.nextInt();
			if(score==0)
				break;
			if(0 > score || score > 100) {
				System.out.println("\t다시 입력해주세요");
				continue;	// 조건식으로 이동 --> true로 이동,, 하던작업을 멈추고 처음부터 다시 시작할 때 사용함.
			}
			tot+=score;
			cnt++;
		}
		avg = (double)tot/cnt;
		System.out.println("총 입력 갯수 : "+cnt);
		System.out.println("총 합계 :"+tot);
		System.out.println("평 균 : "+avg);
		

	}

}
