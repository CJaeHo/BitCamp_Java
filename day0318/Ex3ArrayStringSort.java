package day0318;

public class Ex3ArrayStringSort {

	public static void main(String[] args) {


		String[] names= {"�Ѱ���", "��ȣ��", "���缮", "Adams", "�Ѱ�"};
		
		
		for(int i=0; i<names.length-1 ;i++) {
			for(int j=0; j<names.length ;j++) {
				// i���� ���� ������� - ���� ������ ������
				// �� Ŭ��쿡�� �����(�����)
				if(names[i].compareTo(names[j])>0) {	// 0���� �۴ٴ� ��������
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		// ���
		for(int i=0; i<names.length ; i++) {
			System.out.println(i+"=>"+names[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
