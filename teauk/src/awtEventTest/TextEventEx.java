package awtEventTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventEx extends Frame implements TextListener, ActionListener{

	
	TextField tf=new TextField(30);
	Button input=new Button("입력");
	TextArea ta=new TextArea(100, 100);
	Button exit=new Button("종료");
	
	
	
	
	
	
	
	public TextEventEx() throws HeadlessException {
		super("text event test");
		
		input.setEnabled(false);
		
		Panel p =new Panel();
		p.add(new Label("제목:"));
		p.add(tf);
		p.add(input);
		
		add(BorderLayout.NORTH, p );
		add(BorderLayout.CENTER, ta);
		add(BorderLayout.SOUTH ,exit );
		
		setBounds(300,300,400,300);
		setVisible(true);
		
		tf.addTextListener(this);
		input.addActionListener(this);
		exit.addActionListener(this);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String str=e.getActionCommand();
		if(str.equals("입력")){
			ta.append(tf.getText()+"\n");
			tf.setText("");
			tf.requestFocus();
		}
		if(str.equals("종료")){
			System.exit(0);
		}
		
	}

	@Override
	public void textValueChanged(TextEvent e) {
		if(tf.getText().trim().equals("")){
			input.setEnabled(false);
		}
		else{
			input.setEnabled(true);
		}
	}

	public static void main(String[] args) {
		new TextEventEx();

	}

}
