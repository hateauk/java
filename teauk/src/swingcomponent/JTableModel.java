package swingcomponent;

import javax.swing.table.AbstractTableModel;

public class JTableModel extends AbstractTableModel{

	
	Object[][] data={{"NARI","����ġ",new Integer(1234),"����ģ��"},
			
			{"one","������", new Integer(2222),"�츮��ģ"},
			{"hmhm","������",new Integer(8774),"��û��"},
			{"hth","���»�",new Integer(8787),"�ζ��"}
	
	
	};
	
	String name[]={"���̵�","�̸�","��й�ȣ","����"}; 
	
	
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return name.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int r, int c) {
		// TODO Auto-generated method stub
		return data[r][c];
	}

	@Override
	public boolean isCellEditable(int r, int c) {
		// TODO Auto-generated method stub
		return (c!=0)?true:false;
	}

	public String getColumnName(int c){
		return name[c];
	}

	@Override
	public void setValueAt(Object obj, int r, int c) {
		// TODO Auto-generated method stub
		data[r][c]=obj;
	}


}
