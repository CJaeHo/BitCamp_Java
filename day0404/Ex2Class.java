package day0404;

class Apple{	// ���� ��Ű�� �ȿ����� ����Ϸ��� �̰�..
				// bin ���� ������ Apple.class�� ������� ����
				// ��� ���� �̸��� Ŭ������ ������
	// ���� ������ ����
	// (���� ��Ű���������� private�� �����ϰ� ��� ���� ����)
	int a=10;
	protected int b=20;
	private int c=30;	// �길 ���� Ŭ���� �������� ������ ������.
	public int d=40;
	
	public final static String MESSAGE="Hello";
	// public = ������.. 
	// final = MESSAGE�� ����� ���� ������ �ȵ�.. 
	// static = class�����ε� ������ �����ϴٴ� �ǹ�..
}


public class Ex2Class {	// ���� ���ϸ��� ����Ϸ��� public�� �ʿ���

	public static void main(String[] args) {
		Apple a1=new Apple();
		System.out.println(a1.a);
		System.out.println(a1.b);
//		System.out.println(a1.c);	// ������ private�� ���� Ŭ������������ ���� ����
		System.out.println(a1.d);
		
		System.out.println(Apple.MESSAGE);	// static������ Ŭ���������� ȣ��

	}

}
