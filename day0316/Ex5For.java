package day0316;

public class Ex5For {

	public static void main(String[] args) {


		int a;
		for(a=1;a<=5;a++) {
			System.out.printf("%3d",a);
		}
		System.out.println();
		
		for(a=5;a>=1;a--) {
			System.out.printf("%3d",a);
		}
		System.out.println();
		
		for(a=1;a<=20;a+=3) {
			System.out.printf("%3d",a);
		}
		System.out.println();
		
		System.out.println("1부터 100까지 중 짝수의 합을 구하기");
		int sum=0;
		for(a=1;a<=100;a++) {
			if(a % 2 == 1)
				continue;	// 홀수인 경우 a++로 이동
			else
				sum+=a;
		}
		System.out.println(sum);
		
	}

}
