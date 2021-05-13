package assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the base:");
		int base = scan.nextInt();
		System.out.println("Please enter the height:");
		int height = scan.nextInt();
		scan.close();
		
		System.out.println("Area of Triangle:"+(0.5*base*height));

	}

}
