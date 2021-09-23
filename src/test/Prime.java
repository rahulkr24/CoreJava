package test;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		for(int i=2;i<=num/2;i++) {
			if(num%i==2) {	
				System.out.println("prime number");
			}else
				System.out.println("not");
		}
		

	}

}
