package day0317;

import java.util.Scanner;

public class Ex1MunJe {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int rnd, num;
		
		// 1 ~ 100������ ���� �߻�
		rnd=(int)(Math.random()*100)+1;
		

		while(true) {
			
			
			System.out.print(++cnt+":");
			num=sc.nextInt();
			
			if(num > rnd) {
				System.out.println("\t"+num+"���� �۽��ϴ�");
			}
			else if (num < rnd) {
				System.out.println("\t"+num+"���� Ů�ϴ�");
			}
			else {
				System.out.println("�¾Ҿ��!!! ������ "+rnd+"�Դϴ�");
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			if(cnt>=10) {
				System.out.println("\t== �ð��ʰ�!!! �����մϴ� ==");
				break;	// while���� ������ ��ɾ�. �ƿ� ������ ��ɾ ���� ����.
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
