package day0316;

import java.util.Scanner;

public class Ex1MunJe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=0, ran;
		int rnd;
		rnd = (int)(Math.random()*100)+1;
		System.out.println("1 ~ 100���� ���� �� ������ ���ڸ� ���߽��ϴ�.");
		System.out.println("'Up & Down' ������ �����մϴ�.");
		System.out.println("********************************");
		System.out.println("���ڸ� �Է����ּ���.");
		
//		while(true) {
//			
//			ran = (int)(Math.random()*100)+1;
//					
//			cnt++;
//			
//			if(rnd == ran) {
//				System.out.println(cnt+"��° : "+ran);
//				System.out.println("�¾Ҿ��!!! ������ "+rnd+"�Դϴ�" );
//				break;
//			}else if(rnd <= ran) {
//				System.out.println(cnt+"��° : "+ran);
//				System.out.println(ran+"���� �۽��ϴ�");
//				if(cnt == 10) {
//					System.out.println("�ð��ʰ�!!");
//					break;
//				}
//				continue;
//			}else {
//				System.out.println(cnt+"��° : "+ran);
//				System.out.println(ran+"���� Ů�ϴ�");
//				if(cnt == 10) {
//					System.out.println("�ð��ʰ�!!");
//					break;
//				}
//				continue;
//			}
//			
//		}
//		System.out.println("���α׷��� �����մϴ�");
		
		
		while(true) {
			
			System.out.println("");
			ran=sc.nextInt();
			
			cnt++;

			if(rnd == ran) {
				System.out.println(cnt+"��° : "+ran);
				System.out.println("�¾Ҿ��!!! ������ "+rnd+"�Դϴ�" );
				break;
			}else if(rnd <= ran) {
				System.out.println(cnt+"��° : "+ran);
				System.out.println(ran+"���� �۽��ϴ�");
				if(cnt == 10) {
					System.out.println("�ð��ʰ�!!");
					break;
				}
				continue;
			}else {
				System.out.println(cnt+"��° : "+ran);
				System.out.println(ran+"���� Ů�ϴ�");
				if(cnt == 10) {
					System.out.println("�ð��ʰ�!!");
					break;
				}
				continue;
			}

		}
		System.out.println("���α׷��� �����մϴ�");
	}

}
