package String;

public class ConcatMethod {
	public static void main(String[] args) {
		
		String s ="   Ashok";
		
		//Three Way we have concat string value in String class
		
		//s=s.concat("Kumar");
		//s=s+"Kumar";
		 s+="  KumarPrasad ";
		System.out.println(s);
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		System.out.println(s.length());
		System.out.println(s.trim());
	}

	
}
