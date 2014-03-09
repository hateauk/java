package awtEventTest;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx extends Frame implements KeyListener{

	TextArea ta=new TextArea();
	
	
	public KeyEventEx() throws HeadlessException {
		super("keyevent test");
		
		add(ta);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
		ta.addKeyListener(this);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_DOWN){
			ta.append("down key \n");
		}
		if(e.getKeyCode()==e.VK_UP){
			ta.append("up key \n");
		}
		if(e.getKeyCode()==e.VK_LEFT){
			ta.append("left key \n");
		}
		if(e.getKeyCode()==e.VK_RIGHT){
			ta.append("right key \n");
		}
		if(e.getKeyCode()==e.VK_A){
			ta.append("a key \n");
		}
		if(e.getKeyCode()==e.VK_D){
			ta.append("d key \n");
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new KeyEventEx();

	}

}
