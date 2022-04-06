package day0404;

public class Ex1Object {
	// instance 멤버 변수 선언
	public int score=78;	// 접근지정자는 default(같은 패키지 내에서만 접근 가능)
	
	// static 멤버 변수
	public static int jungdap=90;
	
	// static 메서드는 자기자신을 의미하는 this라는 인스턴스 변수가 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Object ex1=new Ex1Object();
		ex1.score=80;
		
		System.out.println(ex1.score);	// 5번줄 int score는 선언 후 사용가능.
		
		Ex1Object ex2=new Ex1Object();
		ex2.score=90;

		Ex1Object ex3=new Ex1Object();
		ex3.score=100;
		
		
		System.out.println(ex2.score);
		System.out.println(ex3.score);
		
		
		
		
		System.out.println(jungdap);				// 원래 Ex1Object가 있어야되는건데 같은 
		System.out.println(Ex1Object.jungdap);	// 클래스라서 클래스명이 생략된거임
	}

}
