package test;

import java.util.Scanner;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int reverse=0,n;
		System.out.println("Enter a number for reverse");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Before reverse : "+n);
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println(reverse);
	}

}
