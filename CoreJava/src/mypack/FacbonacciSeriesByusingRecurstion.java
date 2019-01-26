package mypack;

public class FacbonacciSeriesByusingRecurstion {
	int c;
	static int a=0;
	static int b=1;
	public void printFib(int i)
	{
		
		if(i>=1)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}
	public static void main(String[] args) {
		
		System.out.println(a+""+b);
		FacbonacciSeriesByusingRecurstion obj = new FacbonacciSeriesByusingRecurstion();
		obj.printFib(15);
	}
}
