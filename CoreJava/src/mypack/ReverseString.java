package mypack;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String ar[]) {
		String original;
		String reverse="";
		System.out.println("Enter a String");
		Scanner in = new Scanner(System.in);
		original=in.nextLine();
		int len=original.length();
		for(int i=len-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
		System.out.println("Original String:- "+original);
		System.out.println("Reverse String:- "+reverse);
	}

}
