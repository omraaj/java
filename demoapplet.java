/*<html>
<applet code = "demo.class",
height ="300" width = "300">
<lapplet>
</html>
*/
import java.applet.*;
import java.awt.*;
public class demoapplet extends Applet
{  
  public void init()
{ 
  System.out.println("init");
}
public void start()
{
System.out.println("In start");
}
public void paint(Graphics g)
{ 
   System.out.println("In paint");
}
public void stop()
{
System.out.println("In stop");
}
public void destroy()
{
System.out.println("In destroy");
}
}