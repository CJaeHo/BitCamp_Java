package day0406;

public class Ex10Throws {
	public static void test1(String su1, String su2) throws NumberFormatException{
		int sum=Integer.parseInt(su1)*Integer.parseInt(su2);
		System.out.println(su1+"��"+su2+"��"+" ���� ����"+sum+"�Դϴ�");
	}
	public static void main(String[] args) {
		try {
			test1("4","5");
			test1("100","200");
			test1("��","���");		// ���⼭ �̼����� �߻��ϸ� �״���
			test1("2","3");			// �̺κ��� ������ �ȵǰ� ����Ǿ���
		}catch (NumberFormatException e) {
			System.out.println("���ڰ� ���޵Ǿ���� : "+e.getMessage());
		}
		System.out.println("*** �� �� �� �� �� ***");

	}

}
