package assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// print fibonacci series (10 values).The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int a=0,b=1,c;
		
		System.out.println("Enter n value: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        sc.close();
        
        System.out.println("Fibonacci Series is:");
        
        for(int i=1;i<=n;i++) {
        	System.out.print(a + " ");
        	c=a+b;
        	a=b;
        	b=c;
        }

	}

}
