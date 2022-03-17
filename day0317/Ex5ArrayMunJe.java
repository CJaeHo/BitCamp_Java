package day0317;

public class Ex5ArrayMunJe {

	public static void main(String[] args) {
		
		
		int data[]= {56,67,79,89,100};
		int sum=0;	// 합계구할 변수
		double avg;	// 평균구할 변수
		
		// for문에서 sum 구하기
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		for(int a:data)
			sum+=a;
		// avg 구하기
		avg = (double)sum / data.length;
		
		// 출력
		System.out.printf("합계 : %d",sum);
		System.out.println();
		System.out.printf("평균 : %6.2f",avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
