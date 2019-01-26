package paratics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {
		Integer[] geeks = {1,-8,9,6,-2,-6}; 

List<Integer> al =  new ArrayList<Integer>(Arrays.asList(geeks)); 
System.out.println(al); 
	
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
