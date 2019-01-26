package newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiIncrement5InEveryCollectionObject {
	public static void main(String[] args) {
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(25);
		mark.add(65);
		mark.add(20);
		mark.add(25);
		mark.add(30);
		
		System.out.println(mark);
		List<Integer> al= mark.stream().map(i->i+5).collect(Collectors.toList());
		
		//how we check that how many student are failed
		long noOfStudentFailed =mark.stream().filter(m ->m<30).count();
		
		//how we sort the value on default natural sorting order
		List<Integer> sortedValue=mark.stream().sorted().collect(Collectors.toList());
		
		//how we sort the value on customize sorting order (descending order)
		List<Integer> sortedValueDescending=mark.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		
		//how we sort the value on customize sorting order in another way (descending order)
				List<Integer> sortedValueDescendingAnotherway=mark.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println(al);
		System.out.println("Show only who failed in exam  "+noOfStudentFailed);
		System.out.println("Natural Order Of Sorting "+sortedValue);
		System.out.println("First Way to Customize sorting order "+sortedValueDescending);
		System.out.println("Another way of customize sorting order "+sortedValueDescendingAnotherway);
 	}

}
