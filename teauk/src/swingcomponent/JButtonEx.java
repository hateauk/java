package swingcomponent;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class JButtonEx extends JFrame{

	
	public JButtonEx(){
		super("스윙 버튼 테스트");
		
		
		setLayout(new GridLayout(0,1));
		
		JPanel buttonPannel=new JPanel();
		
		JButton b1=new JButton("button");
		JButton b2=new JButton("action");
		
		b2.setMnemonic('a');
		
		ImageIcon icon1=new ImageIcon("d://images//korea.png");
		ImageIcon icon2=new ImageIcon("d://images//Japan.png");
		
		JButton b3=new JButton(icon1);
		b3.setPressedIcon(icon2);
		b3.setMnemonic('b');
		
		buttonPannel.add(b1);
		buttonPannel.add(b2);
		buttonPannel.add(b3);
		
		
		JPanel togglePanel=new JPanel();
		
		togglePanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED),"Toggle Group"));
		
		
		JToggleButton tbutton1=new JToggleButton("one");
		JToggleButton tbutton2=new JToggleButton("two");
		JToggleButton tbutton3=new JToggleButton("three");
		
		ButtonGroup group=new ButtonGroup();
		group.add(tbutton1);
		group.add(tbutton2);
		group.add(tbutton3);
		
		tbutton1.setSelected(true);
		
		togglePanel.add(tbutton1);
		togglePanel.add(tbutton2);
		togglePanel.add(tbutton3);
		
		JPanel selectPanel=new JPanel();
		
		JCheckBox check=new JCheckBox("checkbox");
		JRadioButton rb=new JRadioButton("radio");
		
		selectPanel.add(check);
		selectPanel.add(rb);
		
		ButtonGroup radiogGroup=new ButtonGroup();
		JRadioButton rb1=new JRadioButton("one");
		JRadioButton rb2=new JRadioButton("two");
		JRadioButton rb3=new JRadioButton("three");
		
		radiogGroup.add(rb1);
		radiogGroup.add(rb2);
		radiogGroup.add(rb3);
		
		JPanel radioPanel=new JPanel();
		radioPanel.setBorder(new TitledBorder(new LineBorder(Color.black,3),"radio group"));
		
		radioPanel.add(rb1);
		radioPanel.add(rb2);
		radioPanel.add(rb3);
		
		rb1.setSelected(true);
		
		add(buttonPannel);
		add(togglePanel);
		add(selectPanel);
		add(radioPanel);
		
		pack();
		
		setLocation(300,200);
		setVisible(true);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		

	new JButtonEx();
	}

}
