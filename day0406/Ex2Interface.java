package day0406;


interface Apple{
	public void process1();
}

interface Banana{
	public void process2();
}


// 두개의 interface를 모두 구현하는 클래스
class My2 implements Apple,Banana{		// 동시에 구현도 가능

	public void show() {
		System.out.println("My2만이 가진 메서드");
	}
	@Override
	public void process2() {
		System.out.println("Apple기능 구현");
		
	}
	@Override
	public void process1() {
		System.out.println("Banana기능 구현");
		
	}
}



public class Ex2Interface {

	public static void main(String[] args) {
		
		
		My2 al=new My2();		// My2가 가진 show, Apple의 process1, Banana의 process2
		al.show();
		al.process1();
		al.process2();

		Apple a2=new My2();		// Apple이 가진 process1
		a2.process1();
		
		Banana b2=new My2();	// Banana가 가진 process2
		b2.process2();
		

	}

}
