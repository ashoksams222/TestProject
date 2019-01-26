package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class StringDecendingOrder {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyCamparator());
		t.add("ashok");
		t.add("alok");
		t.add("aman");
		t.add("puja");
		t.add("pooja");
		t.add("nidhi");
		System.out.println(t);
	}

}
class MyCamparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}
