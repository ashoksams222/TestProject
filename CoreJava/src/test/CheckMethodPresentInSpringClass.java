package test;

import java.lang.reflect.Method;

public class CheckMethodPresentInSpringClass {
	public static void main(String[] args) {
		int count=0;
		Object o = new String("Ashok");
		Class c = o.getClass();
		System.out.println("Fully Qualified Name of class"+c.getName());
		Method m[]=c.getDeclaredMethods();
		System.out.println("Methods Information");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The total method Name"+count);
	}

}
