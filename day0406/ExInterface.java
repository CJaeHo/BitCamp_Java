package day0406;

interface InterA{
	public void draw();
}

// interface가 interface를 상속받을 경우 extends
interface InterB extends InterA{
	 public void play();
}

// class에서 InterB를 구현 할 경우 InterA가 가진 것도 오버라이드 해야한다
class My1 implements InterB{	// extends 대신에 implements.. 
	// class class >> extends를 써서 상속받기
	// interface interface >> extends를 써서 상속받기 
	// interface(class) class(interface) >> implements를 써서 상속받기

	public void show() {	// 만약 얘를 호출할 일이 생기면 My1으로 호출해야함.
							// a1, a2로 호출 안됨
		System.out.println("My1이 가진 메서드");
	}
	
	@Override
	public void draw() {
		System.out.println("draw");
		
	}

	@Override
	public void play() {
		System.out.println("play");
		
	}
	
}


public class ExInterface {

	public static void main(String[] args) {

		My1 al=new My1();
		al.draw();
		al.play();
		
		al.show();	// My1만 가지고 있는 메서드
//		a2.show();
		
		System.out.println();
		
		InterB a2=new My1();	// InterA와 InterB를 모두 오버라이드를 했기때문에 오류안남
		a2.draw();				// 오버라이드된 메서드만 호출 가능.
		a2.play();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
