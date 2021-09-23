package test;

public class Conditional_ex {

	public static void main(String[] args) {
for(int i=0;i<=50;i++) {
	
	if(i%2==0) {
		System.out.println("odd:"+i);
	}else
		System.out.println("even :"+i);	
 }

//===========================voting condition==========

int age=18;
if(age>=18) {
	System.out.println("you r eligibe for vote");
}
else if(age==17) {
	System.out.println("you are  eligible for vote by next year");
} else{
		System.out.println("you are not eligible for vote");
	}
	}
}
