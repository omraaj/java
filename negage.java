import java.util.*;
class negage extends Exception
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age =");
int age = sc.nextInt();
try
{
if (age<=0)
throw new negage();
else
System.out.println("Valid age");
}
catch(negage e)
{
System.out.println("Invalid age");
}
}
}