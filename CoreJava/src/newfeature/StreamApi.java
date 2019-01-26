package newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println(al);
		List<Integer>al1=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al1);
	}

}
