package awtTest;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ListEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f =new Frame("����Ʈ �׽�Ʈ");
		Panel p = new Panel();
		
		List list1=new List(3,true);
		
		
		list1.add("����");
		list1.add("����");
		list1.add("�뱸");
		list1.add("�λ�");
		list1.add("����");
		list1.add("���");
		list1.add("��õ");
		list1.add("���");
		
		
		p.add(list1);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
		
		
		
		

	}

}
