package day0404;

class Person{
	String name;
	String addr;
}


public class Ex6CallBy {
	
	public static void changeInt(int a) {	// void�� ����Ÿ��..?
		a=10;
	}
	public static void changeArray(int[] a) {	// void�� ����Ÿ��..?
		a[2]=25;
	}
	public static void changePerson(Person p) {	// void�� ����Ÿ��..?
		p.addr="���ֵ�";
	}
	public static void changeString(String s) {	// void�� ����Ÿ��..?
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		changeInt(n);	// n���� ����(call by value)
		System.out.println(n);
		
		int[] arr= {1,5,10};	// �迭�� ������ ���۷��� Ÿ��(��ü�� �ν�)
		changeArray(arr);		// �ּҸ� ����, call by reference
		for(int a:arr) {
			System.out.println(a);
		}
		
		Person p=new Person();
		p.name="ȫ�浿";
		p.addr="����";
		
		changePerson(p);	// �ּҸ� ����, call by reference
		System.out.println(p.name+","+p.addr);
		
		String s="orange";
		changeString(s);	
		// ���� ���޵ǹǷ� �޼��忡�� ����� ���� �ݿ��� �ȵ�
		System.out.println(s);
		
		
		
		
		
	}

}
