package day0315;

import java.util.Scanner;

public class Ex8Operator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int kor;	// ���� ���� ����
		String msg;	// ��� �޼��� ����
		
		// ���� ������ �Է� �� 90 �̻��̸� "Excellent!"��� msg�� �����ϱ�.
		// 80 �̻��̸� "Good!!" ����
		// 80 �̸��̸� "Try!!!"��� �����ϱ�
		
		System.out.println("���� ���� �Է� : ");
		kor = sc.nextInt();
		// if ������ �غ���
		
		if (kor >= 90)
			msg = "Excellent!";
		else if ( kor >= 80)
			msg = "Good!!";
		else
			msg = "Try!!!";
		System.out.println(kor+ "��" + " => " + msg);
		
		// ���� �����ڷ� �غ���
		msg = kor >= 90?"Excellent!":kor >= 80?"Good!!":"Try!!!";
		System.out.println(kor+ "��" + " => " + msg);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
