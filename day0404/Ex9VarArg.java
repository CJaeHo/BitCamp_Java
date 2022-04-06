package day0404;

public class Ex9VarArg {

	// ...는 같은 타입으로 갯수에 상관없이 인자로
	// 받을 수 있으며 배열 타입으로 받는다
	public static void writeColor(String...color) {
		System.out.println("총 "+color.length+"개");
		for(String s:color) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	public static int sum(int...n) {
		int s=0;
		for(int a:n) {
			System.out.println(a);
			s+=a;
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeColor();
		writeColor("red");
		writeColor("노랑","빨강","파랑");
		writeColor("green","orange","bule","pink","yellow");
		
		System.out.println("** 아래의 메서드를 만들어보세요 **");
		int s=sum(3,5,6);	// sum은 전달받은 숫자 출력 후 합계를 구해서 리턴
		System.out.println("합계:"+s);
		
		int s2=sum(10,20,30,67,77);
		System.out.println("합계:"+s);
	}

}
