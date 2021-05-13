package assignment3;

public class PresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A brown fox ran away fast";
		String word = "brown";
		int c=0;
		String[] s_words = s.split("\\s");
		for(String s_word:s_words) {
			if(s_word.equalsIgnoreCase(word)) {
				c=0;
				break;
			}
			else {
				c=1;
			}
		}
		if(c==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
