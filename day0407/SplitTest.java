package day0407;

import java.util.StringTokenizer;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="red,green,blue,yellow,pink";
		//,�� ���ڿ��� �и��Ͽ� ����ϴ� ��� 2����
		System.out.println("split�� �̿��Ͽ� �и��ϴ� ���");
		String []color=str.split(",");
		for(String c:color)
			System.out.println(c);
		System.out.println();
		System.out.println("StringTokenizer ��� Ŭ������ �̿��ϴ� ���");
		StringTokenizer st=new StringTokenizer(str, ",");
		System.out.println("�и��� ��ū��:"+st.countTokens());
		while(st.hasMoreTokens())//���� ��ū�� �ִµ��� �ݺ�
		{
			String s=st.nextToken();
			System.out.println(s);
		}
	}

}
