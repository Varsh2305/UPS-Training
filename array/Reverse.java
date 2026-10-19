package array;

import java.util.*;
public class Reverse {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
	}

}
