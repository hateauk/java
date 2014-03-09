package swing;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class JSpiltPaneEx extends JFrame {

	
	JSplitPane splitPane,splitPane1;
	
	
	
	
	public JSpiltPaneEx() throws HeadlessException {
		super("SplitPane Å×½ºÆ®");
		
		JTextArea jta1=new JTextArea(20, 10);
		JScrollPane jta1ScrollPane=new JScrollPane(jta1);
		
		JTextArea jta2=new JTextArea(20,10);
		
		JScrollPane jta2ScrollPane=new JScrollPane(jta2);
		splitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT, jta1ScrollPane, jta2ScrollPane);
		
		JTextArea jta3=new JTextArea(20, 10);
		JScrollPane jta3ScrollPane=new JScrollPane(jta3);
		splitPane1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,splitPane,jta3ScrollPane);
		// TODO Auto-generated constructor stub
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(100);
		splitPane.setPreferredSize(new Dimension(200,200));
		splitPane1.setPreferredSize(new Dimension(800, 800));
		
		
		//add(splitPane);
		add(splitPane1);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JSpiltPaneEx();
	}

}
