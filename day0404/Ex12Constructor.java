package day0404;

import java.util.Date;
import java.util.Calendar;

public class Ex12Constructor {
	Date date;
	Calendar cal;
	public Ex12Constructor(){
		date=new Date();
//		cal=new Calendar();	// �����ڰ� protected�� ������ �ȵ�
		cal=Calendar.getInstance();	// �̷��� getInstance�� �̿��ؾ� ��
	}
	public void write(){
		int y=date.getYear()+1900;
		int m=date.getMonth()+1;
		int d=date.getDay();
		System.out.println("���ó�¥"+y+"��"+m+"��"+d+"��");
	}
	public void write2(){
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH)+1;
		int d=cal.get(Calendar.DATE);
		System.out.println("���ó�¥"+y+"��"+m+"��"+d+"��");
	}

	public static void main(String[] args) {
		Ex12Constructor ex=new Ex12Constructor();
		ex.write();
		ex.write2();
	}
}