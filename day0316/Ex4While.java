package day0316;

import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		
		
//		������ �Է¹޾� ������ ��հ� �Է¹��� ������ ���Ͻÿ�
//		��, ������ 1 ~ 100�� �ƴ� ��� �ٽ� �Է�(�������� ����)
//		������ 0�� ��� �ݺ��� ���� �� ���
		
		
		Scanner sc = new Scanner(System.in);
		int score, tot, cnt;
		double avg;
		
		tot=cnt=0;	// �ʱⰪ ����
		while(true) {
			System.out.println("���� �Է��ϱ�");
			score=sc.nextInt();
			if(score==0)
				break;
			if(0 > score || score > 100) {
				System.out.println("\t�ٽ� �Է����ּ���");
				continue;	// ���ǽ����� �̵� --> true�� �̵�,, �ϴ��۾��� ���߰� ó������ �ٽ� ������ �� �����.
			}
			tot+=score;
			cnt++;
		}
		avg = (double)tot/cnt;
		System.out.println("�� �Է� ���� : "+cnt);
		System.out.println("�� �հ� :"+tot);
		System.out.println("�� �� : "+avg);
		

	}

}
