package paratics;

public class FindElement {
public static void main(String[] args) {
	int a[]= {4,9,6,3,8,9};
	int findElement=8;
	int result=find(a,findElement);
	if(result==0)
	{
		System.out.println("Given Element is Not Found");
	}
}
static int find(int a1[],int f1)
{
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]==f1)
		{
			System.out.println("Element Found "+a1[i]+" Index of"+i);
			return 1;
		}
	}
	return 0;
}
}
