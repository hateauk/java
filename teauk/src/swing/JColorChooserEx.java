package swing;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JColorChooserEx extends JFrame implements ActionListener {

	JMenuBar mb;
	JMenu mnuselect;
	JMenuItem mnucolor;
	JLabel l;
	JTextArea ta;
	
	
	
	
	public JColorChooserEx() throws HeadlessException {
		super("JColorChooser TEST");
		
		mb=new JMenuBar();
		mnuselect=new JMenu("����");
		mnucolor =new JMenuItem("����");
		l=new JLabel("���â");
		ta=new JTextArea();
		mnuselect.add(mnucolor);
		
		mb.add(mnuselect);
		
		setJMenuBar(mb);
		
		add("North",l);
		add("Center",ta);
		
		
		setBounds(300,300,300,200);
		setVisible(true);
		
		mnucolor.addActionListener(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {


		if(e.getSource()==mnucolor){
			JColorChooser chooser=new JColorChooser();
			Color col=chooser.showDialog(this, "������ ������", Color.blue);
			l.setText("������ ������"+col);
			ta.setBackground(col);
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new JColorChooserEx();
	}

}
