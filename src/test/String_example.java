package test;

import java.util.Scanner;

public class String_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First name");
		String Fname=scan.nextLine();
		System.out.println("Enter Last name");
		String Lname=scan.nextLine();
		
		String Fullname=Fname+" "+Lname;
		System.out.println("Full name:"+Fullname);
		System.out.println("Full name length is:"+Fullname.length());
		System.out.println("Full name:"+Fullname.toUpperCase());
		String newName=Fullname.replace(" ", ",");
		System.out.println("Full name:"+newName);
	}

}
