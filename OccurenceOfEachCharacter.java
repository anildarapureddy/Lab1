package assignment3;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		String s="DevLabs Alliance Training";	
		int[] count=new int[s.length()];
		int i,j;
		
		char[] str=s.toCharArray();
		
		for(i=0;i<s.length();i++) {
			count[i]=1;
			for(j=i+1;j<s.length();j++) {
				if(str[i]==str[j]) {
					count[i]++;
					str[j]='*';
				}
			} 
		}
		System.out.println("occurence of each character:");
		for(i=0;i<count.length;i++) {
			if(str[i]!=' '&&str[i]!='*')
			System.out.println(str[i]+":"+count[i]);
		}
	}

}
