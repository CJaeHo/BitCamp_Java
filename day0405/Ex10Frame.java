package day0405;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex10Frame extends Frame implements WindowListener{
	
	public Ex10Frame() {
		super("�ȳ��ϼ���");
		this.setBounds(300, 100, 300, 300);	// ��ġ�� ũ�� ����
		this.setBackground(Color.pink);	// ���� ����
		this.addWindowListener(this);	// �̺�Ʈ �߻�
		this.setVisible(true);
	}	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
		System.exit(0);	// ���α׷� ���� �ڵ�
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Ex10Frame();	// ����Ʈ ������ ȣ��

	}

}
