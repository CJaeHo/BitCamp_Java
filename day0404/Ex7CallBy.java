package day0404;

public class Ex7CallBy {
	
	public static void dataIn(Person p) {
		p.name="����ȣ";
		p.addr="�ǿ�";
	}

	public static void dataOut(Person p) {
		System.out.println("** �� Ȯ�� **");
		System.out.println("�̸�:"+p.name+", �ּ�:"+p.addr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person=new Person();
		// �ּҰ� ���޵ǹǷ� dataIn���� �Էµ� ����Ÿ�� person�� ����ȴ�
		dataIn(person);
		// dataIn���� ������ ����Ÿ�� ��µȴ�.
		dataOut(person);
	}

}
