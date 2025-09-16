import java.awt.*;
import javax.swing.*;


public class Cube1 extends JFrame{
	
	Cube1(){
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void paint(Graphics g){
		
		g.setColor(Color.blue);
		g.drawLine(50,50,50,150);
		g.drawLine(50,50,150,50);
		g.drawLine(150,50,150,150);
		g.drawLine(50,150,150,150);
		
		
		g.setColor(Color.blue);
		g.drawLine(100,100,100,200);
		g.drawLine(100,100,200,100);
		g.drawLine(200,100,200,200);
		g.drawLine(100,200,200,200);
		
		g.setColor(Color.blue);
		g.drawLine(50,50,100,100);
		/*g.setColor(Color.blue);
		g.drawLine();
		g.setColor(Color.blue);
		g.drawLine();
		g.setColor(Color.blue);
		g.drawLine();*/
		
		
	}
	
	
	
	public static void main(String[]args){
		
		
		new Cube1();
		
	}
	
	
	
	
}