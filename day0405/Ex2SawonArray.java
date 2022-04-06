package day0405;

import java.util.Scanner;

import day0404.Ex2Class;

public class Ex2SawonArray {
	Scanner sc;
	int inwon;
	Sawon[] sawon;
	
	public Ex2SawonArray() {
		sc=new Scanner(System.in);
	}
	
	// 키보드로 인원수를 입력받아 sawon을 배열할당 후 입력받기
	public void dataInwon() {
		System.out.println("인원수를 입력하세요");
		inwon=Integer.parseInt(sc.nextLine());
		// 사원 배열 할당
		sawon=new Sawon[inwon];
		// 배열 갯수만큼 입력받아서 생성자 호출하기
		for(int i=0;i<sawon.length;i++) {
			System.out.println("사원명:");
			String name=sc.nextLine();
			System.out.println("소속부서명:");
			String buseo=sc.nextLine();
			System.out.println("기본급:");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("초과근무시간수:");
			int time=Integer.parseInt(sc.nextLine());
			
			// Sawon 생성
			sawon[i]=new Sawon(name,buseo,pay,time);
			System.out.println();
		}
	}
	// 제목
	public static void showTitle() {
		System.out.println("----------------------------------------");
		System.out.println("번호\t사원명\t부서명\t기본급\t초과시간\t시간수당\t실수령액");			
		System.out.println("----------------------------------------");
	}
	
	// 출력
	public void dataWrite() {
		for(int i=0;i<sawon.length;i++) {
			System.out.println((i+1)+"\t"+sawon[i].getName()+"\t"+
		sawon[i].getBuseo()+"\t"+sawon[i].getPay()+"\t"+sawon[i].getOvertime()
		+"\t"+sawon[i].getTimeSudang()+"\t"+sawon[i].getNetPay());
		}
		// 위에 23번줄 사원 배열 할당에서 for(Sawon s: sawon) 이런식으로 하니까 안됨
		// 배열 인덱스마다 할당을 해줘야해서 for(i=0; ~~~) 이걸로 해주고
		// 33번줄 Sawon 생성에서 sawon[i]로 각각의 인덱스에 넣어줘야댐
	}
	public static void main(String[] args) {
		
		// 메서드 호출부분만 직접 코딩해보기
		// 입력 후 제목출력 그리고 데이타 출력(순서)
		
		Ex2SawonArray ex=new Ex2SawonArray();
		ex.dataInwon();
		showTitle();
		ex.dataWrite();
	}

}
