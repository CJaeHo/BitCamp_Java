package day0407;

import java.io.Serializable;

// 직렬화란(Serialization)?
//
// 직렬화란 객체를 데이타 스트림으로 만드는것을 뜻한다
//
// 객체를 저장된 데이타를 스트림에 쓰기(write) 위해 연속적인(serial) 데이타로 변환하는것을 말한다
//
// 반대로 스트림으로부터 데이타를 읽어서 객체를 만드는것을 역직렬화(deserialization)라고 한다


public class Shop implements Serializable{	// Shop을 implements해줘야해 Serializable로
	private String sang;
	private String color;
	private int price;
	
	public Shop() {
		
	}

	public Shop(String sang, String color, int price) {
		super();
		this.sang = sang;
		this.color = color;
		this.price = price;
	}

	public String getSang() {
		return sang;
	}

	public void setSang(String sang) {
		this.sang = sang;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
