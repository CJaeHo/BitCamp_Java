package day0406;

import java.util.Scanner;

public class Ex8Exception {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int su1, su2, sum;
		System.out.println("���� 1 �Է�");
		try {
			su1=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("ù��° ���ڸ� �߸� �Է������Ƿ� 0���� �ʱ�ȭ ��");
			su1=0;
		}
		System.out.println("���� 2 �Է�");
		try {
			su2=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("�ι�° ���ڸ� �߸� �Է������Ƿ� 0���� �ʱ�ȭ ��");
			su2=0;
		}
		

		sum=su1+su2;
		System.out.println(su1+"+"+su2+"= "+sum);
		System.out.println("*** �� �� �� �� �� ***");
	}
}
