package day0316;

public class Ex11Random {

	public static void main(String[] args) {
		
		
//		������ ��(����)�� ���ϴ� ����� �ڹٿ��� �ΰ����� ����
//		Math.random()	
//		Random Ŭ����	
//		�� �� static�� �پ����� Overview ���ã�⿡�� �� �� ����
		
		System.out.println("1~9 ������ ���� ���ϱ�");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*10);
			System.out.println(a);
		}

		System.out.println(" 0~99 ������ ���� ���ϱ�");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*100);
			System.out.println(a);
		}
		
		System.out.println("1~100 ������ ���� ���ϱ�");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*100)+1;
			System.out.println(a);
		}
		
		System.out.println("������ ���ĺ� A~Z(65~90) ���ϱ�");
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*26)+65;
			System.out.println((char)a);				

			
		}

		
	}

}
