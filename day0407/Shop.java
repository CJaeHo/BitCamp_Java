package day0407;

import java.io.Serializable;

// ����ȭ��(Serialization)?
//
// ����ȭ�� ��ü�� ����Ÿ ��Ʈ������ ����°��� ���Ѵ�
//
// ��ü�� ����� ����Ÿ�� ��Ʈ���� ����(write) ���� ��������(serial) ����Ÿ�� ��ȯ�ϴ°��� ���Ѵ�
//
// �ݴ�� ��Ʈ�����κ��� ����Ÿ�� �о ��ü�� ����°��� ������ȭ(deserialization)��� �Ѵ�


public class Shop implements Serializable{	// Shop�� implements������� Serializable��
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
