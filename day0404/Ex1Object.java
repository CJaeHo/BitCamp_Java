package day0404;

public class Ex1Object {
	// instance ��� ���� ����
	public int score=78;	// ���������ڴ� default(���� ��Ű�� �������� ���� ����)
	
	// static ��� ����
	public static int jungdap=90;
	
	// static �޼���� �ڱ��ڽ��� �ǹ��ϴ� this��� �ν��Ͻ� ������ ����.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Object ex1=new Ex1Object();
		ex1.score=80;
		
		System.out.println(ex1.score);	// 5���� int score�� ���� �� ��밡��.
		
		Ex1Object ex2=new Ex1Object();
		ex2.score=90;

		Ex1Object ex3=new Ex1Object();
		ex3.score=100;
		
		
		System.out.println(ex2.score);
		System.out.println(ex3.score);
		
		
		
		
		System.out.println(jungdap);				// ���� Ex1Object�� �־�ߵǴ°ǵ� ���� 
		System.out.println(Ex1Object.jungdap);	// Ŭ������ Ŭ�������� �����Ȱ���
	}

}
