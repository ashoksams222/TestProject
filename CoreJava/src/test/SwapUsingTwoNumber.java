package test;

public class SwapUsingTwoNumber {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Before Swap");
		System.out.println("X : "+x+" Y : "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swap");
		System.out.println("X : "+x+" Y : "+y);
	}
}
