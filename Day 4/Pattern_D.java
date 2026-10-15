package scannerpractice;

import java.util.Scanner;
public class Pattern_D {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if (j==0||(i==0&&j!=l-1)||(i==l-1&&j!=l-1)||(j==l-1 && i!=0 && i!=l-1)) {
					    System.out.print("* ");
					} else {
					    System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
}