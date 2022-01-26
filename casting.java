class casting
{
 public static void main (String args[])
{    
     int a = 100;
     int b =20;
    long c = 300;
    float d = 3.14f;
 a= b; //implicit.
 System.out.println(a);
c= a;  //implicit.
System.out.println(c);
b=(int)c; 
System.out.println(b);
}
}