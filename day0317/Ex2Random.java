package day0317;

import java.util.Scanner;

public class Ex2Random {

	public static void main(String[] args) {
		
		
//		1�� ������ �߰��ϱ� : ��� �̾ �ٸ� ���� ���߱�
		
		Scanner sc = new Scanner(System.in);
		
		int rnd,cnt,num;
		char ans;
		
		Exit:
		while(true) {

			System.out.println("** ������ �����մϴ� **");
			cnt=0;
			rnd=(int)(Math.random()*100)+1;

			while(true) {
				
				System.out.println(++cnt+":");
				num=Integer.parseInt(sc.nextLine());	
				// Int�� ���� ���� ������ �ؿ� ���ڸ� �Է¹��� �� ����� ������ �����ϱ� ����
				
				if(num > rnd)
					System.out.println("\t"+num+"���� �۽��ϴ�");
				
				else if(num < rnd)
					System.out.println("\t"+num+"���� Ů�ϴ�");
				
				else {
					System.out.println("***�����Դϴ�. ������ "+rnd+" �Դϴ� ***");
					System.out.println("** ����Ϸ��� y, �׸��Ϸ��� n�� �����ּ��� **");
					ans=sc.nextLine().charAt(0);	// ���ڿ��� ���� �Ŀ� �Ǿտ� �ѱ��ڸ� �ޱ�
					if(ans == 'y' || ans == 'Y') {
						System.out.println("** ���ο� ������ �߻��մϴ� **");
						continue Exit;	// �ٱ� while���� ó������ �̵��ϱ�
					}
					else if(ans == 'n' || ans == 'N'){
						System.out.println("** ���α׷��� �����մϴ� **");
						break Exit;	// �ٱ� while�� ���������� �����ϱ�
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
