package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		
		byte b1 = 127;	// 1byte 최대 127.
		byte b2 = (byte)129;	// 129 - 256이기 때문에 결과 값 : -127.
								// 혹은 2의 보수를 출력함.
		System.out.println(b1);
		System.out.println(b2);
		
		float f1 = 123.456789f;	// f를 붙이면 4byte의 float으로 선언됨.
		double d1 = 123.45678912345678;
		System.out.println(f1);	// 소수점 포함 8자리까지만 반올림해서 출력됨. 
		System.out.println(d1); // 소수점 포함 15자리까지만 반올림해서 출력됨.
		
		boolean b = true;
		System.out.println(b);	// true 출력함.
		System.out.println(!b);	// false 출력함. ! == NOT.
		
		// printf는 변환기호를 이용해서 출력할 때 사용함.(jdk5에서 추가됨.)
		// 정수:%d, 실수:%f, 문자:%c, 문자열:%s
		System.out.printf("f1 = %7.1f, d1 = %7.2f\n", f1, d1);
		// %뒤에 7은 공간확보용, .뒤에 1,2는 소수점 첫번째 자리까지만 출력함.
		char ch = 'A';
		System.out.printf("\nch = %c", ch); // \n은 줄바꿈, \t는 1탭(8bit) 공간확보.
		System.out.printf("\n\tch = %c\n", ch);
		
		
		// "Red", "Blue" 이렇게 나오게 출력
		System.out.println("Red" +  "Blue");
		// " 자체를 출력하려면 \" 이렇게 적으면 됨.
		System.out.println("\"Red\" , \"Blue\"");
		
		
		// 파일의 경로를 나타낼 때 /도 되고 \도 됨.
		System.out.println("c:/image/sun.jpg");
		System.out.println("c:\\image\\sun.jpg");
		// 하지만 \는 \\로 적어줘야 \가 출력됨.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
