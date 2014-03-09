package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneEx extends JFrame implements ActionListener{

	
	JButton b1,b2,b3,b4;
	String [] str={"�α���","ȸ������"};
	
	public JOptionPaneEx(){
		super("JOption pane �׽�Ʈ");
		setLayout(new FlowLayout());
		
		b1=new JButton("messageDialog");
		b2=new JButton("confirmDialog");
		b3=new JButton("inputDialog");
		b4=new JButton("optionDialog");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		pack();
		
		setLocation(300,300);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "�޼������̾�α׹ڽ�","�޼���",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "Ȯ�δ��̾�α׹ڽ�","Ȯ��",JOptionPane.YES_NO_CANCEL_OPTION);
		}
		
		if(e.getSource()==b3){
			JOptionPane.showInputDialog(this, "�Է´��̾�α׹ڽ�","�Է�",JOptionPane.YES_NO_OPTION);
		}
		
		if(e.getSource()==b4){
			JOptionPane.showOptionDialog(this, "�ɼǴ��̾�α׹ڽ�","�ɼ�",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,str,str[1]);
		}
		
		
		
	}

	public static void main(String[] args) {
		 new JOptionPaneEx();

	}

}
