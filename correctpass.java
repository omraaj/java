package password;

import java.util.Scanner;

 class correctpass { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password=");
		String s2=sc.next();
		varify v =new varify();
		v.find(s2);

	}

}
