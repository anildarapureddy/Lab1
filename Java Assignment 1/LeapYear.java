package assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the year:");
		int year = scan.nextInt();
		scan.close();

		if (year % 4 == 0) {
			System.out.println(year + "is leap year");
		}
		else {
			System.out.println(year + "is not a leap year");
		}

	}

}
