import java.util.*;
class authenticationfailure extends Exception
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter password =");
String pass =sc.next();
System.out.println("Enter Confirm password=");
String cpass = sc.next();
try
{
if (pass.equals(cpass))
System.out.println("Authorized user");
else
throw new negage();
System.out.println("Valid ");
}
catch(negage e)
{
System.out.println("Invalid ");
}
}
}