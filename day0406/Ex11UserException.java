package day0406;

import java.util.Scanner;

// 사용자 예외 클래스 구현
class UserException extends Exception{
	public UserException(String msg) {
		super(msg);		// 예외의 메세지로 등록
	}
}

public class Ex11UserException {
	
	public static void writeContent(String msg) throws UserException{
		if(msg.contains("바보") ||  msg.contains("멍청")) {
			throw new UserException("고운말을 씁시다!");			
		}else {
			System.out.println("메세지 "+msg);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("아무 문장이나 입력하시오");
			String msg=sc.nextLine();
			if(msg.equals("끝")) {
				break;
			}
			try {
				writeContent(msg);
			}catch (UserException e) {
				System.out.println("오류메세지 : "+e.getMessage());
			}
		}
		System.out.println("정상 종료");
	}

}
