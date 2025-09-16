import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MathLine extends JFrame implements MouseListener
{

 graphics g;
 int x1,x2,y1,y2;   
 public MathLine()
 {  

    setFrame(800,800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

        
     }


     public void DDA(int x1,int x2,int y1,int y2 )
     {
        int dx;
        int dy;
        double steps;
        double xinc,yinc;
        double x,y;


        dx=x2-x1;
        dy=y2-y1;

     if (Math.abs(dx)>Math.abs(dy))
     {

        steps=Math.abs(dx);

     }
     else{

        steps=Math.abs(dy);
     }

     xinc=Math.abs(dx/xinc);
     yinc=Math.abs(dy/yinc);


     x=x1;
     y=y1;

     g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y)){

        for(int i=1; i<steps; i++)
        {
            x=x + xinc;
            y=y + yinc;
            G.drawLine(int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y));




        }





     }


     public void mouseClicked(MouseEvent e)
     {

        x1=e.getX();
        y1=e.getY();

        x2=e.getX();
        y2=e.getY();

        Draw();


     }

     public void mouseEntered();
     public void mouseExited();
     public void mouseReleased();
     public void mousepressed();
  









    
}

}
