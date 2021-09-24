package test;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b[]= {1,2,3};
		
		try {
			System.out.println(a/0);
			System.out.println(b[5]);
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Inside null pointer");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Insidearithmetic");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside generic exception");
		}finally {
			System.out.println("inside finally");
		}
		System.out.println("after exception");
	}

}
