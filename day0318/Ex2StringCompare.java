package day0318;

public class Ex2StringCompare {

	public static void main(String[] args) {


		System.out.println("Apple".compareTo("Apple"));		// ������� 0
		System.out.println("Apple".compareTo("Banana"));	// �������� -1 B�� 1 �� ũ�ٴ� ��
		System.out.println("Hello".compareTo("Hi"));		// �������� -4 i�� 4 �� ũ�ٴ� ��
		System.out.println("Hello".compareTo("Apple"));		// �������� 7  A�� 7 �� �۴ٴ� ��

	}

}
