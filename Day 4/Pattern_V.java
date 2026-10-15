package scannerpractice;

import java.util.Scanner;
public class Pattern_V {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		for(int i=0;i<l;i++) {
			for(int j=0;j<2*l-1;j++) {
				if(j==i||j==(2*l-2-i)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}