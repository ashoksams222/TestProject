package newfeature;

import java.util.ArrayList;

public class ConvertCollectionobjectINTOarrays {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(15);
		al.add(16);
		al.add(96);
		al.add(58);
		System.out.println("Simple Output By ArrayList"+al);
		Integer a[] = al.stream().toArray(Integer[]::new);
		System.out.println("Output After convert Collection object into Arrays");
		for(Integer ar:a)
		{
			System.out.println(ar);

		}
	}
}
