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
		mnuselect=new JMenu("선택");
		mnucolor =new JMenuItem("색상");
		l=new JLabel("출력창");
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
			Color col=chooser.showDialog(this, "색상을 고르세요", Color.blue);
			l.setText("선택한 색상은"+col);
			ta.setBackground(col);
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new JColorChooserEx();
	}

}
