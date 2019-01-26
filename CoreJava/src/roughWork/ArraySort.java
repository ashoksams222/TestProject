package roughWork;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int a[]= {4,9,6,8,3,7,2,5,5,3};
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					
				}
			}
			
		}
		System.out.println("Array After Sort"+Arrays.toString(a));

	}

}
