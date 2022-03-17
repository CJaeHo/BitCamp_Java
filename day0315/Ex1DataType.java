package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		
		// 기본형 연습
		char ch = 'A';
		char ch2 = '가';
		char ch3 = 67; // == 'C'
		char ch4 = (char) (ch3 + 2);	// 묵시적 형변환에 의해서 int타입인데 강제로 char로 변환함.
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch3+2);	// (ch3)char + (2)int = int로 출력됨.
		System.out.println((char)(ch3+2));	// 형변환에 의해서 char로 출력됨.
		
		int a = 7, b = 4;
		System.out.println(a+b);	// 11
		System.out.println(a/b);	// 몫의 값 1
		System.out.println(a%b);	// 나머지의 값 3
		System.out.println((double)a/b);	// a를 계산할 때만 double로 변환해서 계산. 물론 b에 double을 넣어도 됨.
		System.out.println((double)(a/b));	// a/b가 1로 계산된 후에 double로 형변환이 되기 때문에 1.0으로 출력됨.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
