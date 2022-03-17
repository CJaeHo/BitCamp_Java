package day0316;

public class Ex11Random {

	public static void main(String[] args) {
		
		
//		임의의 수(랜덤)를 구하는 방법이 자바에는 두가지가 있음
//		Math.random()	
//		Random 클래스	
//		둘 다 static이 붙어있음 Overview 즐겨찾기에서 볼 수 있음
		
		System.out.println("1~9 사이의 난수 구하기");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*10);
			System.out.println(a);
		}

		System.out.println(" 0~99 사이의 난수 구하기");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*100);
			System.out.println(a);
		}
		
		System.out.println("1~100 사이의 난수 구하기");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*100)+1;
			System.out.println(a);
		}
		
		System.out.println("임의의 알파벳 A~Z(65~90) 구하기");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*26)+65;
			System.out.println((char)a);				

			
		}

		
	}

}
