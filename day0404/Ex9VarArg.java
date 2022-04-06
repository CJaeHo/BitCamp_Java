package day0404;

public class Ex9VarArg {

	// ...�� ���� Ÿ������ ������ ������� ���ڷ�
	// ���� �� ������ �迭 Ÿ������ �޴´�
	public static void writeColor(String...color) {
		System.out.println("�� "+color.length+"��");
		for(String s:color) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	public static int sum(int...n) {
		int s=0;
		for(int a:n) {
			System.out.println(a);
			s+=a;
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeColor();
		writeColor("red");
		writeColor("���","����","�Ķ�");
		writeColor("green","orange","bule","pink","yellow");
		
		System.out.println("** �Ʒ��� �޼��带 �������� **");
		int s=sum(3,5,6);	// sum�� ���޹��� ���� ��� �� �հ踦 ���ؼ� ����
		System.out.println("�հ�:"+s);
		
		int s2=sum(10,20,30,67,77);
		System.out.println("�հ�:"+s);
	}

}
