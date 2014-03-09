package swing;

import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameEx extends JFrame{

	
	
	
	public JFrameEx() throws HeadlessException {
		super("JFrame Å×½ºÆ® ");
	
		
		JButton bt1=new JButton("hello swing north");
		JButton bt2=new JButton("hello swing center");
		
		Container cp=getContentPane();
		
		cp.add("North",bt1);
		add(bt2);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JFrameEx();
	}

}
