package awtEventTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvent extends Frame implements ActionListener, MouseMotionListener{

	
	Label move=new Label("마우스 따라 다니기",Label.CENTER);
	Button exit=new Button("종료");
	
	
	
	
	
	
	
	public MouseMotionEvent() throws HeadlessException {
		super("mousemotionevent 테스트");
		
	setLayout(null);
	
	move.setBounds(100,50,150,20);
	exit.setBounds(250,500,50,30);
	
	move.setBackground(Color.red);
	
	add(move);
	add(exit);
	
	setBounds(300,100,500,600);
	setVisible(true);
	
	exit.addActionListener(this);
	addMouseMotionListener(this);
		
		
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p=e.getPoint();
		move.setLocation(p);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	public static void main(String[] args) {
		new MouseMotionEvent();

	}

}
