package awtEventTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx extends Frame implements ActionListener,MouseListener{

	Panel p =new Panel();
	Button test=new Button("test");
	Button exit=new Button("Á¾·á");
	TextArea ta=new TextArea();
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		ta.append("mouseClicked...\n");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		ta.append("mouseEntered...\n");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		ta.append("mouseExited...\n");
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		ta.append("mousePressed...\n");
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		ta.append("mouseReleased...\n");
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	System.exit(0);
		
	}

	public MouseEventEx() throws HeadlessException {
		super("mouseEvent test");
		
		p.add(test);
		p.add(exit);
		
		ta.setEditable(false);
		
		add("South",p);
		add("Center",ta);
		
		setBounds(300,300,300,300);
		
		setVisible(true);
		
		test.addMouseListener(this);
		exit.addActionListener(this);
		ta.addMouseListener(this);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		new MouseEventEx();
		
		

	}

}
