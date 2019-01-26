package newfeature;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(9);
		al.add(3);
		System.out.println(al);
		
		//Now we apply find every object square operation So we used Consumer predefine functional interface
		/*Consumer<Integer> c=i->{
			System.out.println("The Square of "+i+" is:"+(i*i));
		};
		al.stream().forEach(c);*/
		
		//Seconde Ways ....
		
		al.stream().forEach(i->{
			System.out.println("The SQuare of"+i+"is:"+(i*i));
		});
	}

}
