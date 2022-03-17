package day0317;

public class Ex9ArrayMunJe {

	public static void main(String[] args) {
		

		int score[]= {67,89,78,89,100};
		int rank[]= new int[5];
		
		// 총점을 먼저 구하고나서 for문
		// 등수는 다중for문.....
		// 점수 비교했을 때 높으면 카운트 +1
		
//		점수에 대한 등수 출력하기
//			
//			출력양식
//			
//			번호		점수		등수
//			----------------------
//			 1		67		5
//			 2		89		2
//			 3		78		4
//			 4		89		2
//			 5		100		1
		
		int num=0;
		System.out.println("\t번호\t점수\t등수");
		System.out.println("------------------------------------");
		for(int i=0;i<score.length;i++){	// 등수는 1부터 시작해서 나보다 잘한사람이 있을 때마다 1을 더한다
			num+=1;
			rank[i]=1;
			for(int j=0;j<score.length;j++){	// 상대방(j)의 점수가 나의(i)점수보다 높으면
				if (score[i] < score[j]) {		// 나의 등수를 1 증가시킨다
					rank[i]++;
				}
			}
			System.out.println("\t "+num+"\t"+score[i]+"\t"+rank[i]);
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
