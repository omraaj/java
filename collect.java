class test
{public static void main(String args[])
{ String s1="ProGrAm";
String s2="JaVa";
String s3="";String s4="";
for(int i=0;i<s1.length();i++)
{
char ch = s1.charAt(i);
if(ch>='A' && ch<='Z')
s3=s3+ch;
else
s4=s4+ch;
}
for(int j=0;j<s2.length();j++)
{
char ch = s2.charAt(j);
if(ch>='A' && ch<='Z')
s3=s3+ch;
else
s4=s4+ch;
}
System.out.println("Ans="+(s3+s4);
}
}
