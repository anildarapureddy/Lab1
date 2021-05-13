package assignment1;

public class AscendingOrderOfArrayElements {

	public static void main(String[] args) {
		
		int arr[]= {2,8,4,15,6,22,92,1,9,56};
		int temp=0;
		int len=arr.length;
		
		System.out.println("Elements before sorting in ascending order");
		for(int i=0;i<=len-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//sorting elements in the ascending order
		for(int i=0;i<=len-1;i++) { 
			for(int j=i+1;j<=len-1;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements before sorting in ascending order");
		for(int i=0;i<=len-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
