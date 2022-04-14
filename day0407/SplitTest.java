package day0407;

import java.util.StringTokenizer;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="red,green,blue,yellow,pink";
		//,로 문자열을 분리하여 출력하는 방법 2가지
		System.out.println("split을 이용하여 분리하는 방법");
		String []color=str.split(",");
		for(String c:color)
			System.out.println(c);
		System.out.println();
		System.out.println("StringTokenizer 라는 클래스를 이용하는 방법");
		StringTokenizer st=new StringTokenizer(str, ",");
		System.out.println("분리할 토큰수:"+st.countTokens());
		while(st.hasMoreTokens())//읽을 토큰이 있는동안 반복
		{
			String s=st.nextToken();
			System.out.println(s);
		}
	}

}
