package day0317;

import java.util.Scanner;

public class Ex8ArrayMunJe {

	public static void main(String[] args) {
		
		String[] members= {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�","���缮","��ö��","���̸�","������","����"};
		String name;	// �Է¹��� �̸�
		int cnt;	// �ο��� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
//		�˻��� �̸� : ����
//			�������� 2��°�� �ֽ��ϴ�
//		�˻��� �̸� : ������
//			��������� ��ܿ� �����ϴ�
//		�˻��� �̸� : exit
//			** �˻��� �����մϴ� **
		
		
		
		
		while(true) {
			cnt=0;
			System.out.print("�˻��� �̸� : ");
			name=sc.nextLine();
			
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("** �˻��� �����մϴ� **");
				break;
			}
			
			for(int i=0; i<members.length; i++) {
				if(members[i].equals(name)) {
					cnt++;
					System.out.println(name+"���� "+(cnt+1)+"��°�� �ֽ��ϴ�.");
					
				}
			}
			if(cnt == 0) {
					System.out.println("��������� ��ܿ� �����ϴ�.");
			}
			
			

		}
		
		

		
		
		
//		while(true) {
//			
//			cnt=0;
//			
//			System.out.print("�˻��� �̸� : ");
//			name=sc.nextLine();
//			
//			if(name.equalsIgnoreCase("exit")) {		// �빮�ڷ� �Էµ� ���� ������ ��ҹ��� ������°ɷ�!
//				System.out.println("** �˻��� �����մϴ� **");
//				break;
//			}
//			
//			for(int i=0;i<members.length;i++) {
//				if(name.equals(members[i])) {
//					cnt++;
//					System.out.println(name+"���� "+ (cnt+1) +"��°�� �ֽ��ϴ�!");
//				}
//			}
//			if(cnt == 0)
//				System.out.println(name+"���� ��ܿ� �����ϴ�....");
//		}
//		
//		
		
	}

}
