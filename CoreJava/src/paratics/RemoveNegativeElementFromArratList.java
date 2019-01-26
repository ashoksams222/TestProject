package paratics;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNegativeElementFromArratList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(-5);
		al.add(-2);
		al.add(6);
		al.add(-6);
		al.add(9);
		al.add(-1);
		System.out.println("Without Removing Negative Element"+al);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			Integer next = itr.next();
			if(next<0)
			{
				itr.remove();
			}
		}
		System.out.println("After Removing Negative Element "+al);

	}

}
