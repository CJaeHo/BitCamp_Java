package day0405;

// interface는 상수와 추상메서드만 구현이 가능하다
interface InterA{
	int SPEED=100;	// final 상수임
	public void speedWrite();	// abstract 메서드임
}

// 인터페이스를 구현하는 클래스
class My implements InterA{
	@Override
	public void speedWrite() {
//		SPEED=120;	
		// 숫자로 인식하는게 아니라 상수(String)로 인식하기 때문에 값이 변경될 수 없음
		System.out.println("나의 스피드는 "+SPEED+"입니다");
	}
}
public class Ex9Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA a=new My();	// 다형성 생성..부모로 a변수를 선언하고 자식인 my로 받고
		a.speedWrite();
	}

}
