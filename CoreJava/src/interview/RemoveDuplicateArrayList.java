package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {
	public static void main(String[] args) 
    { 
        // input list with duplicates 
        ArrayList<Integer> al = new ArrayList<>( 
            Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5)); 
            // Print the Arraylist 
        System.out.println("ArrayList with duplicates: "
                           + al); 
  
        // Construct a new list from the set constucted from elements 
        // of the original list 
        ArrayList<Integer> al1 = (ArrayList<Integer>) al.stream() .distinct() .collect(Collectors.toList()); 
  
        // Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: "
                           + al1); 
    } 

}
