package assignment2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the array size:");//4
		int n=scan.nextInt();
		int value[]=new int[n];
		System.out.println("Please enter the "+ n + " array elements:");//1,2,3,4
		for(i=0;i<n;i++) {
			value[i]=scan.nextInt();
		}
		for(i=0;i<=value.length;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of of numbers:" +sum);
	}

}
