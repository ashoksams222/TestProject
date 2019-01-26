package newfeature;

import java.time.Year;
import java.util.Scanner;

public class CheckLeafYear {
	public static void main(String[] args) {
	System.out.println("Enter a Year ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Year y = Year.of(n);
	if(y.isLeap())
	{
		System.out.printf("%d Year is Leap Year",n);
	}
	else
	{
		System.out.printf("%d is not a leaf year",n);
	}
	}

}
