package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JInternalFrameEx  extends JFrame implements ActionListener{

	
	JDesktopPane desktop;
	
	JMenuItem openItem;
	JMenuItem closeItem;
	JMenuItem exitItem;
	
	int cnt=1;
	

	public JInternalFrameEx() throws HeadlessException {
		super("JInternalFrame 테스트");
		
		desktop=new JDesktopPane();
		openItem=new JMenuItem("new");
		closeItem=new JMenuItem("close");
		exitItem=new JMenuItem("exit");
		buildGUI();
		
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
		
		
		// TODO Auto-generated constructor stub
	}
	
	void buildGUI(){
		
		add(desktop,BorderLayout.CENTER);
		
		JMenuBar menubar=new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu fileMenu=new JMenu("file");
		menubar.add(fileMenu);
		
		fileMenu.add(openItem);
		fileMenu.add(closeItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		openItem.addActionListener(this);
		closeItem.addActionListener(this);
		exitItem.addActionListener(this);

		
	}
	

	public void openFrame(){
		JInternalFrame frame=new JInternalFrame("새문서"+cnt, true, true, true, true);
		
		JLabel imageLabel=new JLabel("새문서");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().add(imageLabel);
		
		if(cnt==1){
			frame.setSize(200,200);
		}
		else{
			frame.setBounds((cnt-1)*20,(cnt-1)*20, 200,200);
		}
		cnt++;
		
		desktop.add(frame);
		frame.setVisible(true);
	}
	
	public void closeFrame(){
		
		JInternalFrame frame=desktop.getSelectedFrame();
		if(frame==null){return;}
		frame.setVisible(false);
		frame.dispose();
	}
	
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==openItem){
			openFrame();
		}
		
		else if(obj==closeItem){
			closeFrame();
		}
		else if (obj==exitItem){
			setVisible(false);
			dispose();
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		new JInternalFrameEx();
	}

}
