import java.util.*;
class facta
{ 
 public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter No=");
int n=sc.nextInt();
int ans=factorial(n);
System.out.println("Result="+ ans);
}
public static int factorial(int n)
{ if (n==1)
 return 1;
else 
 return n * factorial(n-1);
}
}