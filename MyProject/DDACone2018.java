
import java.awt.*;
import javax.swing.*;

public class DDACone2018 extends JFrame{

int x1, y1, x2, y2;

public DDACone2018()
{
setSize(800,800);
setVisible(true);
setLayout(null);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}
public void setPixel(Graphics g, int x, int y)
{
    g.fillRect(x,y,2,2);


}
public void drawLine(Graphics g, int x1, int y1,int x2, int y2)
{
 double x=x1;
 double y=y1;


 int dx=x2-x1;
 int dy=y2-y1;




 int steps=Math.max(Math.abs(dx),Math.abs(dy));

 double xinc=dx/(double)steps;

 double yinc=dy/(double)steps;


 for(int j=0;j<=steps; j++)
 {
        setPixel(g,(int)Math.round(x),(int)Math.round(y));

        x+=xinc;
        y+=yinc;

       

 }



}
public void paint(Graphics g)
{
  super.paint(g);

    //cone 
    
    drawLine(g, 400,400,380,600);
    drawLine(g, 400,400,420,600);
    drawLine(g, 380,600,420,600);


    drawLine(g, 400,400,500,450);
  
         drawLine(g, 467,436,467,457);
              drawLine(g, 467,436,488,434);


              drawLine(g, 500,450,500,466);
              drawLine(g, 500,450,521,443);








}
public static void main(String[]args)
{

    new DDACone2018();


}




}