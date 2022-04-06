package day0404;

class Apple{	// 같은 패키지 안에서만 사용하려면 이거..
				// bin 폴더 가보면 Apple.class가 만들어져 있음
				// 고로 같은 이름의 클래스는 못만듬
	// 접근 지정자 연습
	// (같은 패키지내에서는 private를 제외하고 모두 접근 가능)
	int a=10;
	protected int b=20;
	private int c=30;	// 얘만 같은 클래스 내에서만 접근이 가능함.
	public int d=40;
	
	public final static String MESSAGE="Hello";
	// public = 공공의.. 
	// final = MESSAGE는 상수임 값이 변경이 안됨.. 
	// static = class만으로도 접근이 가능하다는 의미..
}


public class Ex2Class {	// 같은 파일명에서 사용하려면 public이 필요함

	public static void main(String[] args) {
		Apple a1=new Apple();
		System.out.println(a1.a);
		System.out.println(a1.b);
//		System.out.println(a1.c);	// 에러남 private는 같은 클래스내에서만 접근 가능
		System.out.println(a1.d);
		
		System.out.println(Apple.MESSAGE);	// static변수는 클래스명으로 호출

	}

}
