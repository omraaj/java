import java.awt.Frame;
import java.awt.Label;


public class Vertical_Label extends Frame
{
	Label l1,l2,l3;
	
	Vertical_Label()
	{
		
		l1 = new Label("one");
		l1.setBounds(50, 50, 150, 20);
		
		l2=new Label("Two");
		l2.setBounds(50, 100, 150, 20);
		
		l3=new Label("Three");
		l3.setBounds(50,150,150,20);
		
		add(l1);
		add(l2);
		add(l3);
		setSize(300,300);
		
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		Vertical_Label v=new Vertical_Label();
	}
}
