package test;

import java.util.Arrays;

public class MregeArrays {
	public static void main(String[] args) {
		int first[]= {45,6,9,8,3,5,6,8};
		int second[]= {8,9,6,3,5,8,5,5,25,6};
		int merge[]=new int[first.length+second.length];
		int l=0,j=0,k=0;
		int max=Math.max(first.length, second.length);
		for(int i=0;i<max;i++)
		{
			if(j<first.length)
				merge[l++]=first[j++];

			if(k<second.length)
				merge[l++]=second[k++];
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		System.out.println("Arrays After merge...");
		System.out.println(Arrays.toString(merge));
	}

}
