package day0317;

public class Ex10ArrayMunJe {

	public static void main(String[] args) {
		
		
		
		int lotto[] = new int[6];
		
//		lotto �迭�� 1~45 ������ ���� 6���� ���� �� ����ϱ�
//		
//		��, �ߺ� ���ڰ� ������ �ȵ�
		
		
		
		for(int i=0;i<lotto.length;i++){
			// 1~45 ������ ���� ���ϱ�
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++){
				if(lotto[i] == lotto[j]){
					i--;
					break;	// i++�� �̵���
				}
			}
		}
//		 ���� ������ ���� ���ڰ� �տ� ������ �����ϱ�
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
