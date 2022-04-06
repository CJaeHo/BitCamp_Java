package day0406;

import java.io.FileWriter;
import java.io.IOException;

public class Ex13FileException {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {		// 2번째 인자인 true는 덮어쓰기가아니라 추가가 됨
			fw=new FileWriter("D:\\최재호 0314\\javawork\\memo1.txt",true); // 이 위치에 생김
			fw.write("이름:한지혜\n");								// true가 없을 땐 변경된 값은 덮어쓰기가 됨
			fw.write("주소:인천\n");
			fw.write("-----------------\n");
			System.out.println("파일을 확인하세요");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	// 클로즈는 항상 발생되어야 하기 떄문에 finally에 넣는게 일반적
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
