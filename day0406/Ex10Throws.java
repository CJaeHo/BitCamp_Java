package day0406;

public class Ex10Throws {
	public static void test1(String su1, String su2) throws NumberFormatException{
		int sum=Integer.parseInt(su1)*Integer.parseInt(su2);
		System.out.println(su1+"과"+su2+"의"+" 곱한 값은"+sum+"입니다");
	}
	public static void main(String[] args) {
		try {
			test1("4","5");
			test1("100","200");
			test1("백","삼백");		// 여기서 이셉션이 발생하면 그다음
			test1("2","3");			// 이부분은 실행이 안되고 종료되어짐
		}catch (NumberFormatException e) {
			System.out.println("문자가 전달되었어요 : "+e.getMessage());
		}
		System.out.println("*** 정 상 종 료 됨 ***");

	}

}
