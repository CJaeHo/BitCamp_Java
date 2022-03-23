package day0318;

import java.util.Scanner;

public class Ex5Arraylotto {

	public static void main(String[] args) {


		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		int money;
		
//		���� :
//		�ݾ��� �Է��ϸ� �ݾ׿� �ش��ϴ� Ƚ����ŭ �ζ� ���� ���
//		1~45 ������ �ߺ����� ���� ������ �迭�� ���� ��
//		������������ ����Ͻÿ�
//				
//		���� �߻�(�ߺ�ó��) - ���� for��
//		
//		�������� ���� - ���� for��
//		
//		��� - ���� for��
		
		
		
		System.out.print("��ġ �帱���?");
		money=sc.nextInt();
		if(money<1000) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;	// ���� main�� void�̹Ƿ� �����ִ� �� ���� ���� �Լ��� �����Ѵ�.
		}
		
		for(int m=1; m<=money/1000 ;m++) {
			System.out.print(m+"ȸ : ");
			for(int i=0; i<lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0; j<i; j++) {		// i �������� ���ϸ� ��. �ʱ�ȭ�� ���� ���� �����̱� ������ length�� ������ ������.
					if(lotto[i] == lotto[j]) {
						i--;
						break;					// ���� for�� ������ �ٱ��� for�� ���������� �̵�. continue�� ���� ���������� �̵�.
					}
				}
			}

			for(int i=0; i<lotto.length-1; i++) {
				for(int j=i+1; j<lotto.length; j++) {	// j=0�� �ƴ� j=i+1�� �ؾ��ϴ°� �̹� �س����Ŵ� �ǵ帱 �ʿ䰡 ����.
					if(lotto[i] > lotto[j]) {
						int temp;
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
				
			}

			for(int n:lotto) {
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}

}
