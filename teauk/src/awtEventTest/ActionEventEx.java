package awtEventTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ActionEventEx extends Frame implements ActionListener{

	Panel p;
	Button input,exit;
	TextArea ta;
	
	
	public ActionEventEx(){
		
		super("actionEvent test");
		
		p=new Panel();
		
		
		input=new Button("�Է�");
		exit=new Button("����");
		
		ta=new TextArea();
		
		
		input.addActionListener(this);
		exit.addActionListener(this);
		
		p.add(input);
		p.add(exit);
		
		add(p,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		
		setBounds(300,300,300,200);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String name;
		name=ae.getActionCommand();
		
		if(name.equals("�Է�")){
			ta.append("��ư�� �ԷµǾ����ϴ�. \n");
			
		}
		else{
			ta.append("���α׷��� �����մϴ�. \n");
			
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			System.exit(0);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		 new ActionEventEx();

	}





}
