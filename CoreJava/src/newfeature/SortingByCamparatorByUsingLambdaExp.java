package newfeature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingByCamparatorByUsingLambdaExp {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(15);
		al.add(62);
		al.add(22);
		al.add(31);
		System.out.println(al);

		Comparator<Integer>c=(l1,l2)-> (l1<l2)?-1:(l1>l2)?1:0;
		Collections.sort(al, c);
		System.out.println(al);
	}

}
