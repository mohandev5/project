package arraysproblems;

import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a[]=new int[10];
		System.out.println("enter the elements in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
         System.out.println("sum of array is:"+sum);
         sc.close();
	}

}
