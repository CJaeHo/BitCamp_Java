package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileReader fr=null;			// ���� �д°�
		BufferedReader br=null;		// �� ������ �д°�
		int num=0,sum=0, cnt=0;				// ����� ������
		double avg;
		try {
			fr=new FileReader("D:\\����ȣ 0314\\javawork\\score.txt");	// ���������Ű�
			br=new BufferedReader(fr);		// fr�� ������ �� ������ �����Ű�
			while(true) {					// �� ������ �д°Ÿ� �ݺ��Ҳ���
				
				String s=br.readLine();		// �̰� ���پ� �д°�
				if(s==null) {				// �� �о null���� ������ break
					break;
				}else {						// ���� ������ ������ ���
					System.out.println(s);	// s�� ����ϰ�
					num=Integer.parseInt(s);	
					// ��µ� s�� String�̴ϱ� �޴°Ŵ� String���� �ް� int������ ��ȯ�ؼ� num�� ����־�
					
					sum+=num;				// int�� ������ ������
					cnt++;					// ���� ä���
					
				}
			}
			avg=sum/(double)cnt;			// �� ������ ��� ����
			System.out.println("�� ���� : "+cnt+"��");
			System.out.println("���� : "+sum+"��");
			System.out.printf("��� : %.1f\n",avg);
			
		}catch(FileNotFoundException e){	// fr ������ ���� ��
			System.out.println("������ ����� : "+e.getMessage());
			
		} catch (IOException e) {
			e.printStackTrace();	// �̰Ŵ� ���پ� �д°ſ��� �μ��� ���� �� �߻�
		}finally {
			try {
				if(br!=null) br.close();	// �� ������ br�� ������ �ʾ��� �� �߻�
				if(fr!=null) fr.close();	// fr������ ������ �ʾ��� �� �߻�
			}catch(IOException e) {			
				
			}
		}
	}

}





