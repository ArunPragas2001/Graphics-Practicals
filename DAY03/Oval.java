import javax.swing.*;
import java.awt.*;


public class Oval extends JFrame{
	
	Oval(){
		
		setSize(500,800);
		setTitle("Oval");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	public void paint(Graphics g){
		
		/*g.setColor(Color.blue);
		g.fillArc(100,100,50,50,180,180);//x,y,length,width,starting angle,ending angle
		
		
		
		g.setColor(Color.blue);
		g.fillArc(100,300,100,100,0,90);*/
		
		
		g.setColor(Color.pink);
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.setColor(Color.black);
		g.fillOval(200,200,100,100);// x,y,length,width
		
		g.setColor(Color.white);
		g.fillOval(210,210,80,80);// x,y,length,width
		
		
	}
	
	
	
	public static void main(String[]args){
		
		
		new Oval();
		
	}
	
	
	
	
	
}