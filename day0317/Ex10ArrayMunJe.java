package day0317;

public class Ex10ArrayMunJe {

	public static void main(String[] args) {
		
		
		
		int lotto[] = new int[6];
		
//		lotto 배열에 1~45 사이의 난수 6개를 넣은 후 출력하기
//		
//		단, 중복 숫자가 있으면 안됨
		
		
		
		for(int i=0;i<lotto.length;i++){
			// 1~45 사이의 난수 구하기
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++){
				if(lotto[i] == lotto[j]){
					i--;
					break;	// i++로 이동함
				}
			}
		}
//		 구한 난수를 작은 숫자가 앞에 오도록 나열하기
		int cng;
		for(int i=0;i<lotto.length;i++){	
			for(int j=0;j<lotto.length;j++){	
				if (lotto[i] > lotto[j]) {	
					cng=lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = cng;

				}
			}
		}
		
		
		for(int n:lotto)
			System.out.printf("%4d",n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
