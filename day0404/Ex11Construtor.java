package day0404;

class Hello{
	int year,month,day;
	
	Hello(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void write() {
		System.out.println(year+"��"+month+"��"+day+"�ϻ��Դϴ�");
	}
}

class Hello2{
	int year,month,day;
	
	private Hello2(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	// private�� Ŭ�����θ� ����� �����ϱ⶧����
	// getInstance() �޼��带 ����ؼ� public static���� 
	// �����ؼ� ����ϸ� �ȴ�. 
	// static�� instance�� �ʿ����. new Hello2 �̷��� ���� ���ص� ��
	public static Hello2 getInstance() {
		return new Hello2(2010,12,25);
	}
	
	public void write() {
		System.out.println(year+"��"+month+"��"+day+"�ϻ��Դϴ�");
	}
}

public class Ex11Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello(2001,4,10);
		h.write();
		
		Hello2 h2=Hello2.getInstance();	// 27��.. 41����ó�� ����..
		h2.write();
	}

}
