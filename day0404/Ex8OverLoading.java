package day0404;

public class Ex8OverLoading {

	
	public static void write(String s) {
		System.out.println("���ڿ� "+s);
	}
	public static void write(String s1,String s2) {
		System.out.println("���ڿ� "+s1+","+s2);
	}
	public static void write(int s) {
		System.out.println("������ "+s);
	}
	public static void write(String[] s) {
		System.out.println("���ڿ� �迭 "+s);
		for(String a:s) {
			System.out.println(a);
		}
	}
	
	
	// �հ踦 ���ϴ� overloading �޼���
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double sum(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write(100);
		write("���");
		write("red","pink");
//		write("yellow","orange","pink");	// ������.. ��? ���ڿ� 2�������� �������ݾ�
		
		String[] s= {"red","orange","pink","green"};
		write(s);
		
		System.out.println("�հ� : "+sum(4,5));
		System.out.println("�հ� : "+sum(1.4,2.5));
//		System.out.println("�հ� : "+sum("red",5));	// ������..��? int�θ� �������ݾ�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
