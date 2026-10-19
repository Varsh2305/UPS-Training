package array;

import java.util.*;
public class Largest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.print(largest);
	}

}