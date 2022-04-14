package day0407;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set�� Ư¡
// 1. �������
// 2. �ߺ�����Ÿ�� ������� �ʴ´�.
public class Ex4Set {

	public static void main(String[] args) {
		
		// ���׸� <String> : ���ڿ��� ���� �� �ִ�
		Set<String> set=new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("banana");
		set.add("orange");
		set.add("apple");
		set.add("kiwi");
//		set.add(100);	// String�� �ƴѰ�� �����߻�. ���ڿ��� ������ �Ǳ���
		System.out.println(set.size());
		System.out.println();
		
		System.out.println("��� ���1");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("��� ���2");
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			String s=iter.next();
			System.out.println(s);
		}
	}

}
