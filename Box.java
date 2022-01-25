import java .util.*;
class Box
{ 
int width;
int depth;
int height;

void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter height,depth & width=");
height = sc.nextInt();
depth  = sc.nextInt();
width  = sc.nextInt();
}
int area()
{
 int vol = height*depth*width;
return vol;
}
}