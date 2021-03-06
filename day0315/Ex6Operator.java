package day0315;

public class Ex6Operator {

	public static void main(String[] args) {
		
		
		System.out.println("**증감연산자 연습**");
		int a = 5, b = 5, x, y;
		x = a++;	// 후치증감연산자
		y = ++b;	// 전치증감연산자
		
		System.out.println(a + "," + b);
		System.out.println(x + "," + y);	// x = 5, y = 6 왜? ++이 뒤에붙으면 출력되고 증가, 앞에붙으면 출력되기전에 증가함.
		
		a = b = x = 3;
		y = ++a+b--*++x;
		System.out.println(y);	// 16 a + b * x
								//    4 + 3 * 4
		
		a = 3;
		System.out.println(a++);	// 3 : 출력 후 증가 (a = 4)
		System.out.println(++a);	// 5 : 증가 후 출력
		
		
		System.out.println("**대입 연산자 연습**");
		a = 5;
		a += 3;	
		System.out.println(a);	// 8
		a *= 5;	
		System.out.println(a);	// 40
		a -= 2;
		System.out.println(a);	// 38
		a /= 3;
		System.out.println(a);	// 12
		a %= 5;
		System.out.println(a);	// 2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
