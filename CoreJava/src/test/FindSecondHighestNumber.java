package test;

import java.util.Arrays;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		int num[]= {45,6,9,2,5,8,6,5,2,25};
		Arrays.sort(num);
		System.out.println("First Highest Number"+num[num.length-1]);
		System.out.println("Second Highest Number"+num[num.length-2]);

	}

}
