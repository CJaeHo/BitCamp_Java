package day0318;

public class Ex2StringCompare {

	public static void main(String[] args) {


		System.out.println("Apple".compareTo("Apple"));		// 같을경우 0
		System.out.println("Apple".compareTo("Banana"));	// 오름차순 -1 B가 1 더 크다는 뜻
		System.out.println("Hello".compareTo("Hi"));		// 오름차순 -4 i가 4 더 크다는 뜻
		System.out.println("Hello".compareTo("Apple"));		// 내림차순 7  A가 7 더 작다는 뜻

	}

}
