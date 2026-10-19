package array;

import java.util.*;
public class Count {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		int even_count=0,odd_count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even_count+=1;
			}
			else {
				odd_count+=1;
			}
		}
		System.out.println("Even:"+even_count);
		System.out.println("Odd:"+odd_count);
		
		int pos=0,neg=0;
		for(int i=0;i<n;i++) {
				if(arr[i]>=0) {
					pos+=1;
				}
				else {
					neg+=1;
				}
		}
		System.out.println("Positive:"+pos);
		System.out.println("Negative:"+neg);
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2)
                continue;

            int c = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0)
                    c++;
            }

            if (c == 2)
                count++;
        }

        System.out.println("Prime:"+count);
	}

}
