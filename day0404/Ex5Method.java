package day0404;

class Score{
	private int java;
	private int spring;
	
	// setter method
	public void setJava(int java) {
		this.java=java;
	}
	public void setSpring(int spring) {
		this.spring=spring;
	}
	
	// getter method
	public int getJava() {
		return java;		// this. ������
	}
	public int getSpring() {
		return spring;		// this. ������
	}
}

class Student{
	// ��� ��������� �ʱⰪ�� ���� ��� null�� �ʱⰪ
	private String name;
	public Score score=new Score();		// �տ� Score�� Ŭ������ ��������� ��
	// class�ȿ� Score��� class�� ����

	// setter, getter
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;	// this. ������
	}



}

public class Ex5Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		// �̸� ����
		stu.setName("������");
		// �ΰ����� ����
		stu.score.setJava(90);		// class�ȿ� class������ ����
		stu.score.setSpring(100);
		
		// ���(�̸�,�ڹ�����,���������� ����ϱ�
		
		System.out.println("�� �� : "+stu.getName());
		System.out.println("�ڹ����� : "+stu.score.getJava());
		System.out.println("���������� : "+stu.score.getSpring());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
