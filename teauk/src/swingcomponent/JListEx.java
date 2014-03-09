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
		model.addElement("사과");
		model.addElement("딸기");
		model.addElement("바나나");
		model.addElement("수박");
		list2.setSelectedIndex(1);
		
		
		Vector vListData=new Vector();
		JList list3=new JList(vListData);
		
		
		JScrollPane scroll=new JScrollPane(list3);
		
		vListData.add("축구");
		vListData.add("야구");
		vListData.add("농구");
		vListData.add("배구");
		vListData.add("발레");
		vListData.add("쇼트");
		vListData.add("체조");
		vListData.add("위닝");
		vListData.add("일레븐");
		vListData.add("롤");
		vListData.add("수구");
		vListData.add("다이빙");
		vListData.add("프리");
		vListData.add("스케이팅");
		vListData.add("릴레함베르");
		
		
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
		model.addElement(new Student("100", "홍길동", "전산과"));
		model.addElement(new Student("200", "김삿갓", "국문과"));
		model.addElement(new Student("300", "성춘향", "국악과"));
			
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
