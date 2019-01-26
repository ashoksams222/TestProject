package mypack;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int first[]= {1,2,3,4,5};
		int second[]= {7,8,9,4,5,6,7,6};
		int merge[]=new int[first.length+second.length];
		int j=0,k=0,l=0;
		int max =Math.max(first.length, second.length);
		for(int i=0;i<max;i++)
		{
			if(j<first.length)
				merge[l++]=first[j++];
			if(k<second.length)
				merge[l++]=second[k++];
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		System.out.println("Array after merge....");
		System.out.println(Arrays.toString(merge));
	}
	
}
