package day0404;

// ������(Constructor)
// Ư¡ 1. ��ü ���� �� �ڵ� ȣ��
// 		2. �����ڴ� overloading�� �����ϴ�
//		3. �����ڸ��� �ݵ�� Ŭ������� �����ؾ��Ѵ�
//		4. ����Ÿ���� ����(����:���������� Ŭ������(����))
//		5. �ַ� ��������� �ʱ�ȭ�� ����Ѵ�
//		6. ���� �����ڳ����� this()�� ȣ��

class Sawon{
	String name;
	String gender;
	String buseo;
	
	Sawon(){
		
		this("��浿","����","ȫ����");	// 3��° ������ ȣ��
//		System.out.println("�⺻ ������");
//		name="��浿";
//		gender="����";	// �̰� 3���� �ٿ��� �� �� ����
//		buseo="ȫ����";
	}
	
//	Sawon(String name){
//		this.name=name;
//		gender="����";
//		buseo="������";
//	}
	
	Sawon(String name,String gender,String buseo){
		this.name=name;
		this.gender=gender;
		this.buseo=buseo;
		
	}
	
	public void write() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+gender);
		System.out.println("�μ�:"+buseo);
		System.out.println();
	}
}
public class Ex10Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.write();

//		Sawon s2=new Sawon("�̿���");	// 23���� 
//		s2.write();
		
		Sawon s3=new Sawon("�̵̹�","����","�λ��");
		s3.write();
	}

}
