package day0406;


class Orange{
	int a=10;
	static int b=20;
	
	// ���ο��� �ݵ�� static���� ������ �ʿ��� �� ����ϴµ�
	// �״�� �ܺ� Ŭ������ �ν��Ͻ� ������ ���� �Ұ���
	static class Kiwi{
		int c=30;
		static int d=30;
		
		public void disp() {
//			System.out.println("a="+a);	
			// �׷��� �ܺ�Ŭ������ �ν��Ͻ� ������ a�� ���� �Ұ��Ѱ���
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
		}
	}
	
	// �ܺ� Ŭ������ �޼��忡�� static ����Ŭ���� ���� ��
	public void outerDisp() {
		Kiwi kiwi=new Kiwi();
		kiwi.disp();
	}
}


public class Ex5StaticInnerClass {

	public static void main(String[] args) {
		Orange orange=new Orange();
		orange.outerDisp();
		System.out.println();
		
		// �ܺ�Ŭ������ �޼��带 ��ġ�� �ʰ� ���� static ����Ŭ������ ȣ�� ��
		Orange.Kiwi kiwi=new Orange.Kiwi();		// static�� �ƴҽÿ��� .new kiwi()�� ����߰���
		kiwi.disp();

	}

}
