package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1,n;
		System.out.println("Enter a Number for factorial");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		if(n<0)
		{
			System.out.println("Plz enter Postive Value");
		}
		else
		for(int c=1;c<=n;c++)
		{
			fact=fact*c;
			
		}
		System.out.println(fact);
	}

}
