package day0316;

public class Ex9ForGugu {

	public static void main(String[] args) {


		
//		2�ܺ��� 9�ܱ��� ��� ���
//		
//		[2��]	[3��] ..............	[9��] - ���� for��
//		
//		2x1=2	3x1=3 .............	9x1=9 - ���� for��
//		  .
//		  .
//		  .
//		2x9=18 3x9=27 ............	9x9=81
		
		
		
		for(int i=2;i<=9;i++) {
			System.out.print("["+i+"��]\t");
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
