package awtEventTest;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

public class ItemEventEx extends Frame implements ItemListener,ActionListener{


	Panel p1=new Panel();
	Panel p2=new Panel();
	TextArea ta=new TextArea(5,20);
	Button exit=new Button("종료");
	
	Checkbox cb1=new Checkbox("축구", false);
	Checkbox cb2=new Checkbox("야구", false);
	Checkbox cb3=new Checkbox("농구", false);
	Checkbox cb4=new Checkbox("배구", false);
	
	
	
	
	
	
	
	public ItemEventEx() throws HeadlessException {
		super("itemEvent test");
	
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		p2.add(exit);
		
		add("North",p1);
		add("South",p2);
		add("Center",ta);
		
		
		setBounds(300,300,300,300);
		setVisible(true);
		
		exit.addActionListener(this);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		
		
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ItemEventEx();
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Thread th=new Thread();
		try{
			th.sleep(2000);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED)
		ta.append(e.getItem()+"을 선택 \n\n");
		
		else if (e.getStateChange()==ItemEvent.DESELECTED)
			ta.append(e.getItem()+"을 취소\n\n");
		
	}
	


}
