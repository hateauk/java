package swingcomponent;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEx  extends JFrame{


	
	public JComboBoxEx(){
	super("jcombobox Å×½ºÆ®");
	setLayout(new FlowLayout());
	
	String [] citems={"one","two","three","four","five"};
	JComboBox combo=new JComboBox(citems);
	add(combo);
	
	DefaultComboBoxModel cmodel=new DefaultComboBoxModel();
	cmodel.addElement("chicken");
	cmodel.addElement("potato");
	
	combo=new JComboBox<>();
	combo.setModel(cmodel);
	
	DefaultComboBoxModel cxmodel=(DefaultComboBoxModel)combo.getModel();
	cxmodel.addElement("coke");
	cxmodel.addElement("coffee");
	cxmodel.addElement("juice");
	
	add(combo);
	
	
	setBounds(300,200,300,100);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JComboBoxEx();
		
	}

}
