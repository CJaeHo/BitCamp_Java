package day0317;

import java.util.Scanner;

public class Ex1MunJe2 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int rnd, num;
		char stop;
		// 1 ~ 100������ ���� �߻�
		rnd=(int)(Math.random()*100)+1;
		
		Exit:
		while(true) {
			
			
			System.out.print(++cnt+":");
			num=Integer.parseInt(sc.nextLine());
			
			if(num > rnd) {
				System.out.println("\t"+num+"���� �۽��ϴ�");
			}
			else if (num < rnd) {
				System.out.println("\t"+num+"���� Ů�ϴ�");
			}
			else {
				System.out.println("�¾Ҿ��!!! ������ "+rnd+"�Դϴ�");
				System.out.println("����Ͻ÷��� y��, �׸��Ͻ÷��� n�� �����ּ���");
				System.out.println(" y or n ");
				stop=sc.nextLine().charAt(0);
				if(stop == 'y' || stop == 'Y') {
					System.out.println("���ο� ���ڸ� ���߽��ϴ�.");
					cnt=0;
					continue Exit;
				}
				else if(stop == 'n' || stop == 'N') {
					System.out.println("���α׷��� �����մϴ�.");
					break Exit;
				}
				
			}
			if(cnt>=10) {
				System.out.println("\t== �ð��ʰ�!!! �����մϴ� ==");
				break ;	// while���� ������ ��ɾ�. �ƿ� ������ ��ɾ ���� ����.
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
