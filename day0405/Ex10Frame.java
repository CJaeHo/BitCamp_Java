package day0405;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex10Frame extends Frame implements WindowListener{
	
	public Ex10Frame() {
		super("안녕하세요");
		this.setBounds(300, 100, 300, 300);	// 위치와 크기 지정
		this.setBackground(Color.pink);	// 배경색 지정
		this.addWindowListener(this);	// 이벤트 발생
		this.setVisible(true);
	}	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 종료");
		System.exit(0);	// 프로그램 종료 코드
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
		new Ex10Frame();	// 디폴트 생성자 호출

	}

}
