package day0404;

public class Ex4Method {
	private String name;	// 얘는 같은 클래스 내에서만 접근이 가능함.
	private int age;		// 정확한 호칭은 멤버변수라고 함.

	// setter method = 값 변경 시 필요한 메서드..
	public void setName(String name) {
		this.name=name;		
		// 인자가 같은 이름일 경우 멤버변수명 앞에 반드시 this를 붙이기
		// 무슨말이냐... 4번쨰 줄에서 name과 8번째 줄에서 name이 서로 겹치기 때문에
		// 4번째줄에 있는 name을 표시할 때는 this.name 이렇게 해줘야 한다는거지
		// 원래 this. 이거는 생략이 가능한데 변수명이 겹치면 구분해줘야 함.
		// 만약 변수명이 다르다면 this. 빼고 해줘도 됨.
	}
	public void setAge(int age) {
		this.age=age;
	}
	//-----------------------------------------------------------------------------
	
	// getter method = 멤버변수 값을 반환하기 위한 메서드
	public String getName() {
		return name;	// this.이 생략되어있음.
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Method ex1=new Ex4Method();
		ex1.setName("이기자");
		ex1.setAge(25);

		Ex4Method ex2=new Ex4Method();
		ex2.setName("강기자");
		ex2.setAge(30);
		
		System.out.println("이름 : "+ex1.getName());
		System.out.println("나이 : "+ex1.getAge());
		// system.out에서 out은 static.. 왜?? class를 쓰니깐

		System.out.println("이름 : "+ex2.getName());
		System.out.println("나이 : "+ex2.getAge());
		
	}

}
