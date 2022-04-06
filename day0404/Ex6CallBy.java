package day0404;

class Person{
	String name;
	String addr;
}


public class Ex6CallBy {
	
	public static void changeInt(int a) {	// void는 리턴타입..?
		a=10;
	}
	public static void changeArray(int[] a) {	// void는 리턴타입..?
		a[2]=25;
	}
	public static void changePerson(Person p) {	// void는 리턴타입..?
		p.addr="제주도";
	}
	public static void changeString(String s) {	// void는 리턴타입..?
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		changeInt(n);	// n값을 전달(call by value)
		System.out.println(n);
		
		int[] arr= {1,5,10};	// 배열은 무조건 레퍼런스 타입(객체로 인식)
		changeArray(arr);		// 주소를 전달, call by reference
		for(int a:arr) {
			System.out.println(a);
		}
		
		Person p=new Person();
		p.name="홍길동";
		p.addr="서울";
		
		changePerson(p);	// 주소를 전달, call by reference
		System.out.println(p.name+","+p.addr);
		
		String s="orange";
		changeString(s);	
		// 값이 전달되므로 메서드에서 변경된 값이 반영이 안됨
		System.out.println(s);
		
		
		
		
		
	}

}
