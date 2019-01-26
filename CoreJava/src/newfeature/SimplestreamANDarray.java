package newfeature;

import java.util.stream.Stream;

public class SimplestreamANDarray {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(99,56,9,6,85,6,58);
		s.forEach(System.out::println);
		
		Integer ar[]= {45,65,96,85,23};
		Stream.of(ar).forEach(System.out::println);

	}

}
