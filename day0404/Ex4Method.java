package day0404;

public class Ex4Method {
	private String name;	// ��� ���� Ŭ���� �������� ������ ������.
	private int age;		// ��Ȯ�� ȣĪ�� ���������� ��.

	// setter method = �� ���� �� �ʿ��� �޼���..
	public void setName(String name) {
		this.name=name;		
		// ���ڰ� ���� �̸��� ��� ��������� �տ� �ݵ�� this�� ���̱�
		// �������̳�... 4���� �ٿ��� name�� 8��° �ٿ��� name�� ���� ��ġ�� ������
		// 4��°�ٿ� �ִ� name�� ǥ���� ���� this.name �̷��� ����� �Ѵٴ°���
		// ���� this. �̰Ŵ� ������ �����ѵ� �������� ��ġ�� ��������� ��.
		// ���� �������� �ٸ��ٸ� this. ���� ���൵ ��.
	}
	public void setAge(int age) {
		this.age=age;
	}
	//-----------------------------------------------------------------------------
	
	// getter method = ������� ���� ��ȯ�ϱ� ���� �޼���
	public String getName() {
		return name;	// this.�� �����Ǿ�����.
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Method ex1=new Ex4Method();
		ex1.setName("�̱���");
		ex1.setAge(25);

		Ex4Method ex2=new Ex4Method();
		ex2.setName("������");
		ex2.setAge(30);
		
		System.out.println("�̸� : "+ex1.getName());
		System.out.println("���� : "+ex1.getAge());
		// system.out���� out�� static.. ��?? class�� ���ϱ�

		System.out.println("�̸� : "+ex2.getName());
		System.out.println("���� : "+ex2.getAge());
		
	}

}
