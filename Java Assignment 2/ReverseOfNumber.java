package assignment2;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int n=1234, rev=0,r;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		System.out.println(rev);

	}
}
