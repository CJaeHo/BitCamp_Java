package day0316;

public class Ex6MultiFor {

	public static void main(String[] args) {


		for(int a=1;a<=3;a++) {
			System.out.println("Hello!");
			for(int b=1;b<=4;b++) {
				System.out.print("Kitty!!");
			}
			System.out.println();
			System.out.println("------------");
		}
		System.out.println("==========================");
		
		
		for(int a=1;a<=3;a++) {
			System.out.println("Hello!");
			for(int b=1;b<=4;b++) {
				System.out.print("Kitty!!");
				if(b==2)
					break;
			}
			System.out.println();
			System.out.println("------------");
		}
		
		
		System.out.println("==========================");
		
		Loop:
		for(int a=1;a<=3;a++) {
			System.out.println("Hello!");
			for(int b=1;b<=4;b++) {
				System.out.print("Kitty!!");
				if(b==2)
					break Loop;	//break 레이블,, 바깥쪽 반복문을 빠져나옴.
			}
			System.out.println();
			System.out.println("------------");
		}
		
		
		

	}

}
