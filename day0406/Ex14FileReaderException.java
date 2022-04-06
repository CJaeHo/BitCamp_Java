package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex14FileReaderException {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;		// 줄 단위로 읽는 메서드를 가지고 있음
		
		try {	// 빨간줄에 Ctrl+1 누르면 됨
			fr=new FileReader("D:\\\\최재호 0314\\\\javawork\\\\memo1.txt");
			br=new BufferedReader(fr);	// 줄 단위로 읽는 메서드를 가지고 있는 유일한 놈
			while(true) {
				String s=br.readLine();	// 한줄읽기
				if(s==null) {	// 한줄씩 읽다가 마지막줄까지 읽으면 null값을 반환
					break;
				}else {
					System.out.println(s);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요: "+e.getMessage());	// 파일이 없을 경우 발생하겠지
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// 혹시나 열리지 않았는데 닫히게되면 오류가 나니깐
				// 열리지 않았을 때 값인 null이 아니면 닫히게 해놓는게
				// 오류를 방지할 수 있음
				if(br!=null) br.close();		// 닫는거에도 순서가 있음 나중에 열린게 먼저 닫히게 해야함
				if(fr!=null) fr.close();		// 제일 먼저 열린게 마지막에 닫히도록
			}catch (IOException e) {
				
			}
		}

	}

}
