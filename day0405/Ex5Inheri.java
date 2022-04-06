package day0405;

class Fruit{
	private int danga;
	
	public Fruit() {
		danga=1000;
	}
	Fruit(int danga){
		this.danga=danga;
	}
	public int getDanga() {
		return danga;
	}
}
/////////////////////////////////
class Orange extends Fruit{
	private String name;
	
	public Orange() {
		name="오렌지";
	}
	Orange(String name){
		this.name=name;
	}
	Orange(String name, int danga){
		super(danga);	// private로 접근제한이 걸려있으니 super로 가져와야함
		this.name=name;
	}
	public void write() {
		System.out.println("과일명:"+name+", 단가:"+this.getDanga());
		// 이렇게 단가를 가져올 때 this.으로 쓰면 본인꺼에서 찾아보고 없을 때 부모꺼에서 찾음.
		// 부모꺼 쓸꺼면 그냥 super(danga)이렇게 써도 됨.
	}
}

public class Ex5Inheri {


	public static void main(String[] args) {
		Orange[] or=new Orange[3];
		or[0]=new Orange();
		or[1]=new Orange("키위");
		or[2]=new Orange("딸기", 3000);

		for(Orange o:or)
			o.write();
	}

}
