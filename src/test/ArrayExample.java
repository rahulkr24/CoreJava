package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ]Array= {1,2,4,5,8,9};
		System.out.println("Array:"+Array[2]);
//change value
		Array[0]=10;
		
		System.out.println("Array:"+Array[0]);
		System.out.println("length od array"+Array.length);
		System.out.println("last value :"+Array[Array.length-1]);
		

		int i;
		for(i=0;i<Array.length;i++) {
			System.out.print(i);
		}
		//reverse order====================
		System.out.println();
		int j;
		for(j=Array.length-1;j>=0;j--) {
			System.out.print(j);
		}
		//=========for each loop======
		for(int values:Array) {
			System.out.println(values);
		}
		
	}

}
