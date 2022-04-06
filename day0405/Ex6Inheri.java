package day0405;

class SuperObj{		// �θ�Ŭ����
	
	public void process() {
		System.out.println("super �θ� �������� ���� ó���մϴ�");
	}
}
///////////////////////////////////////////////
class Draw extends SuperObj{
	@Override
	public void process() {
		super.process();	// �θ� ���� ó���ؾ��� ���� ���� �� �տ� ����
		System.out.println("���� �׸��� �׷���~");
		
	}
}
//////////////////////////////////////////////
class Game extends SuperObj{
	@Override
	public void process() {
		super.process();	// �θ� ���� ó���ؾ��� ���� ���� �� �տ� ����
		System.out.println("���� ������ �ؿ�~");
	}
}
//////////////////////////////////////////////

public class Ex6Inheri {

	public static void process(SuperObj obj) {	
		obj.process();
		// SuperObj�� �θ�� �� �θ� ��ӵ� �͵��� �� ����� �� ����
	}
	
	public static void main(String[] args) {
		SuperObj obj=null;	// ����°� �θ�� 
		obj=new Draw();		// ��°� �ڽ����� �ߴµ� ~
		obj.process();	// Draw�� ���� process�� ȣ���.

		obj=new Game();
		obj.process();		// Game�� ���� process�� ȣ���.
		
		///////////////////////////////////////
		process(new Draw());	// �׸� �׸��� ���� ó��
		process(new Game());	// ���ӿ� ���� ���� ó��
	}

}
