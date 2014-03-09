package awtTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelEx {

	public PanelEx() {
		
		Frame f=new Frame("panel test");
		Panel p=new Panel();
		
		p.setBackground(Color.red);
		f.add(p);
		
		f.setSize(200,200);
		f.setVisible(true);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		new PanelEx();

	}

}
