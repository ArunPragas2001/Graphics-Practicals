import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Circle extends JFrame implements MouseListener{
	
	Graphics g;
	Circle()
	{
		
		setSize(600,600);
		setLayout(null);
		setTitle("Circle");
		setLocationRelativeTo(null);
		addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		g=getGraphics();
		
		
		
	}
		
		
		public void mouseClicked(MouseEvent e)
		{
			
		g.setColor(Color.blue);
		g.fillOval(e.getX(),e.getY(),30,30);
			
			
		}
		
		public void mouseEntered(MouseEvent e)
		{
			
			
			
		}
		
		public void mousePressed(MouseEvent e)
		{
			
			
			
		}
		
		public void mouseReleased(MouseEvent e)
		{
			
			
		}
		public void mouseExited(MouseEvent e)
		{
			
			
		}
		public void paint(Graphics g)
		{
			
			
		}
		
		
	    public static void main(String[]args)
		{
		
		
		new Circle();
		
	   }
	
		
		
		
		
	}
	
	
	
	
	
	
	
