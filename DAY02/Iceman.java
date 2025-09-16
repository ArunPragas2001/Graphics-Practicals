import java.awt.*;
import javax.swing.*;

public class Iceman extends JFrame{
Iceman(){

 setSize(500,500);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 
}


public void paint(Graphics g){

//head
g.setColor(Color.blue);
g.fillOval(150,152,100,100);


//body
g.setColor(Color.green);
g.fillOval(100,250,200,200);

//




}


public static void main(String[]args){
	
	
	
	new Iceman();
}






}