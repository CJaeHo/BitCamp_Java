package day0317;

import java.util.Scanner;

public class Ex7ArrayMunJe {

	public static void main(String[] args) {
		
		
		
//		String members[]= {"강소라","이진","강호동","이효리","손미나","유재석","손철수","유미리","이제니","강민"};
//		String name;	// 입력받을 이름
//		int cnt;	// 인원수 구할 변수
//		문제 :	성을 입력하면 해당 성을 가진 사람을 출력하고
//				총 몇명인지 출력하기
//				(예)		검색할 성 : 이
//						1: 이진
//						3: 이효리
//						8: 이제니
//						총 3명
//						검색할 성 : 박
//						박씨성은 없음
//						검색할 성 : 끝				equals 사용,,,,,
//							*** 종료합니다 ***
//				String의 startswith 사용
		
		
			
//		Scanner sc = new Scanner(System.in);
//		
//
//		
//		while(true) {
//			cnt=0;						
//			// 있는 성을 먼저 입력했을 경우 cnt에는 그에 맞는 카운트가 
//			// 들어가있기 때문에 0으로 초기화를 계속 해줘야함.
//			System.out.print("검색할 성 : ");
//			name=sc.nextLine();
//			
//			if(name.equals("끝")){
//				System.out.println("*** 종료합니다 ***");
//				break;
//			}	
//			
//			for(int i=0;i<members.length;i++) {
//				if(members[i].startsWith(name)) {	// 해당 성으로 시작 할 경우 true
//					
//					System.out.println(i+": "+members[i]);
//					cnt++;
//				}
//			}
//			if(cnt == 0) {				
//				System.out.println(name+"씨성은 없음!!");
//			}
//			else {
//				System.out.println("총 "+cnt+"명");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		String[] members= {"강소라","이진","강호동","이효리","손미나","유재석","손철수","유미리","이제니","강민"};
		String name;	// 입력받을 이름
		int cnt;	// 인원수 구할 변수
//		문제 :	성을 입력하면 해당 성을 가진 사람을 출력하고
//				총 몇명인지 출력하기
//				(예)		검색할 성 : 이
//						1: 이진
//						3: 이효리
//						8: 이제니
//						총 3명
//						검색할 성 : 박
//						박씨성은 없음
//						검색할 성 : 끝				equals 사용,,,,,
//							*** 종료합니다 ***
//				String의 startswith 사용
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			cnt = 0;
			System.out.print("검색할 성 : ");
			name=sc.nextLine();
			
			if(name.equals("끝")) 
			{
				System.out.println("*** 종료합니다 ***");
				break;
			}
			
			for(int i=0; i<members.length; i++) 
			{
				if(members[i].startsWith(name)) 
				{
					System.out.println(i+": "+members[i]);
					cnt++;
				}
			}
			if(cnt == 0) {
				System.out.println(name+"성씨는 없음");
			}
			else {
				System.out.println("총 "+cnt+"명");				
			}
			
			
			
			
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
