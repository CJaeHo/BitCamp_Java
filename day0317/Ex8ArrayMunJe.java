package day0317;

import java.util.Scanner;

public class Ex8ArrayMunJe {

	public static void main(String[] args) {
		
		String[] members= {"강소라","이진","강호동","이효리","손미나","유재석","손철수","유미리","이제니","강민"};
		String name;	// 입력받을 이름
		int cnt;	// 인원수 구할 변수
		
		Scanner sc = new Scanner(System.in);
		
//		검색할 이름 : 이진
//			이진님은 2번째에 있습니다
//		검색할 이름 : 이준희
//			이준희님은 명단에 없습니다
//		검색할 이름 : exit
//			** 검색을 종료합니다 **
		
		
		
		
		while(true) {
			cnt=0;
			System.out.print("검색할 이름 : ");
			name=sc.nextLine();
			
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("** 검색을 종료합니다 **");
				break;
			}
			
			for(int i=0; i<members.length; i++) {
				if(members[i].equals(name)) {
					cnt++;
					System.out.println(name+"님은 "+(cnt+1)+"번째에 있습니다.");
					
				}
			}
			if(cnt == 0) {
					System.out.println("이준희님은 명단에 없습니다.");
			}
			
			

		}
		
		

		
		
		
//		while(true) {
//			
//			cnt=0;
//			
//			System.out.print("검색할 이름 : ");
//			name=sc.nextLine();
//			
//			if(name.equalsIgnoreCase("exit")) {		// 대문자로 입력될 수도 있으니 대소문자 상관없는걸로!
//				System.out.println("** 검색을 종료합니다 **");
//				break;
//			}
//			
//			for(int i=0;i<members.length;i++) {
//				if(name.equals(members[i])) {
//					cnt++;
//					System.out.println(name+"님은 "+ (cnt+1) +"번째에 있습니다!");
//				}
//			}
//			if(cnt == 0)
//				System.out.println(name+"님은 명단에 없습니다....");
//		}
//		
//		
		
	}

}
