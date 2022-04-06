package day0405;

public class Shop {				// 데이타 넣는 클래스로 사용할꺼임
	private String sangpum;
	private int su;
	private int dan;
	
	public Shop() {
		this("새우깡",1,1300);		// this, super는 무조건 첫줄에 있어야함
	}
	public Shop(String sangpum) {
//		super();				// 있어도 없어도 지금은 상관없음
		this.sangpum = sangpum;
		su=1;
		dan=500;
	}
	public Shop(String sangpum, int su, int dan) {
//		super();			// 부모의 디폴트 생성...
		this.sangpum = sangpum;
		this.su = su;
		this.dan = dan;
	}
	
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	// 3개의 멤버값을 한꺼번에 변경하고자 할 경우
	public void setData(String sangpum,int su,int dan){
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);
	}
	public int getResult() {
		return su*dan;
	}


}
