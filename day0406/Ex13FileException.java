package day0406;

import java.io.FileWriter;
import java.io.IOException;

public class Ex13FileException {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {		// 2��° ������ true�� ����Ⱑ�ƴ϶� �߰��� ��
			fw=new FileWriter("D:\\����ȣ 0314\\javawork\\memo1.txt",true); // �� ��ġ�� ����
			fw.write("�̸�:������\n");								// true�� ���� �� ����� ���� ����Ⱑ ��
			fw.write("�ּ�:��õ\n");
			fw.write("-----------------\n");
			System.out.println("������ Ȯ���ϼ���");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	// Ŭ����� �׻� �߻��Ǿ�� �ϱ� ������ finally�� �ִ°� �Ϲ���
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
