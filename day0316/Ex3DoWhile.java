package day0316;

public class Ex3DoWhile {

	public static void main(String[] args) {
		
		
		int a = 10;
		System.out.println("while��");
		while(a<10) {
			System.out.println(a++);
		}
		
		
		a = 10;
		System.out.println("do~while��");
		do {
			System.out.println(a++);
		}while(a<10);
		
		
		System.out.println("--------------");
		System.out.println("1���� 100���� �հ� ���ϱ�");
		a = 0;
		int sum = 0;
		while(++a<=100) {
			sum+=a;
		}
		System.out.println("�� �հ� : "+sum);
		
		
		
		a = 0;
		int esum = 0, osum=0;
		System.out.println("1~100���� ¦�����հ� Ȧ���� �� ���� ���ϱ�");
		while(++a<=100) {
			if (a % 2 == 0)
				esum+=a;
			else
				osum+=a;
		}
		System.out.println("¦���� �� : "+esum);
		System.out.println("Ȧ���� �� : "+osum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
