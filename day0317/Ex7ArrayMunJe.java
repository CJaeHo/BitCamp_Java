package day0317;

import java.util.Scanner;

public class Ex7ArrayMunJe {

	public static void main(String[] args) {
		
		
		
//		String members[]= {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�","���缮","��ö��","���̸�","������","����"};
//		String name;	// �Է¹��� �̸�
//		int cnt;	// �ο��� ���� ����
//		���� :	���� �Է��ϸ� �ش� ���� ���� ����� ����ϰ�
//				�� ������� ����ϱ�
//				(��)		�˻��� �� : ��
//						1: ����
//						3: ��ȿ��
//						8: ������
//						�� 3��
//						�˻��� �� : ��
//						�ھ����� ����
//						�˻��� �� : ��				equals ���,,,,,
//							*** �����մϴ� ***
//				String�� startswith ���
		
		
			
//		Scanner sc = new Scanner(System.in);
//		
//
//		
//		while(true) {
//			cnt=0;						
//			// �ִ� ���� ���� �Է����� ��� cnt���� �׿� �´� ī��Ʈ�� 
//			// ���ֱ� ������ 0���� �ʱ�ȭ�� ��� �������.
//			System.out.print("�˻��� �� : ");
//			name=sc.nextLine();
//			
//			if(name.equals("��")){
//				System.out.println("*** �����մϴ� ***");
//				break;
//			}	
//			
//			for(int i=0;i<members.length;i++) {
//				if(members[i].startsWith(name)) {	// �ش� ������ ���� �� ��� true
//					
//					System.out.println(i+": "+members[i]);
//					cnt++;
//				}
//			}
//			if(cnt == 0) {				
//				System.out.println(name+"������ ����!!");
//			}
//			else {
//				System.out.println("�� "+cnt+"��");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		String[] members= {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�","���缮","��ö��","���̸�","������","����"};
		String name;	// �Է¹��� �̸�
		int cnt;	// �ο��� ���� ����
//		���� :	���� �Է��ϸ� �ش� ���� ���� ����� ����ϰ�
//				�� ������� ����ϱ�
//				(��)		�˻��� �� : ��
//						1: ����
//						3: ��ȿ��
//						8: ������
//						�� 3��
//						�˻��� �� : ��
//						�ھ����� ����
//						�˻��� �� : ��				equals ���,,,,,
//							*** �����մϴ� ***
//				String�� startswith ���
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			cnt = 0;
			System.out.print("�˻��� �� : ");
			name=sc.nextLine();
			
			if(name.equals("��")) 
			{
				System.out.println("*** �����մϴ� ***");
				break;
			}
			
			for(int i=0; i<members.length; i++) 
			{
				if(members[i].startsWith(name)) 
				{
					System.out.println(i+": "+members[i]);
					cnt++;
				}
			}
			if(cnt == 0) {
				System.out.println(name+"������ ����");
			}
			else {
				System.out.println("�� "+cnt+"��");				
			}
			
			
			
			
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
