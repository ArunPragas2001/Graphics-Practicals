
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DDALine extends JFrame implements MouseListener{

    int x1,y1,x2,y2;

     public DDALine()
    {

        setSize(800,800);
        setTitle("DDA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        addMouseListener(this);


    }

    public void setPixel(Graphics g, int x, int y)
    {
            g.fillRect(x,y,2,2);
    }

    public void drawLine(Graphics g,int x1,int y1, int x2, int y2)
    {
        int steps;

        int x=x1;
        int y=y1;

        int dx=x2-x1;
        int dy=y2-y1;


        if(dx>dy)
        {
            steps=dx;
        }
        else
        {
            steps=dy;
        }



        double xinc=dx/steps;

        double yinc=dy/steps;


        for(int j=0; j<=steps; j++){

            x+=xinc;
            y+=yinc;

            setPixel(g,x,y);
        }


       


    }
    public void paint(Graphics g)
    {
        super.paint(g);
        drawLine(g,x1,y1,x2,y2);
    }
     
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
            x1= e.getX();
            y1= e.getY();

    }
    public void mouseReleased(MouseEvent e){

         x2= e.getX();
         y2= e.getY();
         repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}






    public static void main(String[]args)

    {
        new DDALine();
    }

    

    
}
