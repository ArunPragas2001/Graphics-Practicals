import java.awt.*;
import javax.swing.*;

public class House extends JFrame{

House(){

 setTitle("House");
 setSize(800,500);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLocationRelativeTo(null);
 setVisible(true);
 
 
}

public void paint(Graphics g){

   g.setColor(Color.black);
   g.drawLine(10,220,250,100);//x1,y1,x2,y2
   g.drawLine(250,100,480,215);
   
   g.setColor(Color.blue);
   g.drawRect(50,200,400,200);//	
   g.fillRect(50,200,400,200);


   g.setColor(Color.yellow);
   g.drawRect(100,250,100,150);
   g.fillRect(100,250,100,150);


  g.setColor(Color.yellow);
  g.drawRect(100,250,100,150);
  g.fillRect(100,250,100,150);

  
  g.setColor(Color.green);
  g.drawRect(250,250,100,100);
  g.fillRect(250,250,100,100);




}


public static void main(String[]args)

{
	
	
	new House();
	
	
}






}