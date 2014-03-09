package networkTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ServerSocketScanEx extends JFrame implements ActionListener ,Runnable {
	
	private JButton jbtn_scan;
	private JTextField jtf_ip;
	private JList jlist_result;
	private JLabel jlabel_ip;
	private DefaultListModel listModel;
	private int index;
	private String ip;
	
	public ServerSocketScanEx(String message){
	super(message);
	jbtn_scan=new JButton("서버스캔");
	listModel =new DefaultListModel();
	jlist_result =new JList(listModel);
	jlist_result.setVisibleRowCount(10);
	
	
	JPanel jpanel_south = new JPanel();
	jpanel_south.add(jbtn_scan);
	
	jbtn_scan.addActionListener(this);
	JScrollPane jsp=new JScrollPane(jlist_result);
	add(jsp, BorderLayout.CENTER);
	add(jpanel_south,BorderLayout.SOUTH);
	
	
	pack();
	setVisible(true);
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
	
	}
	
	public void actionPerformed(ActionEvent ae){
		Object obj =ae.getSource();
		if(obj ==jbtn_scan){
			listModel.insertElementAt(ip, index);
			jlist_result.setSelectedIndex(index);
			index++;
			Thread t= new Thread(this);
			t.start();
		}
	}
	
	
	public void run(){
		ServerSocket s=null;
		
		for(int i=1;i<65536;i++){
			try{
				s=new ServerSocket(i);
				
			}catch(IOException e){
				listModel.insertElementAt(i+"번 포트가 사용중 입니다.", index);
				jlist_result.setSelectedIndex(index);
			}
		}
		listModel.insertElementAt("서버스캔이 끝났습니다. " , index);
		jlist_result.setSelectedIndex(index);
		
	}

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		new ServerSocketScanEx("serverport scanner");
	
		

	}

}
