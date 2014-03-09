package swing;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JEditorPaneEx extends JFrame{

	
	
	
	
	public JEditorPaneEx() throws HeadlessException, IOException {
		super("JEditorpane test");
		JEditorPane editorPane=new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setPage("http://hateauk.cafe24.com");
		
		JScrollPane sp=new JScrollPane(editorPane);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(800, 600));
	
		add(sp);
		
		pack();
		setLocation(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) throws IOException{
		 new JEditorPaneEx();
	}

}
