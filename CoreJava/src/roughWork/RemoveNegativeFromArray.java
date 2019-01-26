package roughWork;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNegativeFromArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);al.add(-1);al.add(9);al.add(-3);al.add(-8);al.add(4);
		System.out.println("Without Removing Negative"+al);
		
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext())
		{
			Integer next = itr.next();
			if(next<0)
			{
				itr.remove();
			}
		}
		System.out.println("After Removing Negative"+al);
	}

}
