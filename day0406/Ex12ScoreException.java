package day0406;
// ScoreException

import java.util.Scanner;

class ScoreException extends Exception{
	public ScoreException(String msg) {
		super(msg);
	}
}

public class Ex12ScoreException {
	// writeScore(int score)
	// 1~100 ������ ���� ���� "�� ������ 90���Դϴ�"��� ���
	// �� �̿ܿ��� ScoreException�� �����߻�(�޼����� "�߸��� �����Դϴ�")
	public static void writeScore(int score) throws ScoreException{
		if(score < 1 || score > 100) {
			throw new ScoreException("�߸��� �����Դϴ�");
		}else
			System.out.println("�� ������ "+score+"�� �Դϴ�");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��ϼ���");
			int score=sc.nextInt();
			if(score==0) {
				break;
			}
			try {
				writeScore(score);
			}catch(ScoreException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("���� ����");
	}

}
