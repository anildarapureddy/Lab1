package assignment2;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the starting number:");//79
		int startingNumber=scan.nextInt();
		System.out.println("Please enter the starting number:");//187
		int endingNumber=scan.nextInt();
		for(int i=startingNumber;i<endingNumber;i++) {
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}

}
