package paratics;

import test.Factorial;

public class FactorialRecursion {

	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int fact=0,number=4;
		fact=factorial(number);
		System.out.println(fact);
	}
}
