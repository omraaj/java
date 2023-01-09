package password;

public class varify {
	public void find(String s1)
	{
		if (s1.length()<8)
			System.out.println("Weak password");
		else
		{ 
			int u=0,l=0,N=0,S=0;
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(ch>='a'&& ch<='z')
				l++;
				else
					if(ch>='A'&& ch<='Z');
			         u++;
			         if(ch>='1'&& ch<='9')
			         N++;
			         else
			        	 S++;
				
			}
			if ( s1.length()>=8 && u>=2 && l>=2 && N>=2 && S>=1)
				System.out.println("strong password");
			else
				System.out.println("Average password");
		}
	}

}
