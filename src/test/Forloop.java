package test;

public class Forloop {

	public static void main(String[] args) {
		int i;
		for(i=10;i>0;i--) {
			System.out.print(i);
		}
		System.out.println();
		//============================
		String s1="Clean India green india";
		
		String rev="";
		for(int j=0;j<s1.length();j++) {
			System.out.print(s1.charAt(j));
			
		}
		System.out.println();
		
		
		//===============reverse==========
		
		for(int k=s1.length()-1;k>=0;k--) {
			rev=rev+s1.charAt(k);
			
		}
		System.out.println(rev);
		
		//=======count the words======
		
		
		
		String[] Words=s1.trim().split(" ");   // remove unnecessry spces by using trim
		System.out.println("number of words:"+Words.length);
		
		
		
//========================while loop===============
		
		int x=1;
		while(x<=10) {
			System.out.println(x);
			x++;
		}
		
		long n1=254821;
		int sum=0;
		while(n1>0) {
			long r1=n1%10;
			System.out.print(r1);
			sum++;
			n1=n1/10;
			
			
			
		}
		System.out.println();
		System.out.println("count:"+sum);
		
		
		
		//==================do while loop=================
		int n2=10;
		do {
			System.out.println(n2);
			n2--;
			
		}while(n2>0);
	}
	
	
	

}
