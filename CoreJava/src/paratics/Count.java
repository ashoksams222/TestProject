package paratics;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		s1=s1.replaceAll("\\s", "").toUpperCase();
		int len=s1.length();
		while(len > 0)
		{
			int count =1;
			for(int i=1;i<len;i++)
			{
				if(s1.charAt(0)==s1.charAt(i)){
					count++;
				}
			}
			if(count < 1)
			{
				
			}
			System.out.println(s1.charAt(0)+" : "+count);
			String character = String.valueOf(s1.charAt(0)).trim();
			s1=s1.replaceAll(character, "");
			len -=count;
			
		}
	}
}
