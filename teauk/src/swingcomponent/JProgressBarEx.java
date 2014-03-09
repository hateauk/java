package swingcomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class JProgressBarEx extends JFrame implements ActionListener{

	private JProgressBar progressBar1;
	private JButton startButton;
	private int currentValue;
	public JProgressBarEx(){
		
		
		super("jprogressbar test");
		
		
		startButton=new JButton("start");
		progressBar1=new JProgressBar(0, 1000);
		
		progressBar1.setValue(0);
		progressBar1.setStringPainted(true);
		
		JPanel panel=new JPanel();
		panel.add(startButton);
		panel.add(progressBar1);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setBounds(300,300,300,300);
		
		startButton.addActionListener(this);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		currentValue+=100;
		progressBar1.setValue(currentValue);
		if(currentValue==1000){currentValue=0;}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JProgressBarEx();
		
	}

}
