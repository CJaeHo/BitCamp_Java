package day0315;

import java.util.Scanner;

public class Ex11Ddi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;	// �¾ �⵵
		String ddi;	// �� ����
		// �¾ �⵵�� �Է��ϸ� �ش��ϴ� �츦 ����ϴ� ���α׷� �����ϱ�
		// if�� ���� ���ϰ� ���� �����ڷε� ���ϱ�
		// ��Ʈ : ���� 1���� �߶��̴�
		
		System.out.println("�¾ �⵵�� �Է��ϼ���.");
		year = sc.nextInt();
		
		int a = year % 12;
		
		// if ��
		if (a == 1)
			ddi = "��";
		else if (a == 2)
			ddi = "��";
		else if (a == 3)
			ddi = "����";
		else if (a == 4)
			ddi = "��";
		else if (a == 5)
			ddi = "��";
		else if (a == 6)
			ddi = "ȣ����";
		else if (a == 7)
			ddi = "�䳢";
		else if (a == 8)
			ddi = "��";
		else if (a == 9)
			ddi = "��";
		else if (a == 10)
			ddi = "��";
		else if (a == 11)
			ddi = "��";
		else
			ddi = "������";

		System.out.println("����� "+ddi+"�� �Դϴ�.");
		
		
		// ���� ������
		
		ddi = a==1?"��":a==2?"��":a==3?"����":a==4?"��":a==5?"��":
			  a==6?"ȣ����":a==7?"�䳢":a==8?"��":a==9?"��":a==10?"��":
			  a==11?"��":"������";
		
		System.out.println("����� "+ddi+"�� �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
	}

}
