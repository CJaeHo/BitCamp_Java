package day0404;

// 생성자(Constructor)
// 특징 1. 객체 생성 시 자동 호출
// 		2. 생성자는 overloading이 가능하다
//		3. 생성자명은 반드시 클래스명과 동일해야한다
//		4. 리턴타입이 없다(형식:접근지정자 클래스명(인자))
//		5. 주로 멤버변수의 초기화를 담당한다
//		6. 같은 생성자끼리는 this()로 호출

class Sawon{
	String name;
	String gender;
	String buseo;
	
	Sawon(){
		
		this("김길동","남자","홍보부");	// 3번째 생성자 호출
//		System.out.println("기본 생성자");
//		name="김길동";
//		gender="남자";	// 이거 3개를 줄여서 쓸 수 있음
//		buseo="홍보부";
	}
	
//	Sawon(String name){
//		this.name=name;
//		gender="여자";
//		buseo="교육부";
//	}
	
	Sawon(String name,String gender,String buseo){
		this.name=name;
		this.gender=gender;
		this.buseo=buseo;
		
	}
	
	public void write() {
		System.out.println("이름:"+name);
		System.out.println("성별:"+gender);
		System.out.println("부서:"+buseo);
		System.out.println();
	}
}
public class Ex10Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.write();

//		Sawon s2=new Sawon("이영자");	// 23번줄 
//		s2.write();
		
		Sawon s3=new Sawon("이미도","여자","인사부");
		s3.write();
	}

}
