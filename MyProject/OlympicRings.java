import java.awt.*;
import javax.swing.*;

public class OlympicRings extends JFrame
{

    public OlympicRings()
    {
    setTitle("OlympicRings using Bres");
    setSize(800,600);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    }

    private void putpixel(Graphics g,int x,int y)
    {
        g.fillRect(x,y,2,2);
    }
   
    public void DrawCircleBres(Graphics g,int xc, int yc,int r, Color color)
    {
        int x=0;
        int y=r;
        int d=3-(2 * r);

        g.setColor(color);

        while(y >= x)
        {
            putpixel(g,xc+x,yc+y);
            putpixel(g,xc+x,yc-y);
            putpixel(g,xc-x,yc+y);
            putpixel(g,xc-x,yc-y);

            putpixel(g,xc+y,yc+x);
            putpixel(g,xc+y,yc-x);
            putpixel(g,xc-y,yc+x);
            putpixel(g,xc-y,yc-x);
            x++;

            if(d>0)
            {
                y--;
                d=d+(4*(x-y))+10;
            }
            else
            {
                d=d+(4*x)+6;
            }
        }
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        int r = 80;

        DrawCircleBres(g,200,200,r,Color.blue);
        DrawCircleBres(g,350,200,r,Color.black);
        DrawCircleBres(g,500,200,r,Color.red);

        DrawCircleBres(g,280,310,r,Color.yellow);
        DrawCircleBres(g,420,30,r,Color.green);

    }

    public static void main(String[]args)
    {
        new OlympicRings();
    }
    
}