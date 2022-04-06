package day0405;

import java.util.Scanner;

abstract class Command{
	abstract public void process();
}

class List extends Command{
	@Override
	public void process() {
		System.out.println("데이타를 출력합니다.");
	}
}
class Add extends Command{
	@Override
	public void process() {
		System.out.println("데이타를 추가합니다.");
	}
}
class Delete extends Command{
	@Override
	public void process() {
		System.out.println("데이타를 삭제합니다.");
	}
}
class Update extends Command{
	@Override
	public void process() {
		System.out.println("데이타를 수정합니다.");
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
			System.out.println("1.추가 2.수정 3.삭제 4.출력 5.종료");
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
				System.out.println("프로그램을 종료합니다");
				break;
			}
		/*	
			// 아니면 swicth를 이용
			if(num==5) {
				System.out.println("프로그램을 종료합니다");
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
