package assignment1;

import java.util.Scanner;

public class FactorialNumberUsingWhileLoop {

	public static void main(String[] args) {
		
		//factorial of n = 1*2*3*4*5*6*.....*n
		
		int fact=1, i=1;
		System.out.println("Enter n value: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        sc.close();
		
		while(i<=n) {
			
			fact=fact*i;
			i++;
		}
		
		System.out.println("factorial number of n is:"+ fact);
	}

}
