package test;

import java.util.Scanner;

public class SwapByUsingThirdVariable {
	public static void main(String[] args) {
		int x,y,temp=0;
		System.out.println("Enter X And Y value");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Before Swap");
		System.out.println("X : "+x+"Y : "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swap");
		System.out.println("X : "+x+"Y : "+y);
	}

}
