package assignment3;

public class Re_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[10]=50;
		}catch(ArrayIndexOutOfBoundsException e) {
			try {
			int a=10/0;
			}catch(ArithmeticException e1) {
				System.out.println("ArithmeticException");
			}
		}
	}

}
