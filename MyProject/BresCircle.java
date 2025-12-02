import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class BresCircle extends  JFrame implements MouseListener{
    boolean drawBig=false;

    public BresCircle() {

        setTitle("BresCircle");
        setSize(1200,1000);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);



    }


    public void putPixel(Graphics g, int x, int y)
    {
        g.fillRect(x, y, 2, 2);

    }


     public void  drawCircle(Graphics g, int xc, int yc,int r,  Color color)
    {
        int x=0;
        int y=r;
        int d=3-2*r;

         g.setColor(color);

        while( x <= y)
        {
        putPixel(g,xc+x,yc+y);
        putPixel(g,xc-x,yc-y);
        putPixel(g,xc+x,yc-y);
        putPixel(g,xc-x,yc+y);

        putPixel(g,xc+y,yc+x);
        putPixel(g,xc-y,yc-x);
        putPixel(g,xc+y,yc-x);
        putPixel(g,xc-y,yc+x);

        x++;

            if(d<0)
            {
                d=d+(4*x)+6;
                
            }
            else
            {
                d=d+4*(x-y)-10;
                y--;
            }



        }

       



    }

     public void paint(Graphics g)
        {
            super.paint(g);

          

           
            drawCircle(g,500,400,100,Color.black);
            drawCircle(g,550,400,50,Color.black);
            drawCircle(g,575,400,25,Color.black);
            //drawCircle(g,775,400,40,Color.black);

            drawCircle(g,625,400,25,Color.black);
            drawCircle(g,650,400,50,Color.black);
            drawCircle(g,700,400,100,Color.black);
           

            if(drawBig)
            {
                 
            drawCircle(g,400,400,200,Color.black);
            drawCircle(g,800,400,200,Color.black);

             

            }







        }

        public void mouseClicked(MouseEvent e){
           
        }
        public void mousePressed(MouseEvent e){
            
            drawBig=true;
            repaint();

        }
        public void mouseReleased(MouseEvent e){

        }
        public void mouseEntered(MouseEvent e){

        }
        public void mouseExited(MouseEvent e){

        }




    public static void main(String[] args) {
        
        new BresCircle();

    }


    
}