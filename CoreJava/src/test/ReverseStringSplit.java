package test;

public class ReverseStringSplit {

	public void reverse(String str)
	{
		String words[]=str.split(" ");
		String reversestring ="";
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword = reverseword+word.charAt(j);
			}
				reversestring = reversestring+reverseword+" ";
		}
		System.out.println(str);
		System.out.println(reversestring);
	}
	public static void main(String[] args) {
		ReverseStringSplit obj = new ReverseStringSplit();
		obj.reverse("hello i a ashok");
		obj.reverse("i am from vasant kunj");
	}
}
