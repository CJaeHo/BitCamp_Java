package day0318;

public class Ex4Arraylotto {

	public static void main(String[] args) {


		int[] lotto = new int[6];
		
		
		
//		���� : 1~45 ������ �ߺ����� ���� ������ �迭�� ���� ��
//				������������ ����Ͻÿ�
//				
//		���� �߻�(�ߺ�ó��) - ���� for��
//		
//		�������� ���� - ���� for��
//		
//		��� - ���� for��
		
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {		// i �������� ���ϸ� ��. �ʱ�ȭ�� ���� ���� �����̱� ������ length�� ������ ������.
				if(lotto[i] == lotto[j]) {
					i--;
					break;					// ���� for�� ������ �ٱ��� for�� ���������� �̵�. continue�� ���� ���������� �̵�.
				}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {	// j=0�� �ƴ� j=i+1�� �ؾ��ϴ°� �̹� �س����Ŵ� �ǵ帱 �ʿ䰡 ����.
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
