package day0317;

import java.util.Scanner;

public class Ex11Test {

	public static void main(String[] args) {
		

		
		// ���� 1
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int sum=0;
		
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ���");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x < y) {
			for(int i=x;i<=y;i++) {
				sum+=x;
				x++;
			}
		}
		else
			for(int i=y;i<=x;i++) {
				sum+=y;
				y++;
			}
		System.out.println(sum);
		
		
		// ���� 2
		
		
		String color[]= {"Red","Blue","Yellow","Green","Black"};
		int cnt=0;
		
		for(int i=0;i<color.length;i++) {
			System.out.println(++cnt+". "+color[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
