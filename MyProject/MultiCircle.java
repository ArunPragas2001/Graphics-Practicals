import javax.swing.*;
import java.awt.*;

public class MultiCircle extends JFrame {
      
    public MultiCircle()
    {
        setTitle("Multicircle");
        setVisible(true);
        setLayout(null);
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public void putPixel(Graphics g,int x, int y)
    {
        g.fillRect(x,y,9,9);
    }

    

    public void drawCircle(Graphics g,int xc, int yc,int r,Color color )
    {
        
            int x =0;
            int y =r;
            int d=3-(2*r);

            g.setColor(color);

            while(x<=y)
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
                d=d+4*(x-y)+10;
                y--;
            }
                
               





            }
           
            






    }

    public void paint(Graphics g)
    {
        super.paint(g);

        
        drawCircle( g,200, 200,20 ,Color.blue );
        drawCircle( g,200, 200,30 ,Color.red );
        drawCircle( g,200, 200,40 ,Color.yellow );
        drawCircle( g,200, 200,50 ,Color.green );
        drawCircle( g,200, 200,60 ,Color.red );
    }



    public static void main(String[]args)
    {

        new MultiCircle();


    }






}
