package day0316;
import java.util.Scanner;

public class Ex8ForGugu {

	public static void main(String[] args) {


		// ������ ���ڸ� �Է¹޾� �ش���� ����Ͻÿ�(�ݺ�)
//		�� 0 �Է� �� ����
//		while�� �ȿ� for���� �̿��ؼ� ������ ����ϱ�
		
		
		
		Scanner sc = new Scanner(System.in);
		int dan;
		while(true) {
			
			System.out.println("������ �Է��ϼ���");
			dan=sc.nextInt();
			
			if(dan == 0) {
				System.out.print("�������� �����մϴ�");
				break;
			}
			
			System.out.printf("%d�� ������ ����!\n",dan);
			
			for(int a=1;a<=9;a++) {
				int mul = dan * a;
				System.out.printf("%d * %d = %d\n",dan,a,mul);			
				
			}
			System.out.println();
		}
		//---------------------------------------------------------------------
		
		while(true) {
			System.out.println("������ �Է�");
			dan=sc.nextInt();
			// 0�� ��� break
			if(dan == 0)
				break;
			// 2~9�� �ƴҰ�� �ٽ� �Է�(continue)
			if(dan >=2 || dan <= 9)
				continue;
			if(!(dan>=2&&dan<=9)) {
				System.out.println("***�ٽ� �Է��� �ּ��� ***");
				continue;
			}
			// �� ���� ���
			System.out.println("**"+dan+"��**");
			// for���� �̿��ؼ� ������ ���
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"x"+i+"="+dan*i);
			}
			System.out.println();
		
		}

	}

}
