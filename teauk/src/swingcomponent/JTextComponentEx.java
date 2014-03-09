package swingcomponent;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextComponentEx  extends JFrame{

	
	
	public JTextComponentEx() throws HeadlessException {
		super("JTextComponent test");
		JPanel panel1=new JPanel();
		JTextField field=new JTextField(5);
		
		class NumberDocument extends PlainDocument{
			
			public void insertString(int offset, String value, AttributeSet a)throws BadLocationException{
				char[] valueArr=value.toCharArray();
				for(int i=0;i<valueArr.length;i++){
					if(!Character.isDigit(valueArr[i])){
						getToolkit().beep();
						return;
					}
				}
				super.insertString(offset, value, a);
			}
			
		
		}
	
		JTextField numberField=new JTextField(2);
		numberField.setDocument(new NumberDocument());
		
		JPasswordField passField=new JPasswordField(5);
		
		panel1.add(new JLabel("name:"));
		panel1.add(field);
		
		panel1.add(new JLabel("age:"));
		panel1.add(numberField);
		
		panel1.add(new JLabel("password:"));
		panel1.add(passField);
		
		
		JPanel panel2=new JPanel(new BorderLayout());
		JTextArea textArea=new JTextArea(5, 10);
		textArea.setLineWrap(true);//자동 내려쓰기를 위한 설정
		JScrollPane tscroll=new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel2.add("North",new Label("자기소개"));
		panel2.add("Center",tscroll);
		add("North",panel1);
		add("Center",panel2);
		
		pack();
		setLocation(300,200);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTextComponentEx();
	}

}
