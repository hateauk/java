package awtTest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

 class Mycanvas extends Canvas{
	 public void paint(Graphics g){
		 g.setColor(Color.red);
		 g.drawRect(20, 20, 100,100);
	 }
 }



public class CanvasEx {


	public static void main(String[] args) {
		Frame f=new Frame("캔버스 테스트 ");
		
		Mycanvas canvas=new Mycanvas();
		canvas.setBackground(Color.yellow);
		
		f.add(canvas);
		
		f.setLocation(500,300);
		f.setSize(200,200);
		f.setVisible(true);
		
		
	}

}
