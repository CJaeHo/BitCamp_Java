package day0316;

public class Ex9ForGugu {

	public static void main(String[] args) {


		
//		2단부터 9단까지 모두 출력
//		
//		[2단]	[3단] ..............	[9단] - 단일 for문
//		
//		2x1=2	3x1=3 .............	9x1=9 - 다중 for문
//		  .
//		  .
//		  .
//		2x9=18 3x9=27 ............	9x9=81
		
		
		
		for(int i=2;i<=9;i++) {
			System.out.print("["+i+"단]\t");
		}
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		

	}

}
