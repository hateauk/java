package swing;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.soap.SOAPBinding.Style;
import javax.print.DocFlavor.STRING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class JTextPaneEx extends JFrame{

	
	
	
	public JTextPaneEx() throws HeadlessException {
		super();
		
		JTextPane textPane=createTextPane();
		
		JScrollPane sp=new JScrollPane(textPane);
		
		sp.setPreferredSize(new Dimension(250,250));
		
		add(sp);
		
		pack();
		
		setLocation(300,200);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// TODO Auto-generated constructor stub
	}

	
	private JTextPane createTextPane(){
		
		String newline="\n";
		
		String[] initString={"이것은 일반체 입니다. "+newline, 
				"이것은 이탤릭체 입니다."+newline,
				"이것은 볼드체 입니다. "+newline,
				""+newline,""+newline};
		
		
		String [] initStyles={"regular", "italic", " bold", "button", "icon"};
		
		
	
	JTextPane textPane=new JTextPane();
	
	StyledDocument sdoc=textPane.getStyledDocument();
	
	addStylesToDocument(sdoc);
	
	try{
		
		for(int i=0;i<initString.length; i++){
			
			sdoc.insertString(sdoc.getLength(), initString[i], sdoc.getStyle(initStyles[i]));
		}
	
	
}catch(Exception ble){
	ble.printStackTrace();
}
	return textPane;
	
	}//end  createTextPane()
	
	protected void addStylesToDocument(StyledDocument sdoc) {
		//initialize some styles
		
		System.out.println();
		javax.swing.text.Style style=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		
		
		javax.swing.text.Style regular=sdoc.addStyle("regular", style);
		StyleConstants.setFontFamily(style, "SansSerif");
		
		javax.swing.text.Style s=sdoc.addStyle("italic", regular);
		StyleConstants.setItalic(s, true);
		
		s=sdoc.addStyle("bold",regular);
		StyleConstants.setBold(s, true);
		
		
		s=sdoc.addStyle("icon",regular);
		
		StyleConstants.setAlignment(s,StyleConstants.ALIGN_CENTER);
		
		ImageIcon pigIcon=new ImageIcon("d://cat.gif");
		
		if(pigIcon!=null){
			StyleConstants.setIcon(s, pigIcon);
		}

		s=sdoc.addStyle("button",regular);
		
		StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
		
		ImageIcon soundIcon=new ImageIcon("d://cat.gif");
		
		JButton button=new JButton();
		
		if(soundIcon!=null){
			button.setIcon(soundIcon);
		}else{
			button.setText("BEEP");
		}
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				
			}
		});
		
		StyleConstants.setComponent(s, button);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTextPaneEx();
	}

}
