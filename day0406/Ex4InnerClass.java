package day0406;


// Member ���� Ŭ����
class Outer{
	int a=10;
	static int b=20;
	
	// ����Ŭ����
	class Inner{
		int c=30;
//		static int b=40;			// Member ���� Ŭ�������� static������ ���� �Ұ���
		
		
		public void disp() {
			System.out.println("a="+a);		// ȣ���
			System.out.println("c="+c);
			System.out.println("b="+b);
		}
	}
	
	public void outerDisp() {
		Inner in=new Inner();
		in.disp();
	}
}

public class Ex4InnerClass {

	public static void main(String[] args) {
		// �ܺ� Ŭ������ ���� �޼��� ȣ��(�޼��忡�� ����Ŭ���� ���� ��)
		Outer out=new Outer();
		out.outerDisp();

		System.out.println();
		// �ܺ� Ŭ������ �޼��带 ��ġ���ʰ� �ٷ� 
		// ���� Ŭ������ �޼��带 ȣ���ϰ��� �� ���
		// �ܺ� Ŭ������ ������ �Ǿ߸� ���� Ŭ���� ������ ������
		Outer.Inner inner=new Outer().new Inner();
		inner.disp();
	}

}
