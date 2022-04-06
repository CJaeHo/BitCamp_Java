package day0406;


abstract class AbstA{
	abstract public void hello();
}

interface InterAnnoy{
	public void process();
}

public class Ex6AnnoyClass {
	AbstA aa=new AbstA() {		
		// abstract로 하면 원래 process(new ChildA()); 이런식으로 선언했었는데 이건 다르네..
		
		@Override
		public void hello() {
			System.out.println("hello:익명 내부클래스에서 구현하였음");
			
		}
	};
	
	InterAnnoy ia=new InterAnnoy() {
		
		@Override
		public void process() {
			System.out.println("process:익명 내부로 구현하였음");
			
		}
	};
	public static void main(String[] args) {
		Ex6AnnoyClass ex=new Ex6AnnoyClass();
		ex.aa.hello();
		ex.ia.process();

	}

}
