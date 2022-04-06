package day0405;

class SuperObj{		// 부모클래스
	
	public void process() {
		System.out.println("super 부모가 공통적인 일을 처리합니다");
	}
}
///////////////////////////////////////////////
class Draw extends SuperObj{
	@Override
	public void process() {
		super.process();	// 부모가 먼저 처리해야할 것이 있을 때 앞에 선언
		System.out.println("나는 그림을 그려요~");
		
	}
}
//////////////////////////////////////////////
class Game extends SuperObj{
	@Override
	public void process() {
		super.process();	// 부모가 먼저 처리해야할 것이 있을 때 앞에 선언
		System.out.println("나는 게임을 해요~");
	}
}
//////////////////////////////////////////////

public class Ex6Inheri {

	public static void process(SuperObj obj) {	
		obj.process();
		// SuperObj인 부모와 그 부모에 상속된 것들은 다 담아질 수 있음
	}
	
	public static void main(String[] args) {
		SuperObj obj=null;	// 만드는건 부모로 
		obj=new Draw();		// 담는건 자식으로 했는데 ~
		obj.process();	// Draw가 가진 process가 호출됨.

		obj=new Game();
		obj.process();		// Game이 가진 process가 호출됨.
		
		///////////////////////////////////////
		process(new Draw());	// 그림 그리는 일을 처리
		process(new Game());	// 게임에 관한 일을 처리
	}

}
