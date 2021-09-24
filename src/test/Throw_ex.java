package test;

public class Throw_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		Throw_ex obj= new Throw_ex();
		
		try {
		obj.ageCheck(age);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("exception");
		}
		System.out.println("after exception");
		

	}
	public void ageCheck(int age) {
		if(age<18) {
			throw new ArithmeticException("age nor allowed");
	
		}else {
			System.out.println("eligible");
		}
	}

}
