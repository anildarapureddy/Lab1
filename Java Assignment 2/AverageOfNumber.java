package assignment2;

import java.util.Scanner;

public class AverageOfNumber {

	public static void main(String[] args) {
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the array size:");
		int n=scan.nextInt();
		int value[]=new int[n];
		System.out.println("Please enter the "+ n + " array elements:");
		for(i=0;i<n;i++) {
			value[i]=scan.nextInt();
		}
		int len=value.length;
		int sum=0, average;
		
		for(i=0;i<=len;i++) {
			sum=sum+i;
		}
		average=sum/len;	
		System.out.println("Average of elements: "+average);

	}

}
