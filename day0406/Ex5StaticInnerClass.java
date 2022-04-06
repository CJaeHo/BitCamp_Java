package day0406;


class Orange{
	int a=10;
	static int b=20;
	
	// 내부에서 반드시 static으로 변수가 필요할 때 사용하는데
	// 그대신 외부 클래스의 인스턴스 변수는 접근 불가함
	static class Kiwi{
		int c=30;
		static int d=30;
		
		public void disp() {
//			System.out.println("a="+a);	
			// 그래서 외부클래스의 인스턴스 변수인 a는 접근 불가한거임
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
		}
	}
	
	// 외부 클래스의 메서드에서 static 내부클래스 선언 시
	public void outerDisp() {
		Kiwi kiwi=new Kiwi();
		kiwi.disp();
	}
}


public class Ex5StaticInnerClass {

	public static void main(String[] args) {
		Orange orange=new Orange();
		orange.outerDisp();
		System.out.println();
		
		// 외부클래스의 메서드를 거치지 않고 직접 static 내부클래스를 호출 시
		Orange.Kiwi kiwi=new Orange.Kiwi();		// static이 아닐시에는 .new kiwi()를 해줘야겠지
		kiwi.disp();

	}

}
