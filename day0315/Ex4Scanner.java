package day0315;

import java.util.Scanner;

public class Ex4Scanner {

	String abc;
	public static void main(String[] args) {
		
		
		
		Scanner	sc = new Scanner(System.in);
		// Scanner를 사용하려면 util을 가져와야함. Ctrl + 스페이스바 or Ctrl + 1 
		// in은 키보드를 의미함.
		String msg="";	// main안에 있으면 초기화 해주기. (7번줄)main 밖에 있으면 안넣어도 됨.
		System.out.print("당신의 이름을 입력하세요 : ");
		msg = sc.nextLine();	// 입력한 한줄을 통쨰로 읽어옴.(문자열 타입)
//		차이점 비교하기
//		msg = sc.next();	// 한 단어만 읽어옴.(문자 타입)
		System.out.println("내 이름은 " + msg + " 입니다.");

		int age;
		System.out.print("당신의 나이는 ? ");
		age = sc.nextInt();	// int타입으로 읽어옴.
		System.out.println(msg+ "님의 나이는 " + age + "세 입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
