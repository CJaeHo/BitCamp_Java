package day0406;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


// ��� Ȱ��Ǵ��� �׽�Ʈ ����
public class Ex3FrameInterface extends Frame 	// �� ���� �޼������ Ex3FrameInterface�� �� ����������
	implements WindowListener,ActionListener{	// �ݼ�������

	Button btn;
	public Ex3FrameInterface() {
		super("Hello");		// Frame�� ������ super()
		this.setBounds(300, 100, 300, 300);
		this.addWindowListener(this);		// ������ �̺�Ʈ
		this.setLayout(new FlowLayout());	// ���̾ƿ� ����
		this.setBackground(Color.pink);		// ��濡 ���ְ�
		btn=new Button("Click");			// ��ư Ŭ�� �׼�
		this.add(btn);						// ��ư Ŭ�� �� ������ �޼��忡 �ִ� �� �߰�
		btn.addActionListener(this);		// ��ư �̺�Ʈ �߻�
		this.setVisible(true);				// ������ ���̰��ϰ�
	}
	public static void main(String[] args) {
		new Ex3FrameInterface();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư ����!!!");
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ý��� ����");
		System.exit(0);	// ������ x Ŭ�� �� ȣ��(�ý��� ����)
		
		
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

}
