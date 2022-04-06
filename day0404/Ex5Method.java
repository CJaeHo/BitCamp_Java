package day0404;

class Score{
	private int java;
	private int spring;
	
	// setter method
	public void setJava(int java) {
		this.java=java;
	}
	public void setSpring(int spring) {
		this.spring=spring;
	}
	
	// getter method
	public int getJava() {
		return java;		// this. 생략됨
	}
	public int getSpring() {
		return spring;		// this. 생략됨
	}
}

class Student{
	// 모든 멤버변수는 초기값이 없을 경우 null이 초기값
	private String name;
	public Score score=new Score();		// 앞에 Score이 클래스라서 선언해줘야 함
	// class안에 Score라는 class가 있음

	// setter, getter
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;	// this. 생략됨
	}



}

public class Ex5Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		// 이름 전달
		stu.setName("송혜교");
		// 두과목의 점수
		stu.score.setJava(90);		// class안에 class변수가 있음
		stu.score.setSpring(100);
		
		// 출력(이름,자바점수,스프링점수 출력하기
		
		System.out.println("이 름 : "+stu.getName());
		System.out.println("자바점수 : "+stu.score.getJava());
		System.out.println("스프링점수 : "+stu.score.getSpring());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
