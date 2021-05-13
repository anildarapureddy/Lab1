package assignment3;

public class StringToCharAndCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		char[] ch = s.toCharArray();
		System.out.println("****String To Char Array****");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		String s1 = String.valueOf(ch);
		System.out.println("****Char Array To String****");
		System.out.println(s1);
	}

}
