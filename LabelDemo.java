import java.applet.Applet;
import java.awt.Label;


public class LabelDemo extends Applet 
{
	public void init()
	{
		Label one=new Label();
		one.setText("One");
		System.out.println(one.getAlignment());
		
		Label two=new Label("Two");
		two.setAlignment(1);
		
		Label three = new Label("Three",2);
		
		add(one);
		add(two);
		add(three);
	}
}
