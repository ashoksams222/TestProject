package roughWork;

public class FindElement {
	public static void main(String[] args) {
		int a[]= {8,9,6,5,2,4,3};
		int findElement=5;
		int result= find(a,findElement);
		if(result==0)
		{
			System.out.println("Element Not Found");
		}
		
	}
	public static int find(int a1[],int f1)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==f1)
			{
				System.out.println("Element Found "+a1[i]+" Index of Element"+i);
				return 1;
			}
		}
		return 0;
	}
	

}
