package day0405;

// �߻�(abstract)�޼��带 �Ѱ� �̻��� ������ ���
// �ݵ�� Ŭ������ �߻�ȭ�� ���Ѿ� ��
// abstract Ŭ������ �Ϲݸ޼���� �߻�޼��嵵 ��� ������ ������.
abstract class Parent{		// �θ�Ŭ����
	
//	// �̰� �Ϲ� �޼���
//	public void process() {
//		System.out.println("�θ� �ϴ� ���� ����");
//	}
	//////////////////////////////////////
	// �̰� �߻� �޼���
	abstract public void process();	
	
	// process�� �ϴ� ���� ������ �������̵带 ���ؼ� �޼����� ����� �ʿ��ϴ�.
	// �׷��� ���縸 �ϰ� �� �� �ִ°� �̿ϼ��� �޼���(abstract=�߻�ȭ)��.
	// ������ �׷��ٰ��ؼ� �Ϲ� �޼��带 ������ �͵� �ƴ�. ��� ���� ��.
	
}
///////////////////////////////////////////////
class ChildA extends Parent{
	@Override
	public void process() {
		System.out.println("����Ʈĥ�� �մϴ�~");
		
	}
}
//////////////////////////////////////////////
class ChildB extends Parent{
	@Override
	public void process() {
		System.out.println("���� û�Ҹ� �մϴ�~");
	}
}
//////////////////////////////////////////////

public class Ex7Abstract {

	public static void process(Parent p) {	
		
		// ������ ó��
		p.process();	// �������̵�� �޼��常 ȣ���� ������.
						// �׷��� �θ� �ϴ����� ������ �θ�޼��尡 ���� �ؾ���
						// ���� ���ܰ� ����. �θ� �������� ȣ�Ⱑ��.
	}
	
	public static void main(String[] args) {
		
		// process(new Parent());	// �߻�Ŭ������ ��ü ������ �� ���� ����.

		process(new ChildA());	// �׸� �׸��� ���� ó��
		process(new ChildB());	// ���ӿ� ���� ���� ó��
	}

}
