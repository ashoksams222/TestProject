package paratics;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int first[]= {4,6,5,8,9,3,3};
		int second[]= {8,9,6,3,5,4,8};
		int merge[]=new int[first.length+second.length];
		int max=Math.max(first.length, second.length);
		int l=0,j=0,k=0;
		for(int i=0;i<max;i++)
		{
			if(j<first.length)
				merge[l++]=first[j++];
			if(k<second.length)
				merge[l++]=second[k++];
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		System.out.println("After Merge");
		System.out.println(Arrays.toString(merge));
	}
	
}
