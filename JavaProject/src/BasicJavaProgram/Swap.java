package BasicJavaProgram;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		
		int x, y, t;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Value of x and y before swapping are: "+x+" and "+y);
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("After swapping the value of x and y are: "+x+" and "+y);
		
		
		
	}

}
