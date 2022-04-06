package day0406;

public class Ex7Exception {

	public static void main(String[] args) {
		int[] arr= {4,6,7,8};
		for(int i=0; i<=arr.length;i++) {
			try {
				System.out.println(arr[i]);				
			}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();	// 에러메세지 추적해서 확인하는거
				System.out.println("배열 오류 : "+e.getMessage());
				// 오류 메세지만 보고싶을 때 간편하게 간단하게 볼 수 있음
			}
		}
		System.out.println("*** 정 상 종 료 됨***");
	}

}
