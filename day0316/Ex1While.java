package day0316;

public class Ex1While {

	public static void main(String[] args) {


		int a = 0;
		
		while(++a<=5) {
			System.out.println(a);
		}
		System.out.println("빠져나온 후의 a의 값 : " + a);
		
		
		a = 0;
		while(a++<=5) {	// 비교 후에 증가함.
			System.out.println(a);
		}
		System.out.println("빠져나온 후의 a의 값 : " + a);
		
		
		a = 0;
		while(true) {	// 조건은 무조건 true로 해야함.
			System.out.println(++a);
			if(a==5)
				break;	//a가 5가되면 while문을 빠져나감.
		}
		System.out.println("빠져나온 후의 a의 값 : " + a);
		
	}

}
