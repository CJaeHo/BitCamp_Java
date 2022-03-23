package day0318;

public class Ex4Arraylotto {

	public static void main(String[] args) {


		int[] lotto = new int[6];
		
		
		
//		문제 : 1~45 사이의 중복되지 않은 난수를 배열에 저장 후
//				오름차순으로 출력하시오
//				
//		난수 발생(중복처리) - 다중 for문
//		
//		오름차순 정렬 - 다중 for문
//		
//		출력 - 단일 for문
		
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {		// i 전까지만 비교하면 됨. 초기화를 하지 않은 상태이기 떄문에 length로 돌리면 에러남.
				if(lotto[i] == lotto[j]) {
					i--;
					break;					// 안쪽 for을 나가서 바깥쪽 for문 증감식으로 이동. continue는 안쪽 증감식으로 이동.
				}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {	// j=0이 아닌 j=i+1로 해야하는게 이미 해놓은거는 건드릴 필요가 없음.
				if(lotto[i] > lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			} 
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(" "+lotto[i]);
		}
	}

}
