package day0407;

import java.util.List;
import java.util.Vector;

public class Ex7List {

	public static void main(String[] args) {
		List<String> list=new Vector<String>();
		list.add("��ξ�");
		list.add("����");
		list.add("��ȣ��");
		list.add("�̿���");
		list.add("���缮");
		System.out.println("����Ÿ ����:"+list.size());
		
		System.out.println("��¹�� #1");
		int idx=0;
		for(String s:list) {
			System.out.println(++idx+":"+s);
		}
		System.out.println();
		System.out.println("��¹�� #2");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+":"+list.get(i));
		}
	}

}
