package day0406;

interface InterA{
	public void draw();
}

// interface�� interface�� ��ӹ��� ��� extends
interface InterB extends InterA{
	 public void play();
}

// class���� InterB�� ���� �� ��� InterA�� ���� �͵� �������̵� �ؾ��Ѵ�
class My1 implements InterB{	// extends ��ſ� implements.. 
	// class class >> extends�� �Ἥ ��ӹޱ�
	// interface interface >> extends�� �Ἥ ��ӹޱ� 
	// interface(class) class(interface) >> implements�� �Ἥ ��ӹޱ�

	public void show() {	// ���� �긦 ȣ���� ���� ����� My1���� ȣ���ؾ���.
							// a1, a2�� ȣ�� �ȵ�
		System.out.println("My1�� ���� �޼���");
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
		
		al.show();	// My1�� ������ �ִ� �޼���
//		a2.show();
		
		System.out.println();
		
		InterB a2=new My1();	// InterA�� InterB�� ��� �������̵带 �߱⶧���� �����ȳ�
		a2.draw();				// �������̵�� �޼��常 ȣ�� ����.
		a2.play();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
