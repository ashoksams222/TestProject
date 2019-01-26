package interview;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNegative {
	
	public static void main(String[] args) {
	      ArrayList<Integer> al = new ArrayList<Integer>();
	      al.clear();
	      al.add(2);
	      al.add(-3);
	      al.add(4);
	      System.out.println("Array before removing an element "+al);
	      Iterator<Integer> itr = al.iterator();
	      
	         while(itr.hasNext()) {
	         Integer next = itr.next();
	         if(next < 0) {
	            itr.remove();
	         }
	      }
	      System.out.println("Array after removing an element"+al);
	   }
}
