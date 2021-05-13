package assignment1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number:");//enter the input value as 20
		int n = scan.nextInt();
		
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers:"+sum);

	}

}
