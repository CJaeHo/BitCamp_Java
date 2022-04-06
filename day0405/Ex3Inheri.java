package day0405;

class Apple{
	private void methodA() {
		System.out.println("super 메서드 A");
	}
	// 부모(super) 메서드 두개
	public void methodB() {
		System.out.println("super 메서드 B");
	}
}
/////////////////////////////////////
// 아들 클래스 메서드
class Banana extends Apple{
	public void methodC() {		// 24번줄.. b.m 해보면 메서드 A는 호출 안댐
		System.out.println("sub 메서드 C");
	}
}

public class Ex3Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b=new Banana();
		b.methodB();	// 상속된 메서드
		b.methodC();
	}

}
