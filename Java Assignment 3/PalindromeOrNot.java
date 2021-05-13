package assignment3;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s="trurt";
		int c=0;
		int j=s.length()-1;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(j)) {
				j--;
			}
			else {
				c=1;
				break;
			}
		}
		if(c==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
			
		}
		

	}

}
