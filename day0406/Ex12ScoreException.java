package day0406;
// ScoreException

import java.util.Scanner;

class ScoreException extends Exception{
	public ScoreException(String msg) {
		super(msg);
	}
}

public class Ex12ScoreException {
	// writeScore(int score)
	// 1~100 사이의 값이 오면 "내 점수는 90점입니다"라고 출력
	// 그 이외에는 ScoreException을 강제발생(메세지는 "잘못된 점수입니다")
	public static void writeScore(int score) throws ScoreException{
		if(score < 1 || score > 100) {
			throw new ScoreException("잘못된 점수입니다");
		}else
			System.out.println("내 점수는 "+score+"점 입니다");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하세요");
			int score=sc.nextInt();
			if(score==0) {
				break;
			}
			try {
				writeScore(score);
			}catch(ScoreException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("정상 종료");
	}

}
