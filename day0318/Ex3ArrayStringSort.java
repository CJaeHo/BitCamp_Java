package day0318;

public class Ex3ArrayStringSort {

	public static void main(String[] args) {


		String[] names= {"한가인", "강호동", "유재석", "Adams", "한경"};
		
		
		for(int i=0; i<names.length-1 ;i++) {
			for(int j=0; j<names.length ;j++) {
				// i번지 값이 작을경우 - 값이 나오기 때문에
				// 더 클경우에만 변경됨(양수값)
				if(names[i].compareTo(names[j])>0) {	// 0보다 작다는 오름차순
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		// 출력
		for(int i=0; i<names.length ; i++) {
			System.out.println(i+"=>"+names[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
