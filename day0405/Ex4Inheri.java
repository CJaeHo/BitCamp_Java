package day0405;

class Color{
	private String colorName;
	
	Color(){
//		System.out.println("super ����Ʈ ������");
	}
	
	Color(String colorName){
		this.colorName=colorName;
//		System.out.println("super 2��° ������");
	}
	
	// ����ϴ� �޼��带 �����;�
	public void write() {
		System.out.println("�ڵ�����"+colorName);
	}
}
////////////////////////////
class Red extends Color{
	private String myCar;	// �Ķ����?
	Red(){
//		super();		// �̰� �����Ǿ�����. �����Ǿ��ִٰ� ȣ���� �ȵǴ°� �ƴ�
						// �θ��� ����Ʈ �����ڰ� ȣ��Ǵ°���. ����Ʈ�� �̷�
		super("���");	// �ٵ� �̷��� ���ڰ� �ִ� �����ڴ� ������ �ȵ�.
						// �׸��� �ݵ�� ù�ٿ� �ԷµǾ����
//		System.out.println("sub ����Ʈ ������");
	}
	Red(String myCar,String colorName){
		super(colorName);	// super 2��° �����ڰ� ȣ��ǰ�
		this.myCar=myCar;
	}
	
	@Override		// �������̵�� �θ�� �Ȱ��� ����°�
	public void write() {
		// TODO Auto-generated method stub
		super.write();		// �̰Ŵ� super()ó�� �Ǿտ� �;ߵǰ� �׷��� ����
							// ���� ������ �Ǿ��ϸ� �տ� �ڿ� ����Ǿ���ϸ� �ڿ� ������ ��
		System.out.println("�����̸�:"+myCar);
	}
}

public class Ex4Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red r1=new Red();
		r1.write();
		System.out.println("------");
		Red r2=new Red("�ҳ�Ÿ","�����޻�");
		r2.write();
	}

}
