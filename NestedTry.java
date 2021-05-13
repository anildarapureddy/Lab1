package assignment3;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int b=10/0;
			try {
				int c = Integer.parseInt(null);
			}
			catch(NumberFormatException e){
				System.out.println("NumberFormatException");
			}
			try {
				String s =null;
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException");
			}
			
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		
		
	}

}
