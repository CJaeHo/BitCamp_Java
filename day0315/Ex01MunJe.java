package day0315;

import java.util.Scanner;

public class Ex01MunJe {

	public static void main(String[] args) {


//		[����1] Ex1Munje
//		   ��ǰ��� ����,�ݾ��� �Է¹޾� ����ؾ��� 
//		   �� �ݾ��� ����ϴµ�
//		  ���� 5�� �̻��ϰ�� �ѱݾ��� 10���θ� ���� �ݾ����� ����Ͻÿ�(if��)

		
		Scanner sc = new Scanner(System.in);
		
		String food;
		int price, num;
		int sum;
		double won;
		
		System.out.println("������ ��ǰ���� �����ÿ�");
		food = sc.nextLine();
		
		System.out.println("������ �����ÿ�");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("��ǰ�� ������ �����ÿ�");
		price = Integer.parseInt(sc.nextLine());
		
		
		sum = price * num;
		won = sum - (sum / 10.0);
		
		if (num >= 5) {
			System.out.printf("�ݾ��� %d�� �Դϴ�.\n", (int)(won-(won%10)));
		}
		else 
			System.out.println("�ݾ��� "+sum+"�� �Դϴ�.");
		
		
		
	}

}
