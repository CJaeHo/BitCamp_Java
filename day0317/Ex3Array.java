package day0317;

public class Ex3Array {

	public static void main(String[] args) {
		
		char ch[];
		ch=new char[4];
		System.out.println("length="+ch.length);
		
		System.out.println("** 초기값 출력 **");
		for(int i=0;i<ch.length;i++) {
			System.out.println((int)ch[i]);
			System.out.println(ch[i]);
		}
		
		ch[0]='A';
		ch[1]=67;	//C
		ch[2]=90;	//Z
		ch[3]='*';
		
		System.out.println("배열 출력 방법 1");
		for(int i=0;i<ch.length;i++) {	// 배열의 첫번쨰 자리위치는 0이기 떄문에 눈에 보이는 공간(4)보다는 길이(length)로 적어야함
			System.out.printf("%3c",ch[i]);
		}
		System.out.println();
		System.out.println("배열 출력 방법 2");
		for(char a:ch)	// 배열의 횟수 만큼 자동으로 들어와짐
			System.out.printf("%3c",a);
		
		

		}

}


