package awtTest;

import java.awt.Dialog;
import java.awt.Frame;

public class DialogEx extends Frame{


	public DialogEx(){
		super("dialog test");
		
		Dialog d=new Dialog(this,"사용자 다이얼로그");
		
		setSize(200,200);
		setVisible(true);
		
		d.setSize(200,100);
		d.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DialogEx();
	}

}
