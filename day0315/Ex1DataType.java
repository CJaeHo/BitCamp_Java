package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		
		// �⺻�� ����
		char ch = 'A';
		char ch2 = '��';
		char ch3 = 67; // == 'C'
		char ch4 = (char) (ch3 + 2);	// ������ ����ȯ�� ���ؼ� intŸ���ε� ������ char�� ��ȯ��.
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch3+2);	// (ch3)char + (2)int = int�� ��µ�.
		System.out.println((char)(ch3+2));	// ����ȯ�� ���ؼ� char�� ��µ�.
		
		int a = 7, b = 4;
		System.out.println(a+b);	// 11
		System.out.println(a/b);	// ���� �� 1
		System.out.println(a%b);	// �������� �� 3
		System.out.println((double)a/b);	// a�� ����� ���� double�� ��ȯ�ؼ� ���. ���� b�� double�� �־ ��.
		System.out.println((double)(a/b));	// a/b�� 1�� ���� �Ŀ� double�� ����ȯ�� �Ǳ� ������ 1.0���� ��µ�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
