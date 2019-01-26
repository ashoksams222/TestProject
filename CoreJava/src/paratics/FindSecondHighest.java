package paratics;

import java.util.Arrays;

public class FindSecondHighest {
	
	public static void main(String[] args) {
		int num[]= {4,5,6,9,3,2};
		Arrays.sort(num);
		System.out.println("First Highest number is"+num[num.length-1]);
		System.out.println("Second Highest number is"+num[num.length-2]);
	}
}
