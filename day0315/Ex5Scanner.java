package day0315;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {
		
		// Ctrl + A 전체 드래그, Ctrl + I 들여쓰기
		
		
		Scanner sc = new Scanner(System.in);
		int score;
		String name;
		char blood;
		
		// 방법 1
//		System.out.println("점수 입력 : "); 
//		score = sc.nextInt(); 
//		sc.nextLine();	// 버퍼의엔터를 읽어서 소멸시키면 됨. ex) 90적고 엔터치면 90은 int로 엔터는 Line로 빠짐.
//						// 엔터를 소멸시키지 않으면 밑에name에 엔터가 입력되어짐.
		// 방법 2
		System.out.println("점수 입력 : ");
		score = Integer.parseInt(sc.nextLine());	// 점수를 일단 문자열로 읽은 후 int타입으로 변환함.
												// Integer.parseInt(a) : 문자열 a를 int 타입으로 변환함.
												// 단 숫자형태가 아닐 경우 예외가 발생함.
		
		System.out.println("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.println("혈액형 한글자 입력 : ");
		blood = sc.nextLine().charAt(0);
		
		System.out.println();
		System.out.println("이 름\t: " + name);
		System.out.println("점 수\t: " + score);
		System.out.println("혈액형\t: " + blood);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
