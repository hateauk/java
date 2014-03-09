package threadTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class MultiThreadProgressEx extends JPanel implements ActionListener{

	private JProgressBar progressBar1,progressBar2;
	private JButton startButton;
	
	public MultiThreadProgressEx(){
		
		startButton=new JButton("start");
		startButton.addActionListener(this);
		progressBar1=new JProgressBar(0,1000);
		progressBar2=new JProgressBar(0,1000);
		
		progressBar1.setValue(0);
		progressBar1.setStringPainted(true);
		
		progressBar2.setValue(0);
		progressBar2.setStringPainted(true);
		
		JPanel panel=new JPanel();
		panel.add(startButton);
		panel.add(progressBar1);
		panel.add(progressBar2);
		
		add(panel);
		
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		startButton.setEnabled(false);
		
		ProgressBarThread p1=new ProgressBarThread(progressBar1, startButton);
		ProgressBarThread p2=new ProgressBarThread(progressBar2, startButton);
		
	
		p1.start();
		p2.start();
		
	}

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame("MultiThreadProgressEx");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MultiThreadProgressEx pbd=new MultiThreadProgressEx();
		frame.add(pbd);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}


class ProgressBarThread extends Thread{
	
	private JProgressBar jpb;
	private JButton jb;
	
	public ProgressBarThread(JProgressBar jpb, JButton jb){
		
		
		this.jpb=jpb;
		this.jb=jb;
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int current=0;
		while(current<=1000){
		current+=Math.random()*100;
		jpb.setValue(current);
		
		try{
			sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	
	}
		jb.setEnabled(true);		
	}
	
}



