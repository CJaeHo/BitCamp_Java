package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex14FileReaderException {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;		// �� ������ �д� �޼��带 ������ ����
		
		try {	// �����ٿ� Ctrl+1 ������ ��
			fr=new FileReader("D:\\\\����ȣ 0314\\\\javawork\\\\memo1.txt");
			br=new BufferedReader(fr);	// �� ������ �д� �޼��带 ������ �ִ� ������ ��
			while(true) {
				String s=br.readLine();	// �����б�
				if(s==null) {	// ���پ� �дٰ� �������ٱ��� ������ null���� ��ȯ
					break;
				}else {
					System.out.println(s);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �����: "+e.getMessage());	// ������ ���� ��� �߻��ϰ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// Ȥ�ó� ������ �ʾҴµ� �����ԵǸ� ������ ���ϱ�
				// ������ �ʾ��� �� ���� null�� �ƴϸ� ������ �س��°�
				// ������ ������ �� ����
				if(br!=null) br.close();		// �ݴ°ſ��� ������ ���� ���߿� ������ ���� ������ �ؾ���
				if(fr!=null) fr.close();		// ���� ���� ������ �������� ��������
			}catch (IOException e) {
				
			}
		}

	}

}
