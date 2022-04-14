package day0407;

import java.util.Vector;

public class Ex6Vector {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();		// 기본 10개 할당(추가시 ^2배로 증가)
		Vector<String> v2=new Vector<String>(3);	// 기본 3개 할당(추가시 ^2배로 증가)
		Vector<String> v3=new Vector<String>(5,3);	// 기본 5개 할당 후 3개씩 증가

		System.out.println("할당 크기 알아보기");
		System.out.println("v1="+v1.capacity());
		System.out.println("v2="+v2.capacity());
		System.out.println("v3="+v3.capacity());

		v2.add("apple");
		v2.add("apple");
		v2.add("banana");
		v2.add("banana");

		System.out.println("데이타 4개 추가 후 v2="+v2.capacity());
	}

}
