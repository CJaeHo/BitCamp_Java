package day0406;


interface Apple{
	public void process1();
}

interface Banana{
	public void process2();
}


// �ΰ��� interface�� ��� �����ϴ� Ŭ����
class My2 implements Apple,Banana{		// ���ÿ� ������ ����

	public void show() {
		System.out.println("My2���� ���� �޼���");
	}
	@Override
	public void process2() {
		System.out.println("Apple��� ����");
		
	}
	@Override
	public void process1() {
		System.out.println("Banana��� ����");
		
	}
}



public class Ex2Interface {

	public static void main(String[] args) {
		
		
		My2 al=new My2();		// My2�� ���� show, Apple�� process1, Banana�� process2
		al.show();
		al.process1();
		al.process2();

		Apple a2=new My2();		// Apple�� ���� process1
		a2.process1();
		
		Banana b2=new My2();	// Banana�� ���� process2
		b2.process2();
		

	}

}
