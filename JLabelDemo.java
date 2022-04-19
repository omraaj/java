import java.applet.Applet;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JLabelDemo  extends Applet
{
	public void init()
	{
		JLabel one=new JLabel();
		one.setText("One");
		
		Image imgs =Toolkit.getDefaultToolkit().getImage(" ");
		ImageIcon is=new ImageIcon(imgs);
		JLabel two=new JLabel(is);
		imgs=Toolkit.getDefaultToolkit().getImage("");
		
		imgs=Toolkit.getDefaultToolkit().getImage("");
		is=new ImageIcon(imgs);
		JLabel three = new JLabel("Three",is,10);
		
		add(one);
		add(two);
		add(three);
		
		}

}
