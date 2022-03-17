package day0317;

public class Ex5Array {

	public static void main(String[] args) {
		
		
		String str1[]=new String[3];
		String str2[]= {"홍길동", "김말자", "이말년"};
		
		
		System.out.println("** 초기값 출력(출력 방법1) **");
		
		
		for(int i=0;i<str1.length;i++)
			System.out.printf("%6s",str1[i]);
		System.out.println();
		System.out.println();
		
		
		for(int i=0;i<str2.length;i++)
			System.out.printf("%5s",str2[i]);
		
		System.out.println();
		System.out.println();
		

		
		
		
		
		System.out.println("str1에 값 넣기");
		str1[0]="장미꽃";
		str1[1]="안개꽃";
		str1[2]="국화꽃";
		System.out.println();
		
		System.out.println("str1만 다시 출력(출력 방법2) **");
		
		for(String a:str1)
			System.out.printf("%5s",a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
