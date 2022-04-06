package day0406;

import java.util.Scanner;

// ����� ���� Ŭ���� ����
class UserException extends Exception{
	public UserException(String msg) {
		super(msg);		// ������ �޼����� ���
	}
}

public class Ex11UserException {
	
	public static void writeContent(String msg) throws UserException{
		if(msg.contains("�ٺ�") ||  msg.contains("��û")) {
			throw new UserException("���� ���ô�!");			
		}else {
			System.out.println("�޼��� "+msg);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("�ƹ� �����̳� �Է��Ͻÿ�");
			String msg=sc.nextLine();
			if(msg.equals("��")) {
				break;
			}
			try {
				writeContent(msg);
			}catch (UserException e) {
				System.out.println("�����޼��� : "+e.getMessage());
			}
		}
		System.out.println("���� ����");
	}

}
