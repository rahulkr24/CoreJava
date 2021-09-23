package test;

import java.util.Scanner;

public class Calculate_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int length,breadth;
        
        System.out.println("Enter Lenght");
        length = scan.nextInt();
        
        System.out.println("Enter Bregth");
        
        breadth = scan.nextInt();
        
        int arearect = length * breadth;
        System.out.println("Area of rect is "+arearect);
		
		/*int l=10,b=15;
		double r=5;
		double pi=3.14;
		
		int square=l*l;
		int rect=l*b;
		double cir=pi*r*r;;
		
		System.out.println("Area of square:"+square);
		System.out.println("Area of rectangle:"+rect);
		System.out.println("area of circle:"+cir);
		*/

	}

}
