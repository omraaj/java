import java.util.*;
class Codechef
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
   // System.out.println("Enter the value= ");
    int t = sc.nextInt();
    for(int i = 0;i<t;i++)
    {
      // System.out.println("Enter the value 1= ");
      int a = sc.nextInt();
     //  System.out.println("Enter the value 2= ");
      int b = sc.nextInt();
      // System.out.println("Enter the value 3= ");
      int c = sc.nextInt();
      int sum= a+b+c;
      if(sum ==180)
      {
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
  }
}