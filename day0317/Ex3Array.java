package day0317;

public class Ex3Array {

	public static void main(String[] args) {
		
		char ch[];
		ch=new char[4];
		System.out.println("length="+ch.length);
		
		System.out.println("** �ʱⰪ ��� **");
		for(int i=0;i<ch.length;i++) {
			System.out.println((int)ch[i]);
			System.out.println(ch[i]);
		}
		
		ch[0]='A';
		ch[1]=67;	//C
		ch[2]=90;	//Z
		ch[3]='*';
		
		System.out.println("�迭 ��� ��� 1");
		for(int i=0;i<ch.length;i++) {	// �迭�� ù���� �ڸ���ġ�� 0�̱� ������ ���� ���̴� ����(4)���ٴ� ����(length)�� �������
			System.out.printf("%3c",ch[i]);
		}
		System.out.println();
		System.out.println("�迭 ��� ��� 2");
		for(char a:ch)	// �迭�� Ƚ�� ��ŭ �ڵ����� ������
			System.out.printf("%3c",a);
		
		

		}

}


