package swingcomponent;

import java.awt.GridLayout;
import java.awt.Insets;

import javax.print.attribute.standard.Severity;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class JToolBarEx extends JFrame{

	public JToolBarEx(){
		super("툴바 테스트");
		
		JToolBar tbar=new JToolBar("연습");
		tbar.setMargin(new Insets(5, 5, 5, 5));
		
		JPanel p=new JPanel(new GridLayout());
		JButton bt1=new JButton("java");
		JButton bt2=new JButton("window");
		JButton bt3=new JButton("motif");
		
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		tbar.add(p);
		
		add("North",tbar);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JToolBarEx();
	}

}
