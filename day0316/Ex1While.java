package day0316;

public class Ex1While {

	public static void main(String[] args) {


		int a = 0;
		
		while(++a<=5) {
			System.out.println(a);
		}
		System.out.println("�������� ���� a�� �� : " + a);
		
		
		a = 0;
		while(a++<=5) {	// �� �Ŀ� ������.
			System.out.println(a);
		}
		System.out.println("�������� ���� a�� �� : " + a);
		
		
		a = 0;
		while(true) {	// ������ ������ true�� �ؾ���.
			System.out.println(++a);
			if(a==5)
				break;	//a�� 5���Ǹ� while���� ��������.
		}
		System.out.println("�������� ���� a�� �� : " + a);
		
	}

}
