package awtTest;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;

public class CheckBoxEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f=new Frame("üũ�ڽ��׽�Ʈ");
		Panel p=new Panel();
		
		
		Checkbox ck1=new Checkbox("��ȭ",true);
		Checkbox ck2=new Checkbox("������");
		Checkbox ck3=new Checkbox("����",true);

		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
		
	}

}