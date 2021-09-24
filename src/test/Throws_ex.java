package test;

public class Throws_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws_ex tx= new  Throws_ex();
		tx.calculator();
	}
		public void calculator() {
			try {
				add();
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		public void add() throws InterruptedException{
			System.out.println("inside method1");
			Thread.sleep(30000);
		}
	}


