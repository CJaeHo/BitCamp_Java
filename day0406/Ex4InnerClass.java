package day0406;


// Member 내부 클래스
class Outer{
	int a=10;
	static int b=20;
	
	// 내부클래스
	class Inner{
		int c=30;
//		static int b=40;			// Member 내부 클래스에서 static변수는 선언 불가함
		
		
		public void disp() {
			System.out.println("a="+a);		// 호출됨
			System.out.println("c="+c);
			System.out.println("b="+b);
		}
	}
	
	public void outerDisp() {
		Inner in=new Inner();
		in.disp();
	}
}

public class Ex4InnerClass {

	public static void main(String[] args) {
		// 외부 클래스가 가진 메서드 호출(메서드에서 내부클래스 선언 시)
		Outer out=new Outer();
		out.outerDisp();

		System.out.println();
		// 외부 클래스의 메서드를 거치지않고 바로 
		// 내부 클래스의 메서드를 호출하고자 할 경우
		// 외부 클래스가 선언이 되야만 내부 클래스 선언이 가능함
		Outer.Inner inner=new Outer().new Inner();
		inner.disp();
	}

}
