package roughWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArrayToArraysList {

	public static void main(String[] args) {
		String s[]= {"Kabita","Ashok","Mohan","Sohan","Puja"};
		List<String> al = new ArrayList<String>(Arrays.asList(s));
		System.out.println("Without Sort "+al);
		Collections.sort(al);
		
		System.out.println("After Sort  "+al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
