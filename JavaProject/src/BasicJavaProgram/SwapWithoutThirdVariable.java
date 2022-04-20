package BasicJavaProgram;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		
		int a=5;
		int b=10;
		System.out.println("Value of a and b before swapping are:"+a+" "+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of b and a after swapping are:"+a+" "+b);
		
	}
}
