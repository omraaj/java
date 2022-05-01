interface abc
{
void get();
}
interface xyz
{
void show();
}
class pqr
{
void fun()
{
System.out.println("In fun");
}
}
class demo extends pqr implements abc,xyz
{
public void get()
{
System.out.println("In get");
}
public void show()
{
System.out.println("In Show");
}
}
class testinterface1
{
public static void main (String args[])
{
demo d1 = new demo();
d1.show();
d1.get();
d1.fun();
}
}