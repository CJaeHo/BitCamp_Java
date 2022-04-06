package day0405;

// 추상(abstract)메서드를 한개 이상을 포함한 경우
// 반드시 클래스도 추상화를 시켜야 함
// abstract 클래스는 일반메서드와 추상메서드도 모두 구현이 가능함.
abstract class Parent{		// 부모클래스
	
//	// 이게 일반 메서드
//	public void process() {
//		System.out.println("부모가 하는 일이 없음");
//	}
	//////////////////////////////////////
	// 이게 추상 메서드
	abstract public void process();	
	
	// process가 하는 일은 없지만 오버라이드를 위해서 메서드의 존재는 필요하다.
	// 그래서 존재만 하게 할 수 있는게 미완성의 메서드(abstract=추상화)임.
	// 하지만 그렇다고해서 일반 메서드를 못쓰는 것도 아님. 사용 가능 함.
	
}
///////////////////////////////////////////////
class ChildA extends Parent{
	@Override
	public void process() {
		System.out.println("페인트칠을 합니다~");
		
	}
}
//////////////////////////////////////////////
class ChildB extends Parent{
	@Override
	public void process() {
		System.out.println("집안 청소를 합니다~");
	}
}
//////////////////////////////////////////////

public class Ex7Abstract {

	public static void process(Parent p) {	
		
		// 다형성 처리
		p.process();	// 오버라이드된 메서드만 호출이 가능함.
						// 그래서 부모가 하는일이 없더라도 부모메서드가 존재 해야함
						// 물론 예외가 있음. 부모만 가진경우는 호출가능.
	}
	
	public static void main(String[] args) {
		
		// process(new Parent());	// 추상클래스는 객체 생성을 할 수가 없음.

		process(new ChildA());	// 그림 그리는 일을 처리
		process(new ChildB());	// 게임에 관한 일을 처리
	}

}
