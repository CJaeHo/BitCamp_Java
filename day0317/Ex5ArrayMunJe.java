package day0317;

public class Ex5ArrayMunJe {

	public static void main(String[] args) {
		
		
		int data[]= {56,67,79,89,100};
		int sum=0;	// �հ豸�� ����
		double avg;	// ��ձ��� ����
		
		// for������ sum ���ϱ�
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		for(int a:data)
			sum+=a;
		// avg ���ϱ�
		avg = (double)sum / data.length;
		
		// ���
		System.out.printf("�հ� : %d",sum);
		System.out.println();
		System.out.printf("��� : %6.2f",avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
