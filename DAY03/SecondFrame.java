import javax.swing.*;
public class SecondFrame{
	public static void main(String[]args){
	
	
		JFrame frm=new JFrame();
		
		frm.setSize(400,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocation(new java.awt.Point(100,80));
		frm.setTitle("My Second Frame");
		
		
		
		
		JButton btn=new JButton("Click");//creating button
		btn.setBounds(130,100,100,40);//int x, int y, int width, int height
		
		
		frm.add(btn);
		frm.setLayout(null);
		frm.setVisible(true);//make frame visible
	}
	

}