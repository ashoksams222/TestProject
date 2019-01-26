package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExam {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer l1 = (Integer)o1;
		Integer l2 = (Integer)o2;
		if(l1<l2)
			return +1;
		else if (l1>l2) 
			
		return -1;
		return 0;
	}
	
}
