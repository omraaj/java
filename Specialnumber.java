import java.util.*;
class Specialnumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number=");
int n = sc.nextInt();
String s1 = n + "";
int len = s1.length();
String p1 ="";
String p2 ="";
for(int i=0;i<len/2;i++)
p2 = p2 + s1.charAt(i);
System.out.println("p1 = "+p1);
System.out.println("p2 = "+p2);
int a = Integer.parseInt(p1);
int b = Integer.parseInt(p2);
int a1 = a+b;
System.out.println("a1 " + a1);
int ans = a1*a1;
System.out.println("power " + ans);
if(n==ans)
System.out.println("Special");
else
System.out.println("Not special");
}
}
