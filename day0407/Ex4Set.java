package day0407;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set의 특징
// 1. 비순차적
// 2. 중복데이타를 허용하지 않는다.
public class Ex4Set {

	public static void main(String[] args) {
		
		// 제네릭 <String> : 문자열만 넣을 수 있다
		Set<String> set=new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("banana");
		set.add("orange");
		set.add("apple");
		set.add("kiwi");
//		set.add(100);	// String이 아닌경우 오류발생. 문자열로 받으면 되긴함
		System.out.println(set.size());
		System.out.println();
		
		System.out.println("출력 방법1");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("출력 방법2");
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			String s=iter.next();
			System.out.println(s);
		}
	}

}
