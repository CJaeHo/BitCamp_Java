package day0407;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex5Map {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		// map�� k,v�� ������ ����Ÿ �߰�
		map.put("name", "������");
		map.put("name", "�̼Ҷ�");	// ���� key�� ��� ����Ⱑ ��
		map.put("age", "32");
		map.put("addr", "����");
		System.out.println(map.size());
		
		System.out.println("** ���1 : Key������ ����� �� ���");
		System.out.println("�̸�: "+map.get("name"));
		System.out.println("����: "+map.get("age"));
		System.out.println("�ּ�: "+map.get("addr"));
		System.out.println("������: "+map.get("blood"));
		// �ش� key�� 12~14��ó�� ���� ��쵵 Ȯ���غ���
		
		System.out.println("** ���2: key�� ���� ��ü���� �� �ش� v�� ���");
		// key�� Ÿ���� Set Ÿ���̶� ����(��������̰� �ߺ�x)
		Set<String> keys=map.keySet();
		for(String key:keys) {
			String v=map.get(key);
			System.out.println(key+":"+v);
		}
	}	

}
