package assignment3;

public class NumberFormatException_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123.345";
		try {
			int a = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
			e.printStackTrace();
		}
	}

}
