package swing;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooseEx  extends JPanel implements ActionListener{

	JButton openButton, saveButton;
	
	JTextArea jta;
	JFileChooser fc;
	
	
	public JFileChooseEx(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame("fileChooser TEST");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		jta=new JTextArea(5,20);
		jta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane jtaScrollPane=new JScrollPane(jta);
		
		fc=new JFileChooser();
		openButton=new JButton("open");
		saveButton=new JButton("save");
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.add(openButton);
		buttonPanel.add(saveButton);
		
		add(buttonPanel,BorderLayout.NORTH);
		add(jtaScrollPane,BorderLayout.CENTER);
		
		frame.add(this);
		frame.pack();
		
		frame.setLocation(300,300);
		frame.setVisible(true);
		
		openButton.addActionListener(this);
		saveButton.addActionListener(this);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==openButton){
			int returnVal=fc.showOpenDialog(this);
			
			if (returnVal==JFileChooser.APPROVE_OPTION){
				File file=fc.getSelectedFile();
				jta.setText(file.getName()+"\n");
			}
		}else if(e.getSource()==saveButton){
			int returnVal=fc.showSaveDialog(this);
			
			if(returnVal==JFileChooser.APPROVE_OPTION){
				File file=fc.getSelectedFile();
				jta.setText(file.getName()+"\n");
			}
			
		}
		
	}

	public static void main(String[] args) {
		new JFileChooseEx();

	}

}
