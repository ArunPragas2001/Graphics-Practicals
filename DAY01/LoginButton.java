import java.awt.*;
import javax.swing.*;
public class LoginButton {

  LoginButton()
 {
	 
	 
	 
  JFrame frm=new JFrame("Image Example");
		
  frm.setSize(400,300);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setTitle("My Second Frame");	 
	
  
    
  JButton btn=new JButton(new ImageIcon("btn.png"));//creating button
  btn.setBounds(130,100,100,40);//int x, int y, int width, int height
  frm.add(btn);
  frm.setlayout(null);
  frm.setVisible(true);  
	 

	
 }
    
	
	public static void main(){
		
	new LoginButton();	
		
		
	}	
 } 



