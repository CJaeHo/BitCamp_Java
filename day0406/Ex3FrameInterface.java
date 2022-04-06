package day0406;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


// 어떻게 활용되는지 테스트 예제
public class Ex3FrameInterface extends Frame 	// 이 많은 메서드들을 Ex3FrameInterface가 다 물려받은거
	implements WindowListener,ActionListener{	// 금수저새끼

	Button btn;
	public Ex3FrameInterface() {
		super("Hello");		// Frame의 생성자 super()
		this.setBounds(300, 100, 300, 300);
		this.addWindowListener(this);		// 윈도우 이벤트
		this.setLayout(new FlowLayout());	// 레이아웃 변경
		this.setBackground(Color.pink);		// 배경에 색넣고
		btn=new Button("Click");			// 버튼 클릭 액션
		this.add(btn);						// 버튼 클릭 시 누르는 메서드에 있는 값 추가
		btn.addActionListener(this);		// 버튼 이벤트 발생
		this.setVisible(true);				// 프레임 보이게하고
	}
	public static void main(String[] args) {
		new Ex3FrameInterface();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 누름!!!");
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("시스템 종료");
		System.exit(0);	// 윈도우 x 클릭 시 호출(시스템 종료)
		
		
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
