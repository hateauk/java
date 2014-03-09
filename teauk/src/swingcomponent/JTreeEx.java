package swingcomponent;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class JTreeEx extends JFrame{

	Object[] gen ={"프로그램", "system", " design"};
	
	Vector<Vector> node1=new Vector<Vector>(){
		
		public String toString(){
			return "Lesson";
		}
		
	};
	
	Vector<String> node2=new Vector<String>(){
		
		public String toString(){
			return "Java";
		}
		
	};
	
	Vector<String> node3=new Vector<String>(){
		
		public String toString(){
			return "XML";
		}
		
	};
	
	public JTreeEx(){
		
		node1.addElement(node2);
		node1.addElement(node3);
		
		
		node2.addElement("beg");
		node2.addElement("adv");
		node2.addElement("jsp");

		node3.addElement("xslt");
		node3.addElement("dom");
		
		gen[0]=node1;
		
		JTree tree=new JTree(gen);
		tree.setRootVisible(true);
		
		JScrollPane js=new JScrollPane(tree);
		add(js);
		setBounds(300,150,400,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new JTreeEx();
	}

}
