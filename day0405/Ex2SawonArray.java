package day0405;

import java.util.Scanner;

import day0404.Ex2Class;

public class Ex2SawonArray {
	Scanner sc;
	int inwon;
	Sawon[] sawon;
	
	public Ex2SawonArray() {
		sc=new Scanner(System.in);
	}
	
	// Ű����� �ο����� �Է¹޾� sawon�� �迭�Ҵ� �� �Է¹ޱ�
	public void dataInwon() {
		System.out.println("�ο����� �Է��ϼ���");
		inwon=Integer.parseInt(sc.nextLine());
		// ��� �迭 �Ҵ�
		sawon=new Sawon[inwon];
		// �迭 ������ŭ �Է¹޾Ƽ� ������ ȣ���ϱ�
		for(int i=0;i<sawon.length;i++) {
			System.out.println("�����:");
			String name=sc.nextLine();
			System.out.println("�ҼӺμ���:");
			String buseo=sc.nextLine();
			System.out.println("�⺻��:");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("�ʰ��ٹ��ð���:");
			int time=Integer.parseInt(sc.nextLine());
			
			// Sawon ����
			sawon[i]=new Sawon(name,buseo,pay,time);
			System.out.println();
		}
	}
	// ����
	public static void showTitle() {
		System.out.println("----------------------------------------");
		System.out.println("��ȣ\t�����\t�μ���\t�⺻��\t�ʰ��ð�\t�ð�����\t�Ǽ��ɾ�");			
		System.out.println("----------------------------------------");
	}
	
	// ���
	public void dataWrite() {
		for(int i=0;i<sawon.length;i++) {
			System.out.println((i+1)+"\t"+sawon[i].getName()+"\t"+
		sawon[i].getBuseo()+"\t"+sawon[i].getPay()+"\t"+sawon[i].getOvertime()
		+"\t"+sawon[i].getTimeSudang()+"\t"+sawon[i].getNetPay());
		}
		// ���� 23���� ��� �迭 �Ҵ翡�� for(Sawon s: sawon) �̷������� �ϴϱ� �ȵ�
		// �迭 �ε������� �Ҵ��� ������ؼ� for(i=0; ~~~) �̰ɷ� ���ְ�
		// 33���� Sawon �������� sawon[i]�� ������ �ε����� �־���ߴ�
	}
	public static void main(String[] args) {
		
		// �޼��� ȣ��κи� ���� �ڵ��غ���
		// �Է� �� ������� �׸��� ����Ÿ ���(����)
		
		Ex2SawonArray ex=new Ex2SawonArray();
		ex.dataInwon();
		showTitle();
		ex.dataWrite();
	}

}
