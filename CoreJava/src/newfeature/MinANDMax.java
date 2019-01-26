package newfeature;

import java.util.ArrayList;

public class MinANDMax {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(2);
		al.add(8);
		System.out.println(al);
		//Now we find min Elements from Collection objects
		Integer min = al.stream().min((l1,l2)->l1.compareTo(l2)).get();
		System.out.println(min);
		
		//Now we find Max vlaue from Collection Objects
		Integer max = al.stream().max((l1,l2)->l1.compareTo(l2)).get();
		System.out.println(max);
	}

}
