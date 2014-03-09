package awtEventTest;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx extends Frame implements WindowListener {

	
	
	
	public WindowEventEx() throws HeadlessException {
		super("windowevent 테스트");
		
		Label exit=new Label("프레임의 종료 버튼을 눌러주세요");
		
		add(exit);
		
		
		setBounds(300, 200, 200, 200);
		setVisible(true);
		
		addWindowListener(this);
		
		
		
	}

	

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosed(WindowEvent e) {
		
		new MouseEventEx();
	}



	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}



	public static void main(String[] args) {
		new WindowEventEx();

	}

}
