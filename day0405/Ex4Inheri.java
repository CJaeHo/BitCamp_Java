package day0405;

class Color{
	private String colorName;
	
	Color(){
//		System.out.println("super 디폴트 생성자");
	}
	
	Color(String colorName){
		this.colorName=colorName;
//		System.out.println("super 2번째 생성자");
	}
	
	// 출력하는 메서드를 만들고싶어
	public void write() {
		System.out.println("자동차색"+colorName);
	}
}
////////////////////////////
class Red extends Color{
	private String myCar;	// 파라미터?
	Red(){
//		super();		// 이게 생략되어있음. 생략되어있다고 호출이 안되는게 아님
						// 부모의 디폴트 생성자가 호출되는거임. 디폴트만 이럼
		super("노랑");	// 근데 이렇게 인자가 있는 생성자는 생략이 안됨.
						// 그리고 반드시 첫줄에 입력되어야함
//		System.out.println("sub 디폴트 생성자");
	}
	Red(String myCar,String colorName){
		super(colorName);	// super 2번째 생성자가 호출되고
		this.myCar=myCar;
	}
	
	@Override		// 오버라이드는 부모랑 똑같이 만드는거
	public void write() {
		// TODO Auto-generated method stub
		super.write();		// 이거는 super()처럼 맨앞에 와야되고 그런거 없음
							// 먼저 실행이 되야하면 앞에 뒤에 실행되어야하면 뒤에 적으면 됨
		System.out.println("내차이름:"+myCar);
	}
}

public class Ex4Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red r1=new Red();
		r1.write();
		System.out.println("------");
		Red r2=new Red("소나타","진주펄색");
		r2.write();
	}

}
