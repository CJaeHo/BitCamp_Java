package day0316;

public class Ex1MunJe {

	public static void main(String[] args) {
		
		
		int cnt=0, ran, bocsa;
		int rnd;
		rnd = (int)(Math.random()*100)+1;
		System.out.println("rnd의 값은 "+rnd+"입니다");
		
		
		while(true) {
			
			ran = (int)(Math.random()*100)+1;
			
			
//			if(rnd <= ran) {
//				
//			}
			
			cnt++;
			
			if(rnd == ran) {
				System.out.println(cnt+"번째 : "+ran);
				System.out.println("맞았어요!!! 정답은 "+rnd+"입니다" );
				break;
			}else if(rnd <= ran) {
				System.out.println(cnt+"번째 : "+ran);
				System.out.println(ran+"보다 작습니다");
				if(cnt == 10) {
					System.out.println("시간초과!!");
					break;
				}
				continue;
			}else {
				System.out.println(cnt+"번째 : "+ran);
				System.out.println(ran+"보다 큽니다");
				if(cnt == 10) {
					System.out.println("시간초과!!");
					break;
				}
				continue;
			}
			
		}
		System.out.println("프로그램을 종료합니다");
		
		
		
		
		
		
		
		
	}

}
