package day0406;

public class Ex7Exception {

	public static void main(String[] args) {
		int[] arr= {4,6,7,8};
		for(int i=0; i<=arr.length;i++) {
			try {
				System.out.println(arr[i]);				
			}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();	// �����޼��� �����ؼ� Ȯ���ϴ°�
				System.out.println("�迭 ���� : "+e.getMessage());
				// ���� �޼����� ������� �� �����ϰ� �����ϰ� �� �� ����
			}
		}
		System.out.println("*** �� �� �� �� ��***");
	}

}
