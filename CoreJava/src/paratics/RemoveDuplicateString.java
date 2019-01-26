package paratics;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String s="ashokkumar";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			Boolean found=false;
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(found==false)
			{
				s1=s1.concat(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(s);
		System.out.println("After Remove Duplicate"+s1);
	}
}