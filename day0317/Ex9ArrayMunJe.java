package day0317;

public class Ex9ArrayMunJe {

	public static void main(String[] args) {
		

		int score[]= {67,89,78,89,100};
		int rank[]= new int[5];
		
		// ������ ���� ���ϰ��� for��
		// ����� ����for��.....
		// ���� ������ �� ������ ī��Ʈ +1
		
//		������ ���� ��� ����ϱ�
//			
//			��¾��
//			
//			��ȣ		����		���
//			----------------------
//			 1		67		5
//			 2		89		2
//			 3		78		4
//			 4		89		2
//			 5		100		1
		
		int num=0;
		System.out.println("\t��ȣ\t����\t���");
		System.out.println("------------------------------------");
		for(int i=0;i<score.length;i++){	// ����� 1���� �����ؼ� ������ ���ѻ���� ���� ������ 1�� ���Ѵ�
			num+=1;
			rank[i]=1;
			for(int j=0;j<score.length;j++){	// ����(j)�� ������ ����(i)�������� ������
				if (score[i] < score[j]) {		// ���� ����� 1 ������Ų��
					rank[i]++;
				}
			}
			System.out.println("\t "+num+"\t"+score[i]+"\t"+rank[i]);
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
