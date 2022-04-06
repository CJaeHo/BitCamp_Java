package day0404;

class Hello{
	int year,month,day;
	
	Hello(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void write() {
		System.out.println(year+"년"+month+"월"+day+"일생입니다");
	}
}

class Hello2{
	int year,month,day;
	
	private Hello2(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	// private는 클래스로만 사용이 가능하기때문에
	// getInstance() 메서드를 사용해서 public static으로 
	// 변경해서 사용하면 된다. 
	// static은 instance가 필요없음. new Hello2 이렇게 선언 안해도 됨
	public static Hello2 getInstance() {
		return new Hello2(2010,12,25);
	}
	
	public void write() {
		System.out.println(year+"년"+month+"월"+day+"일생입니다");
	}
}

public class Ex11Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello(2001,4,10);
		h.write();
		
		Hello2 h2=Hello2.getInstance();	// 27번.. 41번줄처럼 안함..
		h2.write();
	}

}
