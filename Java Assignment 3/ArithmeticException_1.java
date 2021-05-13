package assignment3;

public class ArithmeticException_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10/0;
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception");
			a.printStackTrace();
		}

	}

}
