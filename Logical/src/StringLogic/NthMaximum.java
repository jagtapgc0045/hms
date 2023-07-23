package StringLogic;

import java.util.Arrays;
import java.util.Scanner;

public class NthMaximum {
	public static void main(String[] args) {
//		int[] a= {5,3,8,2,7,9,4};
//		Arrays.sort(a);
//		System.out.println(a[2]);
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter "+i+"th number : ");
			arr[i]=sc.nextInt();
		}
		
		
//		int[] b= {4,6,2,8,5,2,8,9};
//		for(int i=0; i<=a.length-1;i++)
//		{
//			for(int j=i+1;j<=a.length-1;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int c=a[j];
//					a[j]=a[i];
//					a[i]=c;
//				}
//			}
//		}
//		System.out.println(a[2]);
	}

}
