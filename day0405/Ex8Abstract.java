package day0405;

import java.util.Scanner;

abstract class Command{
	abstract public void process();
}

class List extends Command{
	@Override
	public void process() {
		System.out.println("����Ÿ�� ����մϴ�.");
	}
}
class Add extends Command{
	@Override
	public void process() {
		System.out.println("����Ÿ�� �߰��մϴ�.");
	}
}
class Delete extends Command{
	@Override
	public void process() {
		System.out.println("����Ÿ�� �����մϴ�.");
	}
}
class Update extends Command{
	@Override
	public void process() {
		System.out.println("����Ÿ�� �����մϴ�.");
	}
}


public class Ex8Abstract {
	public static void process(Command comm) {
		comm.process();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.�߰� 2.���� 3.���� 4.��� 5.����");
			int num=sc.nextInt();
			
			if(num==1) {
				process(new Add());
			}else if(num==2) {
				process(new Update());
			}else if(num==3) {
				process(new Delete());
			}else if(num==4) {
				process(new List());
			}else {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		/*	
			// �ƴϸ� swicth�� �̿�
			if(num==5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			switch(num) {
			case 1: 
				process(new Add());
				break;
			case 2:
				process(new Update());
				break;
			case 3:
				process(new Delete());
				break;
			case 4:
				process(new List());
			}
*/
		}
	}

}
