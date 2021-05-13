package assignment1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("enter the total value");
        int n=sc.nextInt();
        sc.close();
     
        int a=0, b=0, i=1, j=1;
        while(b<n)
        {
            j=1; a=0;
            while(j<=i)
            {
                  if(i%j==0)
                         a++;
                  j++;
            }
            if(a==2)
            {
                  System.out.println("even number:"+i);
                  b++;
            }
            i++;
        }
        	
       
		
	}

}
