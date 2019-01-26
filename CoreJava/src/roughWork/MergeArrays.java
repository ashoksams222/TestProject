package roughWork;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		int first[]= {4,9,6,8,3,6,7};
		int second[]= {9,6,3,5,8,2,4,4};
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
		System.out.println("After Merge...");
		System.out.println(Arrays.toString(merge));

	}

}
