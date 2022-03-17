package day0317;

public class Ex4Array {

	public static void main(String[] args) {
		
		
		int arr1[]=new int[5];	// 할당만 함. 그러면 초기값은 전부 0
		int arr2[]= {4,6,7,8,10};	// 할당 + 초기값을 줌

		System.out.println("arr1.length:"+arr1.length);
		System.out.println("arr1.length:"+arr2.length);
		
		System.out.println("** 초기 값 출력 **");
		for(int a:arr1)
			System.out.printf("%5d",a);
		System.out.println();
		for(int a:arr2)
			System.out.printf("%5d",a);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("arr1에 값 넣기");
		arr1[1]=6;
		arr1[3]=23;
		arr1[4]=31;
		
		for(int i=0;i<arr1.length;i++)
			System.out.printf("%3d",arr1[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
