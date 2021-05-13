package assignment2;

public class DuplicatesOfArray {

	public static void main(String[] args) {
		
		int array[]= {12,32,12,45,65,93,0,23,45,6};
		int len=array.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(array[i]==array[j])
					System.out.println(array[i]+ " is a duplicate element");
			}
		}

	}

}
