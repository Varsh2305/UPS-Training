package scannerpractice;

import java.util.Scanner;

public class area {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b=sc.nextInt();
		
		System.out.println("Area of rectange:"+(l*b));
	}
}
