class prime implements Runnable
{
int id;
public void run()
{
if(id==1)
{
for(int i=1;i<100;i++)
{
int div=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
div++;
}
if(div==2)
System.out.println("prime="+i);
}
}
else
if(id==2)
{
for(int i=101;i<200;i++)
{
int div=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
div++;
}
if(div==2)
System.out.println("\tprime="+i);
}
}
}
}

class test11
{
public static void main(String args[])
{
prime p1 = new prime();
prime p2 = new prime();
p1.id=1;
p2.id=2;
Thread t1 = new Thread(p1);
Thread t2 = new Thread(p2);
t1.start();
t2.start();
}
}