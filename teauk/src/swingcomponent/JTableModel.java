package swingcomponent;

import javax.swing.table.AbstractTableModel;

public class JTableModel extends AbstractTableModel{

	
	Object[][] data={{"NARI","마루치",new Integer(1234),"옆집친구"},
			
			{"one","옹윤아", new Integer(2222),"우리여친"},
			{"hmhm","윤현흠",new Integer(8774),"멍청이"},
			{"hth","하태뽕",new Integer(8787),"부라더"}
	
	
	};
	
	String name[]={"아이디","이름","비밀번호","구분"}; 
	
	
	
	
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
