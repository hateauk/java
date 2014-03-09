package swing;

import java.awt.Button;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class JTappedPaneEx extends JFrame{

	
	ImageIcon icon1,icon2, tabicon;
	
	JButton b1,b2;
	JTabbedPane jp;
	
	
	
	
	
	public JTappedPaneEx() throws HeadlessException {
		super("JTabbedPane �׽�Ʈ");
		
		icon1=new ImageIcon("d://images//Rainbow1.gif");
		icon2=new ImageIcon("d://images//Rainbow2.gif");
		
		tabicon=new ImageIcon("d://images//Rainbow3.gif");
		
		b1=new JButton("���� 1", icon1);
		b2=new JButton("���� 2", icon2);
		
		jp=new JTabbedPane();
		
		jp.addTab("��1", new ImageIcon(),b1);
		jp.addTab("��2", new JPanel().add(new JTextArea(7,20)));
		jp.addTab("��3", tabicon,b2,"�ǻ����� �߰��߽��ϴ�");
		
		
		add(jp);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
		
		
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTappedPaneEx();
	}

}
