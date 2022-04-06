package day0404;

import java.util.Date;
import java.util.Calendar;

public class Ex12Constructor {
	Date date;
	Calendar cal;
	public Ex12Constructor(){
		date=new Date();
//		cal=new Calendar();	// 생성자가 protected라 생성이 안됨
		cal=Calendar.getInstance();	// 이렇게 getInstance를 이용해야 함
	}
	public void write(){
		int y=date.getYear()+1900;
		int m=date.getMonth()+1;
		int d=date.getDay();
		System.out.println("오늘날짜"+y+"년"+m+"월"+d+"일");
	}
	public void write2(){
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH)+1;
		int d=cal.get(Calendar.DATE);
		System.out.println("오늘날짜"+y+"년"+m+"월"+d+"일");
	}

	public static void main(String[] args) {
		Ex12Constructor ex=new Ex12Constructor();
		ex.write();
		ex.write2();
	}
}