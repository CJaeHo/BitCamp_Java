package day0315;

public class Ex3String {

	public static void main(String[] args) {
		
		
		String s1 = "Happy";	// String은 new선언을 안해도 됨.
		String s2 = new String("Apple");	// 하면 이렇게.
		System.out.println(s1);
		System.out.println(s2);
		
		int a = 5, b = 5;
		System.out.println(a==b);	// true 출력함.
		System.out.println(s1==s2); // false 출력함. 당연하지만.. 왜? JAVA에서는 ==를 사용할 떄 클래스 타입에서는 '주소'를 비교함.
		// 문자열에서 값이 같은지 비교하려면 equals 라는 메서드를 이용하면 됨.
		System.out.println(s1.equals("Happy"));
		System.out.println(s1.equals("happy"));	// 대소문자도 가림.
		System.out.println(s1.equals(s2));	// 주소가 아닌 s1과 s2의 값을 비교함.
		
		// 만약 대소문자 상관없이 철자만 비교하고자 할 경우
		System.out.println(s1.equalsIgnoreCase("happy"));	// true 출력함.
		System.out.println(s2.equalsIgnoreCase("aPPle"));	// true 출력함.
		
		
		// 문자열의 길이 구하기
		System.out.println(s1.length());	// Happy 5글자 
		
		// 문자열의 첫글자 구하기
		char startChar = s1.charAt(0);	// Happy의 H
		System.out.println(startChar); 
		
		
		// 전체를 무조건 대문자 또는 소문자로 출력
		System.out.println(s1.toUpperCase());	// 대문자
		System.out.println(s1.toLowerCase());	// 소문자
		
		String s3 = "Have a Nice Day!!";
		System.out.println(s3.startsWith("Have"));	// s3의 문자열이 Have로 시작할 경우 true
		System.out.println(s3.endsWith("!"));	// s3의 문자열이 !로 끝날 경우 false
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("*"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
