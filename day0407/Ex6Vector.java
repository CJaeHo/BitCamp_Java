package day0407;

import java.util.Vector;

public class Ex6Vector {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();		// �⺻ 10�� �Ҵ�(�߰��� ^2��� ����)
		Vector<String> v2=new Vector<String>(3);	// �⺻ 3�� �Ҵ�(�߰��� ^2��� ����)
		Vector<String> v3=new Vector<String>(5,3);	// �⺻ 5�� �Ҵ� �� 3���� ����

		System.out.println("�Ҵ� ũ�� �˾ƺ���");
		System.out.println("v1="+v1.capacity());
		System.out.println("v2="+v2.capacity());
		System.out.println("v3="+v3.capacity());

		v2.add("apple");
		v2.add("apple");
		v2.add("banana");
		v2.add("banana");

		System.out.println("����Ÿ 4�� �߰� �� v2="+v2.capacity());
	}

}
