package day0406;


abstract class AbstA{
	abstract public void hello();
}

interface InterAnnoy{
	public void process();
}

public class Ex6AnnoyClass {
	AbstA aa=new AbstA() {		
		// abstract�� �ϸ� ���� process(new ChildA()); �̷������� �����߾��µ� �̰� �ٸ���..
		
		@Override
		public void hello() {
			System.out.println("hello:�͸� ����Ŭ�������� �����Ͽ���");
			
		}
	};
	
	InterAnnoy ia=new InterAnnoy() {
		
		@Override
		public void process() {
			System.out.println("process:�͸� ���η� �����Ͽ���");
			
		}
	};
	public static void main(String[] args) {
		Ex6AnnoyClass ex=new Ex6AnnoyClass();
		ex.aa.hello();
		ex.ia.process();

	}

}
