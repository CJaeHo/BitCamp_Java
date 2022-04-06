package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileReader fr=null;			// 파일 읽는거
		BufferedReader br=null;		// 줄 단위로 읽는거
		int num=0,sum=0, cnt=0;				// 출력할 변수들
		double avg;
		try {
			fr=new FileReader("D:\\최재호 0314\\javawork\\score.txt");	// 파일읽을거고
			br=new BufferedReader(fr);		// fr의 파일을 줄 단위로 읽을거고
			while(true) {					// 줄 단위씩 읽는거를 반복할꺼고
				
				String s=br.readLine();		// 이게 한줄씩 읽는거
				if(s==null) {				// 다 읽어서 null값이 나오면 break
					break;
				}else {						// 아직 읽을게 있으면 출력
					System.out.println(s);	// s를 출력하고
					num=Integer.parseInt(s);	
					// 출력된 s가 String이니까 받는거는 String으로 받고 int형으로 변환해서 num에 집어넣어
					
					sum+=num;				// int로 들어갔으니 괜찮고
					cnt++;					// 갯수 채우고
					
				}
			}
			avg=sum/(double)cnt;			// 다 읽으면 평균 구하
			System.out.println("총 개수 : "+cnt+"개");
			System.out.println("총점 : "+sum+"점");
			System.out.printf("평균 : %.1f\n",avg);
			
		}catch(FileNotFoundException e){	// fr 파일이 없을 때
			System.out.println("파일이 없어요 : "+e.getMessage());
			
		} catch (IOException e) {
			e.printStackTrace();	// 이거는 한줄씩 읽는거에서 인셉션 없을 때 발생
		}finally {
			try {
				if(br!=null) br.close();	// 뭔 문제로 br이 열리지 않았을 때 발생
				if(fr!=null) fr.close();	// fr파일이 열리지 않았을 때 발생
			}catch(IOException e) {			
				
			}
		}
	}

}





