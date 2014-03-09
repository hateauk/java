package awtTest;

import java.awt.Frame;
import java.awt.HeadlessException;

public class FrameEx2 extends Frame{


	
	
	public FrameEx2(String title) throws HeadlessException {
		super(title);
		setSize(300, 300);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		FrameEx2 f2=new FrameEx2("프레임 테스트 ");

	}

}
