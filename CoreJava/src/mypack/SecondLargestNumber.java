package mypack;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args)
	{ 
	int numbers[] = {6,3,37,12,46,5,64,21};
	 
	  Arrays.sort(numbers);
	 
	  System.out.println("Largest Number: "+numbers[numbers.length-1]);
	  System.out.println("Second Largest Number: "+numbers[numbers.length-2]);
	  System.out.println("Third Largest Number: "+numbers[numbers.length-3]);
	 }
}
