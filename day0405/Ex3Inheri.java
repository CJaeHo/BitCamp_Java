package day0405;

class Apple{
	private void methodA() {
		System.out.println("super �޼��� A");
	}
	// �θ�(super) �޼��� �ΰ�
	public void methodB() {
		System.out.println("super �޼��� B");
	}
}
/////////////////////////////////////
// �Ƶ� Ŭ���� �޼���
class Banana extends Apple{
	public void methodC() {		// 24����.. b.m �غ��� �޼��� A�� ȣ�� �ȴ�
		System.out.println("sub �޼��� C");
	}
}

public class Ex3Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b=new Banana();
		b.methodB();	// ��ӵ� �޼���
		b.methodC();
	}

}
