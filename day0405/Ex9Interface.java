package day0405;

// interface�� ����� �߻�޼��常 ������ �����ϴ�
interface InterA{
	int SPEED=100;	// final �����
	public void speedWrite();	// abstract �޼�����
}

// �������̽��� �����ϴ� Ŭ����
class My implements InterA{
	@Override
	public void speedWrite() {
//		SPEED=120;	
		// ���ڷ� �ν��ϴ°� �ƴ϶� ���(String)�� �ν��ϱ� ������ ���� ����� �� ����
		System.out.println("���� ���ǵ�� "+SPEED+"�Դϴ�");
	}
}
public class Ex9Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA a=new My();	// ������ ����..�θ�� a������ �����ϰ� �ڽ��� my�� �ް�
		a.speedWrite();
	}

}
