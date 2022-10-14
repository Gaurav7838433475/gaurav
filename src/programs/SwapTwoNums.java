package programs;

public class SwapTwoNums {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a is now: "+a);
		System.out.println("value of b is now: "+b);
	}

}
