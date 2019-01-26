package paratics;

public class Reverse {
	public void rev(String str)
	{
		String words[]=str.split(" ");
		String reversestring="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
				
			}
				reversestring=reversestring+reverseword+"";
		}
		System.out.println(str);
		System.out.println(reversestring);
	}
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.rev("Hello i am ashok kumar");
		obj.rev("I am from vasant kunj");
	}
}
	

