package day0318;

public class Ex6Array2chawon {

	public static void main(String[] args) {
		
		
		// 2차원 배열은 행과 열로 메모리 할당
		int[][] arr = new int[2][3];	// 2행 3열
		System.out.println("행의 갯수 : "+arr.length);
		System.out.println("0행의 갯수 : "+arr[0].length);
		System.out.println("1행의 갯수 : "+arr[1].length);
		
		// 초기값
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("[%d] [%d] : %d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("2차원 배열에 값 넣은 후 다시 출력");
		arr[0][0]=10;
		arr[1][1]=15;
		arr[1][2]=30;


		// 초기값
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("[%d] [%d] : %d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
