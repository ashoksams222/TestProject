package mypack;

public class ReverseStringInSplitForm {
public void reverse(String str)
{
	String words[] = str.split(" ");
	String reversestring= "";
			for(int i=0;i<words.length;i++)
			{
				String word=words[i];
				String reverseword="";
				for(int j=word.length()-1;j>=0;j--)
				{
					reverseword=reverseword+word.charAt(j);
					
				}
				reversestring=reversestring+reverseword+" ";
			}
	System.out.println(str);
	System.out.println(reversestring);
}

public static void main(String[] args) {
	ReverseStringInSplitForm obj= new ReverseStringInSplitForm();
	
	obj.reverse("this is example of reverse string form" );
	obj.reverse("hello how are you dude");
}
	
}
