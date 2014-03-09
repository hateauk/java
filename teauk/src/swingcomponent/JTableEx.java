package swingcomponent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import swingcomponent.*;


public class JTableEx extends JFrame{

	
	JTable table ;
	JTableModel model;
	
	public JTableEx(){
		
		model=new JTableModel();
		table=new JTable(model);
		add(new JScrollPane(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200,200,300,300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTableEx();
	}

}



