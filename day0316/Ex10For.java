package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		
		
		
//		1. ������ ���ϱ�
//		2. ���� n������ �հ� ���ϱ�
//		3. ���� n������ ���丮�� ���ϱ�
//		4. ����
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		while(true) {
			
			System.out.println("1. ������ ���ϱ�");
			System.out.println("2. ���� n������ �հ� ���ϱ�");
			System.out.println("3. ���� n������ ���丮�� ���ϱ�");
			System.out.println("4. ����");
			
			menu=sc.nextInt();
			// 4�� ��� ����
			if(menu ==4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			switch(menu){
			case 1:{
				int x,y,r=1;
				System.out.println("�������� ���� x,y �� ���ڸ� �Է��ϼ���");
				x=sc.nextInt();
				y=sc.nextInt();
				for(int i=1;i<=y;i++) {
					r*=x;
				}
				System.out.println(x+"�� "+y+"���� "+r+"�Դϴ�");
			}
				break;
			case 2:{
				int x,y,r=0;
				System.out.println("���ڵ� ������ ���� ���� x,y �� ���ڸ� �Է��ϼ���");
				x=sc.nextInt();
				y=sc.nextInt();
				if (x >= y) {
					for(int i=y;i<=x;i++) {
						r+=i;
					}	
				}
				else
					for(int i=x;i<=y;i++) {
						r+=i;
					}
				System.out.println(x+"�� "+y+"���� ���ڵ��� ���� "+r+"�Դϴ�");
			}
				break;
			case 3:{
				int x,r=1;
				System.out.println("���丮���� ���� ���ڸ� �����ּ���");
				x=sc.nextInt();
				for(int i=x;i>=1;i--) {
					r*=i;
				}
				System.out.println(x+"�� ���丮�� ���� "+r+"�Դϴ�");
			}
				break;
			default:
				System.out.println("\n�߸� �Է��ϼ̽��ϴ�\n�޴��� �ٽ� �������ּ���\n");
			}
		}
	}

}
