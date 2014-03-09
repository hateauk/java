package swingcomponent;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JListEx extends JFrame{


	public JListEx(){
		super("JList test");
		
		
		setLayout(new FlowLayout());
		
		String[] listData={"one","two","three","four","five"};
		JList<String> list1=new JList<String>(listData);
		list1.setSelectedIndex(1);
		
		JList<String> list2=new JList<String>(new DefaultListModel());
		
		DefaultListModel model=(DefaultListModel)list2.getModel();
		model.addElement("���");
		model.addElement("����");
		model.addElement("�ٳ���");
		model.addElement("����");
		list2.setSelectedIndex(1);
		
		
		Vector vListData=new Vector();
		JList list3=new JList(vListData);
		
		
		JScrollPane scroll=new JScrollPane(list3);
		
		vListData.add("�౸");
		vListData.add("�߱�");
		vListData.add("��");
		vListData.add("�豸");
		vListData.add("�߷�");
		vListData.add("��Ʈ");
		vListData.add("ü��");
		vListData.add("����");
		vListData.add("�Ϸ���");
		vListData.add("��");
		vListData.add("����");
		vListData.add("���̺�");
		vListData.add("����");
		vListData.add("��������");
		vListData.add("�����Ժ���");
		
		
		class Student{
			
			String id;
			String name;
			String department;
			
			public Student(String id,String name, String department){
				this.id=id;
				this.name=name;
				this.department=department;
			}
			public String toString(){
				return name;
			}


		}
		JList list4=new JList(new DefaultListModel());
		
		
		list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		model=(DefaultListModel)list4.getModel();
		model.addElement(new Student("100", "ȫ�浿", "�����"));
		model.addElement(new Student("200", "���", "������"));
		model.addElement(new Student("300", "������", "���ǰ�"));
			
			list4.setSelectedIndex(1);
			
	add(list1);
	add(list2);
	add(scroll);
	add(list4);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new JListEx();

	}

}
