package day0405;

public class Sawon {		// ����Ÿ �ִ� Ŭ������ ����Ҳ���
	private String name;
	private String buseo;
	private int pay;
	private int overtime;
	public Sawon(String name, String buseo, int pay, int overtime) {
//		super(); // ������ �־ ���
		this.name = name;
		this.buseo = buseo;
		this.pay = pay;
		this.overtime = overtime;
	}
	public String getName() {
		return name;
	}
	public String getBuseo() {
		return buseo;
	}
	public int getPay() {
		return pay;
	}
	public int getOvertime() {
		return overtime;
	}
	// �ʰ�������
	public int getTimeSudang() {
		// 5�ð� �̻��� ������ 10����
		// 5�ð� �̸��� �ð�*18000
		if(overtime>=5) {
			return 100000;
		}
		else {
			return overtime*18000;
		}
	}
	
	// �Ǽ��ɾ� ��ȯ
	public int getNetPay() {
		return pay+this.getTimeSudang();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
